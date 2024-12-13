import java.util.*;
class A 
{
    public static void main(String args[])
    {
        TreeMap<String,String> b=new TreeMap<>();
        b.put("sno","01");
        b.put("sname","arjun");
        System.out.println(b);
        if(b.containsKey("sname"))
        {
            String d=b.get("sname");
            System.out.println(d);
        }
    }
}