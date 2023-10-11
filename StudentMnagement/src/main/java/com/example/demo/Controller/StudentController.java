package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Student;
import com.example.demo.services.StudentServices;

@Controller
public class StudentController {
	StudentServices ss;
	public StudentController(StudentServices ss) {
		super();
		this.ss = ss;
	}
	@GetMapping
	public String getAllStudent(Model model){
		List<Student>slist=ss.getAllstudent();
		model.addAttribute("list",slist);
		return "showInfo";
		
	}
	@PostMapping("/addStud")
	public String addStudent(@RequestParam("roll") String roll,@RequestParam("name")String name,@RequestParam("branch") String branch) {
		Student st= new Student(roll,name,branch);
		ss.addStudent(st);
		return "index";
		
	}
	@PutMapping("/updStud")
	public String updateStudent(@RequestParam("roll") String roll,@RequestParam("name")String name,@RequestParam("branch") String branch) {
		Student st=ss.getStudent(roll);
		st.setName(name);
		st.setBatch(branch);
		ss.updateStudent(st);
		return "redirect:/";
		
	}
	@DeleteMapping("/dltStud")
	public String deleteStudent(@RequestParam("roll") String roll) {
	ss.deleteStudent(roll);
		return "redirect:/";
		
	}
	@GetMapping("/getStud")
	public String getStudent(@RequestParam("roll") String roll,Model model) {
	Student st=ss.getStudent(roll);
	model.addAttribute("student",st);
		return "showInfo";
		
	}
	@GetMapping("/viewI")
  public String mapViewStudent() {
	  return "viewInfo";
  }
	@GetMapping("/register")
	  public String register() {
		  return "register";
	  }
	
	@GetMapping("/updateI")
	  public String update() {
		  return "updateInfo";
	  }
	@GetMapping("/removeI")
	  public String delete() {
		  return "removeInfo";
	  }
	@GetMapping("/index")
	  public String index() {
		  return "index";
	  }
	@GetMapping("/showI")
	  public String show() {
		  return "showInfo";
	  }
	
	
}
