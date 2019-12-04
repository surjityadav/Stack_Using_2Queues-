
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Stack_Using_2Queues 
{
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    
    public static void push(int data)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        q1.add(data);
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
    }
    public static void pop()
    {
        q1.poll();
    }
    public static void display()
    {
        System.out.println("Stack is:"+q1);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack_Using_2Queues sq=new Stack_Using_2Queues();
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sq.push(a[i]);
        }
        display();
        sq.pop();
        System.out.println("After poped display: ");
        display();
        
    }
}
