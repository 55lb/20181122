import java.util.Random;

public class LuanxuArray {
	
	public static void main(String[] args)
	{	

		int[] a ={1,2,3,4,5,6,7};
		Random rand = new Random();
		for(int i=0;i<a.length;i++)
		{
			
				int p = rand.nextInt(a.length);
				
				int	b=a[i];
					a[i]=a[p];
					a[p]=b;
					
			
					}for(int k=0;k<a.length;k++)
		{
		System.out.println(a[k]);
		}
	}
}
