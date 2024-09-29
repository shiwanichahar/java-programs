package ch_8OOPs;

import ch_3Strings.string;

class Employee{
    int id;
    String name;
 
public void printdetails(){
 System.out.println("The id is:" + id);
 System.out.println("The name is:" + name);
}
}
public class defineclass {
    public static void main(String[] args) {
         Employee Shiwani = new Employee();
         Shiwani.id= 1;
         Shiwani.name= "Shiwani Chahar" ;

         Employee Chetan = new Employee();
         Chetan.id= 2;
         Chetan.name= " Chetan Chahar" ;


//System.out.println(Shiwani.id);
Shiwani.printdetails();
Chetan.printdetails();
    }
    
}
