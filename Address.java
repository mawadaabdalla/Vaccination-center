import java.util.Scanner;
public class Address
{
 Scanner read=new Scanner(System.in);
 private String city;
 private String street;
 
  Address(String city,String street)
  {
   this.city=set_city(city);
   this.street=set_street(street);
  }
  
  public String set_city(String city)
  {
    if (city!=" ")
     { 
       this.city=city;
       return city; 
     }
    else
     return "error";
  }
   
  public String set_street(String street)
  {
    if (street!=" ")
     {
       this.street=street;
       return street;  
     }
    else
      return "error";
  }
  
  public String get_city()
  {
   return city;   
  }
  
  public String get_street()
  {
   return street;   
  }
  
  public void print()
  {
    System.out.println("city\tstreet");
    System.out.println(city+"\t"+street);
  }
}

