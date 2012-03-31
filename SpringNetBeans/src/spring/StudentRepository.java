/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Chamara
 */
import java.util.List;
public interface StudentRepository {
    




	void saveStudent(Student stu);

	void deleteStudent(Student stu);

	Student findStudent(String studID);

	void updateStudent(Student stu);

	List<Student> findAllStudents();


    
}
