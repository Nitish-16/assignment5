class A
{
public void and()
{
System.out.println("enter in A");
}
}
class B extends A
{
public void and()
{
super.and();
System.out.println("enter in B");
}
}
class Instance
{
public static void main(String args[])
{
B b=new B();
b.and();
System.out.println("called A without using object");
}
}