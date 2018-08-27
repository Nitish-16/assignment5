final class A
{
public void display()
{
System.out.println("class A");
}
}
class B extends A
{
public void display()
{
System.out.println("class B");
}
}
class Final
{
public static void main(String args[])
{
A a=new A();
a.display();
}
}