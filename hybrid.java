import java.util.*;
class gp
{
    public void r()
    {
        System.out.println("Hello i'm grand parent");
    }
}
class p1 extends gp
{
    public void r1()
    {
        System.out.pritnln("Hello i'm parent");
    }
}
interface p2
{
 public void r2();
}
class d extends p1 implements p2
{
    public void r2()
    {
        System.out.println("I'm parent2");
    }
    public void r2()
    {
        System.out.println("I'm chlid class");
    }
}
public class hybrid
{
    public static void main(String args[])
    {
        d h=new d();
        h.r();
        h.r1();
        h.r2();
        h.r3();
    }
}