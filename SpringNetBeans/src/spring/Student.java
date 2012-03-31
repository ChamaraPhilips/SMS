/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Chamara
 */
public class Student{

   private  String firstname;
   private  String ID;
   private String lastname;
   private String address;
   private String grade;

    /**
     * @param args the command line arguments
     */
   public Student(String firstname, String ID,String lastname, String address, String grade){
   this.firstname=firstname;
   this.ID=ID;
   this.lastname=lastname;
   this.address=address;
   this.grade=grade;
   }
   public String getID(){
     return this.ID;
   }
   public void setfName(String fname){
   this.firstname=fname;
   }
   public void setID(String nID){
   this.ID=nID;
   }
   public void setlName(String lname){
   this.lastname=lname;
   }
   public void setaddress(String address){
   this.address=address;
   }
   public void setgrade(String grade){
   this.grade=grade;
   }
   
   /////
   public String getfName(){
     return this.firstname;
   }
   public String getlName(){
     return this.lastname;
   }
   public String getadd(){
     return this.address;
   }
   public String getGrade(){
     return this.grade;
   }
}
