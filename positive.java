import java.io.*;
import java.util.*;
class Day
{
public static void main(String args[])
{
int num;
Scanner s =new Scanner(System.in);
System.out.println("enter the number");
num=s.nextInt();
if(num>0)
{
System.out.println("positive");
}
else if(num==0)
{
System.out.println("zero");
}
else
{
System.out.println("negative");
}
}
}
