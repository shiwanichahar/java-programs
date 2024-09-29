package ch_8OOPs.practice8;
 
class Employee {
    int salary ;
    String name;

    public int getsalary(){
  return salary;
    }

    public String getname(){
        return name ;
    }

    public void setname( String n){
  name = n;
    }
    public void printdetails(){
        System.out.println("Salary:"+ salary);
        System.out.println("Name:" + name);
    }
}
public class Employeedet {
    
    public static void main(String[] args) {
         
        Employee a = new Employee();
        a.salary = 34;
        a.name = "Sheenu Chaudhary";
        a.printdetails();
         int b =   a.getsalary();
         System.out.println(b);

         String c = a.getname();
         System.out.println(c);

       
}
}
