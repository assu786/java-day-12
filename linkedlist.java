import java.util.*;
class Main{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("iam");
        a.add("students");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}