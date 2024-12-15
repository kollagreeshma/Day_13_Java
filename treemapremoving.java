import java.util.*;
public class treemapremoving
{
  public static void main(String args[])
  {
    TreeMap<String,String> a=new TreeMap<>();
    a.put("sno","01");
    a.put("sname","muraja");
    a.put("city","chennia");
    System.out.println(a);
    a.remove("sname");
    System.out.println(a);
    a.clear();
    System.out.println(a);
  }
}
