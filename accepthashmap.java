import java.util.HashMap;
import java.util.*;
class Z
{
    public static void main(String args[])
    {
        HashMap<String,String> b=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            String s1=sc.next();
            b.put(s,s1);
        }
        System.out.println(b);
    }
}