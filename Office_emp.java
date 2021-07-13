import java.util.Scanner;
public class Office_emp extends Person implements Employee
{
  Scanner read=new Scanner(System.in);
   private String position;
   private String department;
   private int extra_hours;
   public double totalsalary;
   public double bonus;
   protected String nationality;
   protected int joinedyear;
   protected double salary;
   final static int hour=8;
   protected String qualification;
   protected static int id;
  
   Office_emp()
   {
     position=" ";
     department=" ";
     extra_hours=0;  
   }
   
   public void set_position(String position)
   {
      if(position!=" ")
      {
       this.position=position;  
        }
   }
   
   public void set_department(String department)
   {
      if(department!=" ")
      {
       this.department=department;  
        }
   }
   
   public void set_extra_hours(int extra_hours)
   {
      if(extra_hours<=8)
      {
       this.extra_hours=extra_hours;  
      }
   }
   
   public void set_nationality(String nationality)
   {
    int length = String.valueOf(nationality).length();
     if (length>0)
      this.nationality=nationality;
    else
      System.out.print("error");
   }
   
   public void set_joinedyear(int joinedyear)
   {
     if(joinedyear>0)
      this.joinedyear=joinedyear;
   }
   
   public void set_qualification(String qualification)
   {
    int length = String.valueOf(qualification).length();
     if (length>0)
      this.qualification=qualification;
    else
      System.out.print("error");
   }
   
   public void set_salary(double salary)
   {
    if(salary!=0)
     this.salary=salary;
   }
   
   public String get_position()
   {
    return position;   
   }
   
   public String get_department()
   {
    return department;   
   }
   
   public int get_extrahours()
   {
    return extra_hours;   
   }
   
   public double get_salary()
   {
    return salary; 
   }
   
   public String get_qualification()
   {
    return qualification;  
   }
   
   public int get_joinedyear()
   {
    return joinedyear;   
   }
   
   public String get_nationality()
   {
    return nationality;  
   }
   
   public void input()
   {
    super.input();
    System.out.print("enter joined year==>");
      set_joinedyear(read.nextInt());
    System.out.print("enter nationality==>");
       set_nationality(read.next());
    System.out.print("enter salary==>");
       set_salary(read.nextDouble());
    System.out.print("enter qualifications==>");
      set_qualification(read.next());
    System.out.print("enter position==>");
     set_position(read.next());
    System.out.print("enter department==>");
     set_department(read.next());
    System.out.print("enter number of extra hours==>");
     set_extra_hours(read.nextInt());
    }
    
   public double calcbonus()
   {
    bonus=extra_hours*20;  
    return bonus;
    }
    
   public double calcsal()
   {
     totalsalary=salary+calcbonus();
     return totalsalary;   
   }
   
   public void print()
   {
    super.print(); 
    System.out.println("position\tdepartment\textra hours\ttotalsalary");
    System.out.println(get_position()+"\t"+get_department()+"\t"+get_extrahours()+"\t"+calcsal());
    System.out.println("-------------------------------------------------------------------------------------------------------");
   }
   
   public void switchl()
   {
       int x;  
    do{
     System.out.println("0-stop/1-input/2-calculate bonus/3-calculate totalsalary/4-print");    
     x=read.nextInt();
     
       switch(x)
       {
        case 1:               
           input();
        break;
        
        case 2:              
           System.out.println("bonus is==> "+calcbonus());  
        break;
        
        case 3:             
           System.out.println("total salary is==> "+calcsal());  
        break;
        
        case 4:             
           print();  
        break;
        
        default:System.out.println("System stopped");
        }
    }while(x!=0);
  
   }
   
}
