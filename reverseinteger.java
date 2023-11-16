import java.util.*;
class Reverseintsolution {
    public int reverse(int x) {
		boolean flag=false;
		if(x<0)
		{
		  x=x*-1;
		  flag=true;
		} 
        String result="";
        while(x>0)
        {
            int t=x%10;
            result=result+t;
            x=x/10;
        }
		System.out.println(result);
     int res=Integer.parseInt(result);
	 if(flag)
	 {
		 res=res*-1;
	 }
     return res;	 
   }
	
}
public class reverseinteger
{
public static void main(String arr[])
{
Scanner scan =new Scanner(System.in);
int num=scan.nextInt();
Reverseintsolution ris=new Reverseintsolution();
System.out.println(ris.reverse(num));
}
}