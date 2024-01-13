
package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.HomeDaoI;
import com.model.Student;
import com.serviceinter.HomeServiceI;

@Service
public class HomeServiceImpl  implements HomeServiceI{

	@Autowired
	HomeDaoI hdi;
	
	@Override
	public void saveStudent(Student s) {
		
		hdi.saveStudent(s);
	}

}
