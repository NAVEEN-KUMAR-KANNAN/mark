package com.StudentMarkSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheet.Entity.StudentMarkSheet;
import com.StudentMarkSheet.Service.StudentMarkSheetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/studentmark")
public class StudentMarkSheetController {

	@Autowired
	StudentMarkSheetService ss;
	
	@PostMapping(value="/post")
	public StudentMarkSheet getPost(@RequestBody StudentMarkSheet a) {
		return ss.getPost(a);
	}
	
}
