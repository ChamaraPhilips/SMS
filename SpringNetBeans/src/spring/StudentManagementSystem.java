/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Chamara
 */
import java.util.*;
import java.sql.*;

public class StudentManagementSystem implements StudentRepository{

   
    private Connection con;
    private Statement stmt;
   
   
    public void ConnectToDatabase(String userName,String password){
       
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql:///S",
                userName,password );
        } catch (SQLException e) {
            System.out.println("Error in SQL Connection..");
            e.printStackTrace();
        }

          try {
            if(!con.isClosed())
                System.out.println("Connected Sucessfully.");
        } catch (SQLException e) {
            System.out.println("Error in SQL Connection..");
            e.printStackTrace();
        }
       
    }
   
    public void CreateStudent(String firstName,String lastName,String indexNo,String address){
       
       
        stmt=null;
        String querry="use StudentManagementSystem;";
        try{
        stmt=con.createStatement();
        stmt.execute(querry);
        firstName="'"+firstName+"'";
        lastName="'"+lastName+"'";
        indexNo="'"+indexNo+"'";
        address="'"+address+"'";
        System.out.println("Insert into studdata values ("+firstName+","+lastName+","+indexNo+","+address+");");
        stmt.execute("Insert into studdata values ("+firstName+","+lastName+","+indexNo+","+address+");");
        }catch(SQLException e){
            System.out.println("SQL statement Error");
        }
       
    }

   
    public void saveStudent(Student std){
       
        String querry="use StudentManagementSystem;";
       
        try{
            stmt=con.createStatement();
            stmt.execute(querry);
          String fName=""+std.getfName()+"'";
          String     lName="'"+std.getlName()+"'";
          String    ID="'"+std.getID()+"'";
          String    add="'"+std.getadd()+"'";
            System.out.println("Insert into studdata values ("+fName+","+lName+","+ID+","+add+");");
            stmt.execute("Insert into studdata values ("+fName+","+lName+","+ID+","+add+");");
            }catch(SQLException e){
                System.out.println("SQL statement Error");
               
            }
           
      //  return true;
    }
   
   
    public Student Find(String indexNo){
       
            String querry="use StudentManagementSystem;";
       
        try{
            stmt=con.createStatement();
            stmt.execute(querry);
             ResultSet rs=    stmt.executeQuery("Select * from studdata Where studIndex='"+indexNo+"';");
            if(rs==null){
               
                System.out.println("Match Not Found");
            }else{
               
                while(rs.next()){
                   
                    System.out.println("Name:"+rs.getString(0)+" "+rs.getString(1)+"<--->"+"IndexNo:"+rs.getString(3)+"<--->"+"Address:"+rs.getString(4));
                }
               
            }
            
       
            }catch(SQLException e){
                System.out.println("SQL statement Error");
               
            }
        return null;
       
    }
   
   public void deleteStudent(Student stu){
   try{
      stmt.execute("Delete from studdata where studIndex='"+stu.getID()+"';");
      
       
   }catch(SQLException e){
   ///////
   }
   }

	public Student findStudent(String studID){
        return null;
        }

	public void updateStudent(Student stu){
        
        
        }

	public List<Student> findAllStudents(){
        return null;
        }
   
}
