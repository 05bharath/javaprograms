import java.util.*;
class Chakravyuga
{
 public static void main(String  ar[])
 { 
          Scanner scan =new Scanner(System.in);
          int num=scan.nextInt();
		  int arr[][]=new int[num][num];
		  int n=1;
		  for(int i=0;i<(num+1)/2;i++)
		  {
		     for(int j=i;j<num-i;j++)
			 {
			 arr[i][j]=n++;
			 
			 }
			 for(int k=i+1;k<num-i;k++)
			 {
			 
			 arr[k][num-i-1]=n++;
			 
			 }
			 for(int l=num-i-2;l>=i;l--)
			 {
			 arr[num-i-1][l]=n++;
			 
			 }
			 for(int m=num-i-2;m>i;m--)
			 {
			 arr[m][i]=n++;
			 
			 }
		  
		  
		  }
		  
		  
		  for(int i=0;i<arr.length;i++)
		  {

            for(int j=0;j<arr.length;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
	
		  System.out.println();
		  }
		  
 
   
 }
}