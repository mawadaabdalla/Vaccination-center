import java.util.Scanner;
public class Vaccine_Center
{
 Scanner read=new Scanner(System.in);
  private String name;
  public Address Add;
  private String phone;
  private String creation_year;
  Vaccine []c=new Vaccine[2];
  Employee e=new Office_emp();
  Employee n=new Nurse();
  Reservation gv=new Reservation();
  Vaccine_Center()
  {
    name=" ";  
    phone=" ";
    creation_year=" ";
    Add=new Address("city","street");  
    n=new Nurse();
    e=new Office_emp();
    
  }
  
  public void set_name(String name)
  {
    int length = String.valueOf(name).length();
     if (length>0)
      this.name=name;
    else
    System.out.print("error");
  }
  /*
  public void set_empnum(int emp_num)
  {
   if(emp_num!=0)
    this.emp_num=emp_num;
  }
  */
  public void set_phone(String phone)
  {
   int length = String.valueOf(phone).length();
     if (length>0)
      this.phone=phone;
    else
    System.out.print("error");
  }
  
  public void set_creationyear(String creation_year)
  {
   int length = String.valueOf(creation_year).length();
     if (length>0)
      this.creation_year=creation_year;
    else
    System.out.print("error");
  }
  
  public String get_name()
  {
     return name;
  }
  
   public String get_phone()
  {
    return phone;
  }
  
   public String get_creationyear()
  {
    return creation_year;
  }
  
  public void input()
  {
   System.out.print("enter name of vaccine center==>");   
    set_name(read.next());
   System.out.print("enter phone number==>");  
    set_phone(read.next());
   System.out.print("enter city==>");  
    Add.set_city(read.next());
   System.out.print("enter street==>");  
    Add.set_street(read.next());
   System.out.print("enter creation year==>"); 
    set_creationyear(read.next());
  }
  
  public void print()
  {
   System.out.println("name\tphone\tcity\tstreet\tcreation year");   
   System.out.println(get_name()+"\t"+get_phone()+"\t"+Add.get_city()+"\t"+Add.get_street()+"\t"+"\t"+get_creationyear());
  }
    
  public void change_name()
  {
   System.out.print("enter new name==>");
    set_name(read.next());
   System.out.println("name changed to "+name);
  }
  
  public void change_phone()
  {
   System.out.print("enter new phone number==>");
    set_phone(read.next());
   System.out.println("phone number changed to "+phone);
  }
  
  public void switchl()
  {
    int x;  
    do{
     System.out.println("0-stop/1-input/2-print/3-change name/4-change phone/");    
     x=read.nextInt();
     
       switch(x)
       {
        case 1:               
           input();
        break;
        
        case 2:              
           print();
        break;
        
        case 3:             
           change_name();  
        break;
        
        case 4:             
           change_phone();
        break;
        
        default:System.out.println("System stopped");
        }
    }while(x!=0);
  
   }
}
