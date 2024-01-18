import java.util.Scanner;
class Node {
 int info; 
 Node link; 
}
public class StackUsingLinkedList {
static Node top=null;
public static void push(int x) 
 {
 
 Node p = new Node(); 
 p.info = x;
 p.link = top;
 top = p;
 }
public static void pop() 
 {
 if(top==null)
 {
 System.out.println("Stack Underflow ");
 return;
 }
 
 System.out.println("Poped info is:"+top.info);
 top=top.link; 
 }
public static void peek() 
 {
 if(top==null)
 {
 System.out.println("Stack Underflow ");
 return;
 }
 
 System.out.println("Top info is:"+top.info); 
 }
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
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
System.out.println("Enter the element to be pushed");
int x=sc.nextInt();
push(x);
break;
case 2:
pop();
break;
case 3:
peek();
break;
default:
System.out.println("Wrong choice");
}
}
}
}
