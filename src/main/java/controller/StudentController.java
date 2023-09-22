package controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.StudentDao;
import dto.Student;
import service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
    StudentService  service;
	@RequestMapping("/")
	public String loadHome()
	{
		return "Home";
	}
	
	@GetMapping("/insert")
	public String loadInsert()
	{
		return "insert";
	}
	
	@PostMapping("/insert")
	
	public String insert(@ModelAttribute Student student,@RequestParam String date ,ModelMap map)                         
	{
//		student.setDob(LocalDate.parse(date));
//		System.out.println(student);
//		StudentDao studentdao=new StudentDao();
//		System.out.println(studentdao);
		
//		dao.save(student);
		return service.save(student,date,map);
		}
	
	@GetMapping("/fetch")
	public String fetch(ModelMap map)
	{
		return service.fetch(map);
	}
	
	@GetMapping("/update")
	public String update(ModelMap map, @ModelAttribute Student student)
	{
		return service.Update(map, student);
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id,ModelMap map)
	{
		return service.delete(id,map);
	}
}

