import java.util.*;
class A 
{
    public static void main(String args[])
    {
        HashMap<String,String> b=new HashMap<>();
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