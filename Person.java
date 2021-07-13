 import java.util.Scanner;
 public abstract class Person
 {
  Scanner read=new Scanner(System.in);
  protected String first_name;
  protected String last_name;
  protected char gender;
  protected Address add;
  protected String phone;
  
   Person()
   {
    first_name=" ";
    last_name=" ";
    phone=" ";
    gender=' ';
    add=new Address("bengazi","street");
   }
  
    public void set_firstname(String first_name)
   {
    int length = String.valueOf(first_name).length();
     if (length>0)
      this.first_name=first_name;
    else
      System.out.print("error");
   }
  
   public void set_lastname(String last_name)
   {
     int length = String.valueOf(last_name).length();
     if (length>0)
      this.last_name=last_name;
    else
      System.out.print("error");
   }
  
   public void set_gender(char gender)
   {
    if(gender!='F' ||  gender!='M')
     this.gender=gender;
     else
     System.out.print("error");
   }
  
   public void set_phone(String phone)
   {
    int length = String.valueOf(phone).length();
     if(length>=4)
      this.phone=phone;
    else
      System.out.print("error");
   }
   
     /*
   
  */
  // move to employees
  
   public String get_firstname()
   {
    return first_name;   
   }
 
   public String get_lastname()
   {
    return last_name;
   }
  
   public char get_gender()
   {
    return gender;   
   }
   
    public String get_phone()
   {
    return phone; 
   } 
 
   public void input()
   {
    System.out.print("enter first name==>");
        set_firstname(read.next());
     System.out.print("enter last name==>"); 
        set_lastname(read.next());
     System.out.print("enter phone number==>"); 
        set_phone(read.next());
     System.out.print("enter gender==>"); 
        set_gender(read.next().charAt(0));
     System.out.print("enter address==>");
     System.out.print("enter city==>");   
        add.set_city(read.next());
     System.out.print("enter street==>"); 
        add.set_street(read.next());   
   }
   
   public void print()
   {
    System.out.println("first name\tlast name\tgender\tphone\tcity\tstreet");
    System.out.println(get_firstname()+"\t"+get_lastname()+"\t"+get_gender()+"\t"+get_phone()+"\t"+add.get_city()+"\t"+add.get_street()+"\t");    
   }
   
 }
