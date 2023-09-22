package dto;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student 
{      
	    @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		 int id;
	     String name;
	     String email;
	     long mobile;
	     String gender;
	     LocalDate dob;
	     int math;
	     int sci;
	     int eng;
	     double percentage;
	     String result;
		
		
	}


