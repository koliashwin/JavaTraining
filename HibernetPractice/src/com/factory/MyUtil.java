package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MyUtil {

	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		
		Configuration configObj = new Configuration();
		configObj.configure("practice.cfg.xml");
		
		ServiceRegistry SRObj = new ServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
		SessionFactory sf = configObj.buildSessionFactory(SRObj);
		return sf;

	}

}
