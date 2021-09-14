import java.util.*;
public class MyClass {
    public static void main(String args[]) {
         ArrayList<Integer> a=new ArrayList<Integer>(9);
         ArrayList<Integer> b=new ArrayList<Integer>();
         b.add(11);
                  b.add(12);
         b.add(13);
         b.add(14);
         b.add(15);

        a.add(2);
        a.add(5);
        a.add(3);
        a.add(7);
        a.add(9);
        a.add(1,1);
        a.add(6);
      System.out.println(a);
      System.out.println(b);
      System.out.println(b.addAll(1,a));
      System.out.println(b.isEmpty());
      System.out.println(b);
      System.out.println(b.lastIndexOf(1));
      Object[] o=a.toArray();
      System.out.println(Arrays.toString(o));
      System.out.println(a.indexOf(5));
      System.out.println(a.remove(2));
      System.out.println(a.remove(4));
      //b.removeRange(1,3);


      
    }
}
