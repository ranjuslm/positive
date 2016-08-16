import java.io.*;
import java.util.*;
class positive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
if(n>0)
{
System.out.println("positive");
}
else if(n<0)
{
System.out.println("negative");
}
else
{
System.out.println("0");
}
}

}