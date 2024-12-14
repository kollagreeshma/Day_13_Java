import java.util.*;
public class treemapkey
{
  public static void main(String args[])
  {
    TreeMap<String,String> a=new TreeMap<>();
    a.put("sno","01");
    a.put("sname","muraja");
    System.out.println(a);
    if(a.containsKey("sname"))
    {
        String d=a.get("sname");
        System.out.println(d);
    }
  }
}
