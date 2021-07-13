import java.util.Scanner;
public class Nurse extends Person implements Employee
{
  private int shift; //in hours
  public double tsalary;
  public double bonus;
  private String nationality;
  private int joinedyear;
  private double salary;
   final static int hour=8;
  private String qualification;
  private static int id;
  
   
   Nurse()
   {
    shift=8;   
   }
   
   public void set_shift(int shift)
   {
     if(shift==8 || shift==12)
       this.shift=shift;    
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
   
   public void set_nationality(String nationality)
   {
    int length = String.valueOf(nationality).length();
     if (length>0)
      this.nationality=nationality;
    else
      System.out.print("error");
   }
   
   public int get_shift()
   {
     return shift; 
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
    System.out.print("enter shift 8 or 12==>");
     set_shift(read.nextInt());
   }
   
   public void print()
   {
    super.print();
    System.out.println("shift\ttsalary");
    System.out.println(shift+"\t"+calcsal());
    System.out.println("-------------------------------------------------------------------------------------------------------");
   }
   
   public double calcbonus()
   {
    if(nationality!="libyan")
     bonus=get_shift()*30;
    else
     bonus=get_shift()*20;
    return bonus;
   }
    
   public double calcsal()
   {
    tsalary=salary+calcbonus();
    return tsalary;
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
