package com.cts.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.entity.Employee;

@Repository
public class EmployeeDaoImpl {

	// sessionFactory

	@PersistenceContext
	private EntityManager em; // indicates a database - single threaded

	// save record

	@Transactional
	public void saveEmployee(Employee emp) {
		em.persist(emp);
	}

	// list all employees
	@Transactional
	public List<Employee> listAll() {
		
		//Session s1=sf.openSession();
		//Query<Employee> q1=s1.createQuery("from Employee");
		//List<Employee> emps=q1.list();
		//return emps;
		return em.createQuery("from Employee").getResultList();
	}

}
