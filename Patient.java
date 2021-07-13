import java.util.Scanner;
import java.util.ArrayList;
public class Patient extends Person
{
 Scanner read=new Scanner(System.in);
 private int age;
 public ArrayList<String> allergies;
 public ArrayList<String> prescriptions;
 public ArrayList<String> sickness;
 
  Patient()
  {
   age=0;
   this.allergies = new ArrayList<String>();
   this.prescriptions = new ArrayList<String>();
   this.sickness = new ArrayList<String>();
  }
 
  public void set_age(int age)
  {
    if(age>0)
     this.age=age;
    else
     System.out.print("error");
  }
  
  public int get_age()
  {
   return age;    
  }
    
  public void input()
  {
    super.input();                        //input from father class
   System.out.print("enter age==>"); 
      age=read.nextInt();
   System.out.print("do they have any allergies/true=yes/false=no==>");      
      boolean f=read.nextBoolean();
       if(f==true)
       {
         System.out.print("enter number of allergies==>");
           int l=read.nextInt();
            for(int i=0;i<l;i++)
            {
             System.out.print("enter allergy==>");
             allergies.add(read.next());
            }
       
       }
   System.out.print("do they have any prescripted medication/true=yes/false=no==>");      
      boolean g=read.nextBoolean();
        if(g==true)
        {
         System.out.print("enter number of prescripted medication==>");
           int m=read.nextInt();
            for(int i=0;i<m;i++)
            {
             System.out.print("enter prescription==>");
             prescriptions.add(read.next());
            }
       }
   System.out.print("do they have any diseases they suffer from/true=yes/false=no==>");      
      boolean h=read.nextBoolean();
        if(h==true)
        {
         System.out.print("enter number of diseases they have==>");
           int q=read.nextInt();
            for(int i=0;i<q;i++)
            {
             System.out.print("enter diseases==>");
             sickness.add(read.next());
            }
       }
    }
    
  public void print()
  {
    super.print();                        //print from father class
    System.out.println("age==>"+get_age());
      
  }

  }

