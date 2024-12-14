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
        super.r();
        System.out.println("hello teachers");
    }
}
public class superkeyword
{
    public static void main(String args[])
    {
        b h1=new b();
        h1.r1();
    }
}