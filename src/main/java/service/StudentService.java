package service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import dao.StudentDao;
import dto.Student;

@Component
public class StudentService {
	
	@Autowired
	StudentDao studentdao;

	public String save(Student student, String date, ModelMap map) {
		double percentage=(student.getEng()+student.getMath()+student.getSci())/3.0;
	    student.setPercentage(percentage);
	    if(student.getEng()<35 || student.getMath()<35|| student.getSci()<35)
         student.setResult("Fail");
	    else {
	    	if(percentage>=85)
	    		student.setResult("Distinction");
	    	if(percentage>=60)
	    		student.setResult("FirstClass");
	    	else
	    		student.setResult("SecondClass");
	    	}
	    
//	    student.setDob(LocalDate.parse(date));
//            studentdao.save(student);
	    map.put("msg","Data Added Succesfully");
	    studentdao.save(student);
            return "Home";
	
	}

	public String fetch(ModelMap map) {
		List<Student> students=studentdao.fetch();
		if(students.isEmpty())
		{
			map.put("fail", "Dtata not found");
			return "Home";
		}
		else {
			map.put("pass", "Data Found");
			map.put("list", students);
	     	return "Fetch";
	}
	
	}

	public String delete(int id,ModelMap map) {
		 Student student=studentdao.fetch(id);
		 if(student==null)
		 {
			 map.put("fail","Data Alerady Deleted");
		 }
		 else {
			 studentdao.delete(student);
			 map.put("fail","Data Deleted Success");
			 
		 }
		 List<Student> students=studentdao.fetch();
				if(students.isEmpty())
				{
					map.put("fail", "Data Not Found");
					return "Home";
				}
				else {
					map.put("pass", "Data Found");
					map.put("list", students);
			     	return "Fetch";
			}
	}

	public String Update(ModelMap map, Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}
