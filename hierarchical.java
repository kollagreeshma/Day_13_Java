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
class c extends a
{
    public void r2()
    {
        System.out.println("hello professors");
    }
}
public class hierarchical
{
    public static void main(String args[])
    {
        b f=new b();
        f.r();
        f.r1();
        c h=new c();
        h.r();
        h.r2();
    }
}