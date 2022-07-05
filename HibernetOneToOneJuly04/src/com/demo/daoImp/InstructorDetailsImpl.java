package com.demo.daoImp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.dao.InstructorDetailsDao;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetails;
import com.demo.util.HibernateUtil;

public class InstructorDetailsImpl implements InstructorDetailsDao{

	static Session session = null;
	static Transaction trans = null;
	
	@Override
	public void saveInstructorDetails(InstructorDetails instructorDetail) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(instructorDetail);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
//		return p;
		
	}

	@Override
	public void updateInstructorDetails(InstructorDetails instructorDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInstructorDetails(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor getInstructorDetailsById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
