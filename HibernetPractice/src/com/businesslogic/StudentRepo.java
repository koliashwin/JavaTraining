package com.businesslogic;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Students;
import com.factory.MyUtil;

public class StudentRepo {

	static Session session = null;
	static Transaction trans = null;
	
	public static Students createStudent(String name, String course) {
		session = MyUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		Students s = new Students(name, course);
//		s.setName(name);
//		s.setCourse(course);
		session.save(s);
		trans.commit();
		session.close();
		return s;
	}
	
	public static Students deleteStudentById(long id) {
		session = MyUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		Students s = (Students) session.get(Students.class, id);
		try {
			session.delete(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		trans.commit();
		session.close();
		return s;
	}
	
	public static Students updateStudent(long id, String name, String course) {
		session = MyUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		Students s = (Students) session.get(Students.class, id);
		s.setCourse(course);
		s.setName(name);
		trans.commit();
		session.close();
		return s;
	}
	
	public static void getStudent(long id) {
		session = MyUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		Students s = (Students) session.get(Students.class, id);
		
		try {
			System.out.println("id : "+s.getId()+" name : "+s.getName()+ " course : "+s.getCourse()); 
		}catch(NullPointerException e) {
			System.out.println("id doesn't exists "+e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		trans.commit();
		session.close();
		
	}
	
	public static void viewStudentList() {
		session = MyUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		Query query = session.createQuery("From Students");
		List<Students> sList = query.list();
		
		for(Students s:sList) {
			System.out.println("id : "+s.getId()+" name : "+s.getName()+ " course : "+s.getCourse()); 
		}
		
		trans.commit();
		session.close();
	}

}
