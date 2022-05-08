package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.PermanentEmployee;

public interface PemployeeServiceI {

	void permanentEmployeeSave(PermanentEmployee pe);

	void permanentEmployeeDelete(int peid);

	PermanentEmployee permanentEmployeeEdit(int peid);

	List<PermanentEmployee> permanentEmployeeFindAllData(PermanentEmployee pe);

}
