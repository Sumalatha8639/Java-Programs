public class Island
{
    public static void func(int[][] a,int i, int j)
    {
        if((i<0) || (i>=a.length) || (j<0) || (j>=a.length) || (a[i][j]==0)) return ;
        a[i][j]=0;
        func(a,i-1,j);
        func(a,i+1,j);
        func(a,i,j-1);
        func(a,i,j+1);
    }
    
	public static void main(String[] args) 
	{
	    int c=0;
	    int [][] a ={
	        {1,0,0,0},
	        {0,0,0,1},
	        {1,1,0,1},
	        {0,1,0,1}
	    };
	  for(int i=0; i<a.length;i++)
	  {
	      for(int j=0; j<a[0].length; j++)
	      {
	          if(a[i][j]==1)
	          {
	              c++;
	             func(a,i,j);
	          }
	          
	      }
	  }
	   System.out.println(c);
	}
}