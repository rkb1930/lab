package list;
import java.util.Scanner;
public class StackUsingArray {
int arr[];
int top;
StackUsingArray(int max)
{
arr=new int[max];
top=-1;
}
void push(int ele)
{
if(is_full())
System.out.println("Stack Overflow");
else
{
top=top+1;
arr[top]=ele;
}
}
int pop()
{
if(is_empty())
{
System.out.println("Stack Underflow");
return -1;
}
else
{
int temp=arr[top];
top=top-1;
return temp;
}
}
int peek()
{
if(is_empty())
{
System.out.println("Stack Underflow");
return -1;
}
else
{
return arr[top];
}
}
boolean is_empty()
{
if(top==-1)
return true;
else
return false;
}
boolean is_full()
{
if(top==arr.length-1)
return true;
else
return false;
}
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter the Stack size");
int max=sc.nextInt();
StackUsingArray s= new StackUsingArray(max);
while(true)
{
System.out.println("****MENU*****");
System.out.println("0:Exit");
System.out.println("1:Push");
System.out.println("2:Pop");
System.out.println("3:Peek");
System.out.println("*************");
System.out.println("Enter the choice");
int choice=sc.nextInt();
switch(choice)
{
case 0:
System.exit(0);
case 1:
System.out.println("Enter the element:");
int e=sc.nextInt();
s.push(e);
break;
case 2:
int m=s.pop();
if(m!=-1)
System.out.println("The popped value is: "+m );
break;
case 3:
m=s.peek();
if(m!=-1)
System.out.println("The Top value is: "+m );
break;
default:
System.out.println("Wrong choice");
}
}
}
}