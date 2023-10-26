class Zigsolution {
    public String convert(String s, int numRows) 
	    if(numRows==1)
		{
			return s;
		}
        int len=s.length();
		
        int col=len%2==0 ? len/2 : len/2+1;
        char arr[][]=new char [numRows][len];
        int  e=0,p=0,row=numRows;
		String result="";
        for(int i=0;i<col;i++)
        {
            if(e==0){
             for(int j=0;j<row;j++)
            {
            if (p < len) {
              arr[j][i] = s.charAt(p);
               p++;
               e++;
			}			   
            }
			}
			if(e==row){
				e--;
			    if(e==1)
					e=0;
			}
            else
            {
				if (p < len) {
                arr[--e][i]=s.charAt(p);
                p++;
				}
				if(e==1)
					e=0;
            }
            

        }
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
				if(Character.toString(arr[i][j]).matches("[a-zA-Z]"))
				{
					result=result+arr[i][j];
				}
			}
			System.out.println();		}
      return result;  
    }
}
public class zigzag{
	public static void main(String arr[])
	{
		Zigsolution zg=new Zigsolution();
		System.out.println(zg.convert("abcd",2));
	}
}