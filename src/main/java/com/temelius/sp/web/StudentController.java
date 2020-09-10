package com.temelius.sp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import com.temelius.sp.domain.Student;

@Controller
public class StudentController {

	@RequestMapping("/students")
	public String studentlist(Model model) {
		Student s1 = new Student("Marko", "Miettinen");
		Student s2 = new Student("Maija", "Meikäläinen");
		Student s3 = new Student("Irma", "Hämäläinen");
		Student s4 = new Student("Matti", "Maatikka");
		
		List<Student> sl = new ArrayList<Student>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		
		model.addAttribute("students", sl);
		
		return "studentlist";
	}

}
