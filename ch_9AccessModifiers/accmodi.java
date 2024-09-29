package ch_9AccessModifiers;
 class MyEmployee{
    String name;
    int id;
public void setname(String n){
  name = n;
}
public String getname(){
    return name;
}

public void setid(int i){
    id = i;
}
public int getid(){
    return id;
}
 }
public class accmodi {
    public static void main(String[] args) {
        MyEmployee shiwani = new MyEmployee()  ;
         shiwani.setid(3);
         shiwani.setname("Jaatni");
         System.out.println(shiwani.getid());
        System.out.println(shiwani.getname());
    }
    
}
