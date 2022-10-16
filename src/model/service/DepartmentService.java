package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartentDao();
	
	public List<Department> findAll() {
		
		return dao.findAll();
		
	}

}
