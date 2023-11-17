import java.util.*;
import java.math.BigInteger;
class fourSolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       int k=nums.length;
	   Arrays.sort(nums);
       List<String> check=new ArrayList<String>();
       List<List<Integer>> result =new ArrayList<>();
        for(int i=0;i<k;i++)
        {
        
          for(int j=i+1;j<k;j++)
        {
			for(int l=j+1;l<k;l++){
        
            int one=nums[i],two=nums[j],three=l;
            int high=nums.length-1;


            while (three<high)
            {
				
              BigInteger num1 = new BigInteger(""+one);
              BigInteger num2 = new BigInteger(""+two);
              BigInteger num3 = new BigInteger(""+nums[high]);
              BigInteger num4 = new BigInteger(""+nums[high]);
			  BigInteger sum = num1.add(num2).add(num3).add(num4);
				if(sum.longValue()<Integer.MIN_VALUE||sum.longValue()>Integer.MAX_VALUE)
					 break;
		
			  int temp=sum.intValue();
               if(temp==target)
               {
                   if(!check.contains(""+one+":"+two+":"+nums[three]+":"+nums[high])){
                   check.add(""+one+":"+two+":"+nums[three]+":"+nums[high]);
				   System.out.println(""+i+":"+j+":"+three+":"+high);
                   result.add(Arrays.asList(one,two,nums[three],nums[high]));
                   }
				   three++;
				   high--;
               }
               else if(temp<target)
                  three++;
                  else 
                    high--;

               
            }
			}


        
        }
        }

        return result;
    }
}
public class four{
	public static void main(String nums[])
	{
		fourSolution ntrs=new fourSolution();
		
        int[] numss = {1,-2,2,-2,0,0};
        List<List<Integer> > result = ntrs.fourSum(numss,0);
     

       System.out.println(result);
		
	}}