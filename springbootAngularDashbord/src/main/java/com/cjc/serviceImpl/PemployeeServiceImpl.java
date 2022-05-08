package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.PermanentEmployee;
import com.cjc.repositery.PemployeeRepositery;
import com.cjc.serviceI.PemployeeServiceI;

@Service
public class PemployeeServiceImpl implements PemployeeServiceI {
	@Autowired
	PemployeeRepositery pr;

	@Override
	public void permanentEmployeeSave(PermanentEmployee pe) {
		// TODO Auto-generated method stub
		     pr.save(pe);
	}

	@Override
	public void permanentEmployeeDelete(int peid) {
		// TODO Auto-generated method stub
		pr.deleteById(peid);
		
	}

	@Override
	public PermanentEmployee permanentEmployeeEdit(int peid) {
		// TODO Auto-generated method stub
		return pr.findById(peid).get();
	}

	@Override
	public List<PermanentEmployee> permanentEmployeeFindAllData(PermanentEmployee pe) {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
