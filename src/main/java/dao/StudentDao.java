package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import dto.Student;

@Component
public class StudentDao {

	@Autowired
	EntityManager entityManager;

	public void save(Student student)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		
		
		
	}

	public List<Student> fetch() {
		
		return entityManager.createQuery("select x from Student x").getResultList();
	}
	public Student fetch(int id)
	{
		return entityManager.find(Student.class, id);
	} 

	public void delete(Student student) {
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		
	}
}

