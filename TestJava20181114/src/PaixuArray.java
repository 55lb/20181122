
public class PaixuArray {

	public static void main(String[] args)
	{
		int[] a ={25,24,12,76,98,101,90,28};
		
		for(int i=0;i<a.length-1;i++)
		{
			int b =0;
			for(int k=0;k<a.length-i-1;k++)
			{
			if(a[k]>a[k+1])
			{
				
				b = a[k];
				a[k] = a[k+1];
				a[k+1] = b;
				
			}/**else
			{
				b = a[k+1];
			}*/
			
			}
			
		}
		for(int i=0 ;i<a.length;i++)
		{
		System.out.print("ÅÅÐò½á¹ûÊÇ£º"+a[i]);
		}

	}
}
