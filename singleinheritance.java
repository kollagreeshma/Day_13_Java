import java.util.*;
class a
{
    public void r()
    {
        System.out.println("hello students");
    }
}
class b extends a
{
    public void r1()
    {
        System.out.println("hello teachers");
    }
}
public class singleinheritance
{
    public static void main(String args[])
    {
        a h=new a();
        h.r();
        b h1=new b();
        h1.r();
        h1.r1();
    }
}