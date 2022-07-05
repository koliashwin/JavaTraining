package com.demo.businesslogic;



import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.util.HibernateUtil;

public class ProductRepo {

	static Session session = null;
	static Transaction trans = null;
//	static SessionFactory sessionfactory = null;

	// logic part create product or add product
	public static Product createProduct(Product p) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(p);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		return p;

	}

	// view product
	public static void viewProduct() {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		
		Query query = session.createQuery("from Product");
		List<Product> pList = query.list();
		
		for(Product p:pList) {
			System.out.println("product name : "+p.getName()+"\t color :"+p.getColor()+"\t desc. : "+p.getDescription());
		}
		
		trans.commit();
		session.close();

	}

	// update product
	public static Product updateProduct(long id,String name, String color, String desc) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		
		Product p = (Product) session.get(Product.class, id);
		p.setColor(color);
		p.setName(name);
		p.setDescription(desc);
		trans.commit();
		session.close();
		 
		return p;
	}

// delete product
	public static Product deleteProductByid(long id) {
		
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		
		Product p = (Product) session.get(Product.class, id);
		try {
			session.delete(p);
		}catch(IllegalArgumentException e) {
			
			System.out.println("Delete id doesn't exist : " +e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("something went wrong "+e.getMessage());
		}
		
		trans.commit();
		session.close();
		return p;

	}

}
