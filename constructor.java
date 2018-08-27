class hello
{
hello()
{
this(5);
System.out.println("Default construction");
}
hello(int x)
{
this(5,10);
System.out.println(x);
}
hello(int x,int y)
{
System.out.println(x+y);
}
public static void main(String args[])
{
new hello(); 
}
}