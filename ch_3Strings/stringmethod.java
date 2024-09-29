package ch_3Strings;

public class stringmethod {
    public static void main(String[] args) {
        String name = "Shiwaniani";
    System.out.println(name.length());
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.trim());
    System.out.println(name.substring(1));
    System.out.println(name.substring(2,7));
    System.out.println(name.replace('S','B'));
    System.out.println(name.startsWith("Sh"));
    System.out.println(name.endsWith("ani"));
    System.out.println(name.charAt(5));
    System.out.println(name.indexOf("hi"));
    System.out.println(name.indexOf("ani", 5));
    System.out.println(name.lastIndexOf("an"));
   System.out.println(name.lastIndexOf("ani",5));
    System.out.println(name.equals("Shiwaniani"));
  ;
    }

    

    
}
