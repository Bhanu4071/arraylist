import java.util.ArrayList;
import java.util.Iterator;

public class Exam
{

     public static void main(String[]args)
     {
         ArrayList  b=new ArrayList();
         b.add(1);
         b.add(2);
         b.add(3);
         b.add(4);
         b.add(5);
         Iterator itr=b.iterator();
         while(itr.hasNext())
         {
             System.out.println("added integer is:");
             System.out.println(itr.next());
         }


     }

}
