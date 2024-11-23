package com.StudentMarkSheet.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheet.Entity.StudentMarkSheet;
import com.StudentMarkSheet.Repository.StudentMarkSheetRepository;

@Repository
public class StudentMarkSheetDao {

	@Autowired
	StudentMarkSheetRepository sr;

	public StudentMarkSheet getPost(StudentMarkSheet a) {
		return sr.save(a);
	}
}
