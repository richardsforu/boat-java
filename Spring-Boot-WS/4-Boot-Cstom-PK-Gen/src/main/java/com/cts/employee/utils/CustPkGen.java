package com.cts.employee.utils;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustPkGen implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		Object x=session.createNativeQuery("select count(*) from customer").uniqueResult();
		
		String i=x.toString();
		
		int n=Integer.parseInt(i);
		
		String key = "CUSTABC"+System.currentTimeMillis()+n;
		
		return key;
	}

}
