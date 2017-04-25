import java.util.Scanner;
class Array
{  
    static int a[];
    
    void print()
    {
    	System.out.println("Array is:");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    void read()
    {  
    	Scanner read=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n=read.nextInt();
	    a=new int[n];
	    System.out.println("Enter the array");
	    for(int i=0;i<n;i++)
	    	a[i]=read.nextInt();   
    }  
    public static void main(String [] args)
    {
    	Array ob=new Array();
    	ob.read();
    	ob.print();
    }
}