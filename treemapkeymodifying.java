import java.util.*;
public class treemapkeymodifying
{
  public static void main(String args[])
  {
    TreeMap<String,String> a=new TreeMap<>();
    a.put("sno","01");
    a.put("sname","muraja");
    a.put("city","chennia");
    System.out.println(a);
    a.put("sno","90");
    System.out.println(a);
  }
}
