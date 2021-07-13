import java.util.Scanner;
public class Reservation
{
  public Vaccine gt;
  public Patient pt;
  private String name;
  public String type;
   Scanner read=new Scanner(System.in);
   
   Reservation()
   {
    gt=new Vaccine();
    pt=new Patient();  
    name=" ";
    type=" ";
   }
   
   public void set_name(String name)
   {
    int length = String.valueOf(name).length();
     if(length>0)
      name=name;  
   }
   
   public String get_name()
   {
     return name;    
   }
   
   public void get_vac()
   {
     pt.input();
     // reason of vaccination
      System.out.println("1-vaccine against disease/2-influenza vaccine/3-travel to african country vaccine/4-haj vaccines");
     int n=read.nextInt();
      switch(n)
      {
        case 1:              //vaccine against certain disease
           System.out.print("enter name of disease==>");
             String dis=read.next();
              type=dis;
        break;
        
        case 2:              //influenza vaccine
            type="influenza";
        break;
              
        case 3:              //traveling to an african country
            type="traveling to an african country";
        break;
        
        case 4:              //Haj
           type="going to haj";
        break;
        
        default:type=" ";
        System.out.println("out of range,try again");
      }
       gt.less_quantity();
         reciept(type);
        }
   
   public void reciept(String t)
   {
    System.out.println("---------------------------------------------------------------------");
    System.out.println("\t\t\tReciept\t\t\t");
    pt.print();
    System.out.println("vaccine for==>"+t); 
    System.out.print("alergies==>");
   
    if(pt.allergies.size()!=0)
     {
      for(int i=0;i<pt.allergies.size();i++)
       {
         System.out.print(pt.allergies.get(i)+"\t");
       }
      System.out.println();
     }
     else
      System.out.println("none");
      
     //prescriptions
     System.out.print("prescriptions==>");
    
     if(pt.prescriptions.size()!=0)
     {
      for(int i=0;i<pt.prescriptions.size();i++)
       {
         System.out.print(pt.prescriptions.get(i)+"\t");
       }
       System.out.println();
     }
     else
      System.out.println("none");
  
       //sickness
     System.out.print("sickness==>");
     if(pt.sickness.size()!=0)
     {
      for(int i=0;i<pt.sickness.size();i++)
       {
         System.out.print(pt.sickness.get(i)+"\t");
       }
      System.out.println();
     }
     else
      System.out.println("none");
     
    System.out.println("---------------------------------------------------------------------");
  }
}
