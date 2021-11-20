import java.util.Scanner;
import java.util.Arrays;
class PrintZigZag
{
 static void printZigZagString(String str,int n)
 {
	 if(n==1)
	 {
		 System.out.println(str);
		 return;
	 }
	 char str1[]=str.toCharArray();
	 int len=str.length();
	  String[] arr = new String[n];
         Arrays.fill(arr, "");
 
        int row = 0;
        boolean down = true; 
        for (int i = 0; i < len; ++i)
        {
            
            arr[row] += (str1[i]);
 
             if (row == n - 1)
            {
                down = false;
            }
             
            
            else if (row == 0)
            {
                down = true;
            }
 
            if (down)
            {
                row++;
            }
            else
            {
                row--;
            }
        }
 
        
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i]);
        }
	 
 }
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter string");
 String str=sc.next();
 System.out.println("Enter number of rows");
 int n=sc.nextInt();
 printZigZagString(str,n);
  
 }
}