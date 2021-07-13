import java.util.Scanner;
public class Vaccine
{
  Scanner read=new Scanner(System.in);
   private String name;
   private int num;
   private String manu_comp;    //manufacturing company name
   private String import_com;   //importing company name
   private String formula;
   private int quantity;
   private Date ex;
   
   Vaccine()
   {
    name=" ";
    num=0;
    manu_comp=" ";
    import_com=" ";
    formula=" ";
    quantity=0;
    ex=new Date();
   }
    
   public void set_name(String name)
   {
    int length = String.valueOf(name).length();
     if (length>0)
      this.name=name;
    else
     System.out.print("error");
   }
   
   public void set_num(int num)
   {
    if(num>=0)
     this.num=num;
    else
     System.out.print("error");
   }
   
   public void set_manucomp(String manu_comp)
   {
    int length = String.valueOf(manu_comp).length();
     if (length>0)
      this.manu_comp=manu_comp;
     else
      System.out.print("error");
   }
   
   public void set_importcom(String import_com)
   {
     int length = String.valueOf(import_com).length();
      if (length>0)
       this.import_com=import_com;
      else
       System.out.print("error");
   }
   
   public void set_formula(String formula)
   {
     int length = String.valueOf(formula).length();
      if (length>0)
       this.formula=formula;
      else
       System.out.print("error");
   }
   
   public void set_quantity(int quantity)
   {
     if(quantity>=0)
      this.quantity=quantity;
     else
      System.out.print("error");
   }
   
   public String get_name()
   {
     return name;
   }
   
   public String get_manucomp()
   {
     return manu_comp;
   }
   
   public String get_importcom()
   {
     return import_com;
   }
   
   public String get_formula()
   {
     return formula;
   }
   
   public int get_quantity()
   {
     return quantity;
   }
   
   public int get_num()
   {
     return num;
   }
   
   public void input()
   {
    System.out.print("enter vaccine name==>");
     set_name(read.next());
    System.out.print("enter vaccine number==>");
     set_num(read.nextInt());
    System.out.print("enter name of manufacturing company==>");
     set_manucomp(read.next());
    System.out.print("enter name of importing company==>");
     set_importcom(read.next());
    System.out.print("enter chemical formula==>");
     set_formula(read.next());
    System.out.print("enter quantity of vaccine==>");
     set_quantity(read.nextInt());
    System.out.println("enter expire date==>");
     ex.input();
   }
   
   public void less_quantity()
   {
     quantity-=1;
   }
   
   public void check()
   {
    if(quantity>0)
     System.out.println(quantity+"  vaccine avalible");
     else
     System.out.println("no vacines avalible");
   }
   
   public void print()
   {
     System.out.println("name\tnumber\tmanu_comp\timport_com\tformula\tquantity\tdate");
     System.out.print(get_name()+"\t"+get_num()+"\t"+get_manucomp()+"\t"+get_importcom()+"\t"+get_formula()+"\t"+get_quantity()+"\t");
     ex.print();
   }
   
   public boolean expire()
   {
     
     try
     {
      System.out.println("enter current year==>");
      int nyear=read.nextInt();
      return nyear<ex.get_year();
     }
     catch(Exception e){
      System.out.println("not a number,try again==>"); 
       int nyear=read.nextInt();
      return nyear<ex.get_year();
     }
     
    
   }
    
   public void switchl()
   {
    int x;  
    do{
     System.out.println("0-stop/1-input/2-print/3-check quantity");    
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
           check();  
        break;
        
        default:System.out.println("System stopped");
        }
    }while(x!=0);
  
   }
 
}
