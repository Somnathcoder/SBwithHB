package com.springand.hibernate.SBwithHB.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springand.hibernate.SBwithHB.Model.Student;

@Repository
public class StudentDao {

	
	Student std = new Student();

	
	@Autowired
	SessionFactory sf;

	
	
	public List<Student> getalldata() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		List<Student> list = cr.list();
		session.close();
		return list;
	}
	

	public boolean datainsert(Student stduent) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.save(stduent);
		tr.commit();
		session.close();

		return true;
	}

	public Student getdatabybyid(int id) {
		Session session = sf.openSession();
		Student std = session.get(Student.class, id);
		session.close();
		return std;
	}
	

	
	public boolean deletbyid(int id) {
		Session session = sf.openSession();
		Student std = session.get(Student.class, id);
		System.out.println(std);
		Transaction tr = session.beginTransaction();
		session.delete(std);
		tr.commit();
		session.close();
		return true;

	}


	public boolean updatebyid(int id, Student student) {
		
		Session session = sf.openSession();
		Student std = session.get(Student.class, id);
			std.setName(std.getName());
			std.setEmail(std.getEmail());
		Transaction tr = session.beginTransaction();
		
		session.update(student);
		tr.commit();
		session.close();
		return true;

		
	}
	
	

}
