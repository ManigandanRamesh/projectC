package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

// @RequestMapping(value="/getemployee",method=RequestMethod.POST)
	@RequestMapping("/getEmployee")
	public String getData(@RequestParam(name = "id") String id) {
		int empId = Integer.parseInt(id);
		Employee emp = EmployeeDao.getEmployeeById(empId);
		return emp.getFirst_name() + ", " + emp.getLast_name() + ", " + emp.getJob_id() + ", " + emp.getSalary() + ", "
				+ emp.getHire_date() + ", " + emp.getEmail();
	}


	@RequestMapping(value = "/newemployee", method = RequestMethod.POST)
	public int addNewEmployee() {
		return 0;
	}

	@RequestMapping(value = "/updateemployee", method = RequestMethod.PUT)
	public int modifyEmployee() {
		return 1;
	}

	@RequestMapping(value = "/removeemployee", method = RequestMethod.DELETE)
	public int deleteEmployee() {
		return 2;
	}
}
