import java.util.*;
class A 
{
    public static void main(String args[])
    {
        String arr1[]={"hello","hai","aqsa","nay"};
        String arr2[]={"nay","hello","hello","ram"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s:arr1)
        a.add(s);
        for(String s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u=new HashSet<>(a);
        u.removeAll(b);
        System.out.println(u);  
    }
}