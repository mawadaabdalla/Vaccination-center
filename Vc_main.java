import java.util.Scanner;
public class Vc_main
{
 public static void main(String[]args)
 {
   Scanner read=new Scanner(System.in);
   Vaccine_Center va=new Vaccine_Center();
    int x;
    do{
       System.out.println("0-stop/1-vaccine center/2-vaccine/3-office employee/4-nurse/5-reserve");
       x=read.nextInt();
       switch(x)
       {
          case 0:
            System.out.println("System stopped");
          break;
          
          case 1:
            va.switchl();
          break;
      
          case 2:
            for(int i=0;i<2;i++)
            {
             va.c[i]=new Vaccine();
             va.c[i].switchl();
            }
          break;
        
          case 3:
            va.e.switchl();
          break;
          
          case 4:
            va.n.switchl();
          break;
          
          case 5:
          System.out.println("enter num of vaccine==>");
              int num=read.nextInt();
         
              for(int i=0;i<2;i++)
              {
               if (va.c[i].get_num()==num)
               {
                 System.out.println("found");
                  if(va.c[i].expire()==true)
                  {
                   va.c[i].less_quantity();
                   va.gv.get_vac();
                  }
               }
             }
          break;
          default:
          System.out.println("out of range");
    
       }
     }while(x!=0);
     
  }
}
