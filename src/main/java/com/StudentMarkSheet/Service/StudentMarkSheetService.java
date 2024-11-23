package com.StudentMarkSheet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheet.Dao.StudentMarkSheetDao;
import com.StudentMarkSheet.Entity.StudentMarkSheet;

@Service
public class StudentMarkSheetService {

	@Autowired
	StudentMarkSheetDao sd;

	public StudentMarkSheet getPost(StudentMarkSheet a) {
		int g=a.getSem1Total();
		g=(a.getSem1Theory()+a.getSem1Practicals());
		a.setSem1Total(g);
		int h=a.getSem2Total();
		h=(a.getSem2Theory()+a.getSem2Practicals());
		a.setSem2Total(h);
		return sd.getPost(a);
	
	}
}
