import java.util.Scanner;
public class Date
{
   private int day;
   private int month;
   private int year;
   Scanner read=new Scanner(System.in);
   Date()    //constracter
   {
    day=0;
    month=0;
    year=0;
   }
   
   public void set_day(int day)
   {
    switch(month)
    {
     case 1:   //january
     case 3:   //march
     case 5:   //may
     case 7:   //july
     case 8:   //august
     case 10:  //september
     case 12:  //december
       if (day>0 && day<=31)
         this.day=day;
       else
         System.out.println("error");
         
       
     
     case 4:   //april
     case 6:   //june
     case 9:   //october
     case 11:  //november
       if (day>0 && day<=30)
         this.day=day;  
       else
         System.out.println("error");
      
     case 2:   //febuary
       if((year % 400==0 )||((year%4==0) && (year%100!=0))) //check if year is leap
        {
          if (day>0 && day<=29)
          
            this.day=day;  
          else
           System.out.println("error");
          
        }
         else
       if (day>0 && day<=28)
       {
        this.day=day;
       }
       else
        System.out.println("error");
      
    }
   }
  
   public void set_month(int month)
   {
    if (month>0 && month<=12)
        this.month=month;
    else
       System.out.println("error");
   }
   
   public void set_year(int year)
   {
    this.year=year;   
   }
  
   public int get_day()
   {
    return day;  
   }
  
   public int get_month()
   {
    return month;  
   }
  
   public int get_year()
   {
    return year;  
   }
  
    public void input()
    {
      System.out.print("enter month==>");
        set_month(read.nextInt());
      System.out.print("enter day==>");
        set_day(read.nextInt());
      System.out.print("enter year==>");
        set_year(read.nextInt());  
    }
   
    public void print()
    {
     System.out.println(get_day()+"/"+get_month()+"/"+get_year());
    }
}
