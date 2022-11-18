//Holi entrance
import java.util.*;

class Ticketcheck
{
  Scanner sc = new Scanner(System.in);
  int check()
  {
    char ch;
    System.out.println("enter choice :\ny - if you bought ticket\nn - if not bought");
    ch = sc.next().charAt(0);
    if(ch=='y')
    {
      return 1;
    }
    else
    {
    return 0;
    }
  }
}
class Analysis
{
  int analyst(String name[] , int age[] , int p)
  {
    int acount = 0;
    System.out.println("Analysis of the participants who consumed bhang :");
    for (int i=0;i<p;i++ )
     {
       if(age[i]>=18)
       {
         System.out.println(name[i]);
         acount++;
       }
    }
    return acount;
  }
}
public class Application
{
  public static void main(String[] args)
  {
    int p,m,c,i,count=0,acount=0;        //person count  //adultcount
    Scanner in = new Scanner(System.in);
    System.out.println("enter how many numbers want to attend Holi event:");
    p=in.nextInt();
    String name[] = new String[p];
    System.out.println("the amount to be paid for entrance ticket:");
    m=in.nextInt();
     Ticketcheck tc = new Ticketcheck();
     System.out.println("RULES FOR CONSUMING DRINK : YOU MUST HAVE THE AGE OF 18");
    int age[] = new int[50];
    for(i=0;i<p;i++)
    {
      System.out.println("enter details of the person "+(i+1));
      System.out.print("Name:");
      name[i]=in.next();
      System.out.println("enter age of the person: "+(i+1));
      age[i]=in.nextInt();
      c = tc.check();
      if(c==1)
      {
        count++;
      }
    }
    int paircount = count/2;
    Analysis an = new Analysis();
    System.out.println("number of pairs participated in the event: "+paircount);
    System.out.println("number pf participants consumed bhang: "+an.analyst(name,age,p));
  }
}
