package com.springand.hibernate.SBwithHB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springand.hibernate.SBwithHB.Dao.StudentDao;
import com.springand.hibernate.SBwithHB.Model.Student;

@Service
@Component
public class StudentService {
	
	@Autowired
	StudentDao dao;
	

	

	
	
	public List<Student> getalldata() {
		List<Student> ll=	dao.getalldata();
		return ll;
	}



	



	public boolean insertdata(Student stduent) {
		boolean bb=	dao.datainsert(stduent);
		return bb;
	}







	public Student getdatabyid(int id) {
		
		return dao.getdatabybyid(id);
	}







	public boolean deletbyid(int id) {
	return	dao.deletbyid(id);
		
	}







	public boolean updatebyid(int id, Student student) {
		return dao.updatebyid(id,student);
		
	}








}
