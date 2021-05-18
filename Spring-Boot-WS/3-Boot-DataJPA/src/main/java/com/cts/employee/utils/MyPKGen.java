package com.cts.employee.utils;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyPKGen implements IdentifierGenerator{
	
	 @Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		 String pk=null;

		 long time=System.currentTimeMillis();
		 
		 pk="ABC"+time+"";
		 
		return pk;
	}

}
