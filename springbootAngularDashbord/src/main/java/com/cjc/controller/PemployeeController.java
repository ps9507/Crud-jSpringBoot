package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.PermanentEmployee;
import com.cjc.serviceI.PemployeeServiceI;

@RestController
@CrossOrigin("*")
public class PemployeeController {
     @Autowired
     PemployeeServiceI ps;
     
     @PostMapping("/save")
     public String saveData(@RequestBody PermanentEmployee pe)
     {
    	 ps.permanentEmployeeSave(pe);
    	 return "Saved PermanentEmployee ";    
     }
     @DeleteMapping("/delete/{peid}")
     public String deleteData(@PathVariable ("peid") int peid)
     {
    	 ps.permanentEmployeeDelete(peid);
    	 return "Delete the PermanentEmployee";
     }
     @PutMapping("/update")
     public String UpdateData(@RequestBody PermanentEmployee pe)
     {
    	 ps.permanentEmployeeSave(pe);
    	 return"Update the PermanentEmployee";
     }
     @GetMapping("edit/{peid}")
     public PermanentEmployee editData(@PathVariable ("peid") int peid)
     {
    	return ps.permanentEmployeeEdit(peid);
     }
     @GetMapping("/findall")
     public List<PermanentEmployee> findAllData(@RequestBody PermanentEmployee pe)
     {
    	 return ps.permanentEmployeeFindAllData(pe);
     }
}