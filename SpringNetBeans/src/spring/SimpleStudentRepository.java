/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Chamara
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class SimpleStudentRepository implements StudentRepository {
    
        Map<String,Student> students=new HashMap<String,Student>();
        public SimpleStudentRepository(){
            Student sarath=new Student("Sarath","ID1","Silva","68,jfd,fefe,kll","A");
        
            students.put(sarath.getID(),sarath);
        
        
        
        }
        
       public void saveStudent(Student stu){
       students.put(stu.getID(),stu);

       }

	public void deleteStudent(Student stu){
        students.remove(stu.getID());
        
        
        }

	public Student findStudent(String studID){
        if(students.containsKey(studID)){
            return students.get(studID);
        }
        else{
            System.out.println("The student cannot be found.\n");
        return null;
        }
        }
 
	public void updateStudent(Student stu){
            boolean exit =false;
            while(!exit){
                System.out.println("1.First Name\n2.ID\n3.Last Name\n4.Address\n5.Grade\n6.Exit");
               
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                switch(a){
                
                    case 1:
                        System.out.println("New first name : \n");
                        String nfname=sc.nextLine();
                        stu.setfName(nfname);
                        break;
                        
                    case 2:
                         System.out.println("New ID : \n");
                        String nID=sc.nextLine();
                        stu.setID(nID);
                        break;
                    case 3:
                         System.out.println("New last name : \n");
                        String nlname=sc.nextLine();
                        stu.setlName(nlname);
                        break;
                    case 4:
                         System.out.println("New address : \n");
                        String naddress=sc.nextLine();
                        stu.setaddress(naddress);
                        break;
                    case 5:
                         System.out.println("New grade : \n");
                        String ngrade=sc.nextLine();
                        stu.setgrade(ngrade);
                        break;
                    case 6:
                        exit=true;
                        break;
                    default : 
                        exit = true;
                        break;
                        
                
                
                
                
                }
            
            
            }
        
        
        }

	public List<Student> findAllStudents(){
        
        return null;
        }
    
}
