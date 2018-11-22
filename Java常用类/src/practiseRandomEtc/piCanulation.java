package practiseRandomEtc;
//import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class piCanulation {
	
		public static void main(String[] args){
			RandomSum randomsum = new RandomSum();
			System.out.println("请输入要投掷多少点来估算PI的值:");
			Scanner in = new Scanner(System.in);
			int count = in.nextInt();
		
			System.out.println("PI的值大约是"+randomsum.randomCount(count));
			
		}
}
class RandomSum{
	float m =0;
	int count=0;
	
	//DecimalFormat df =new DecimalFormat(".000");
	
	public float randomCount(int count){
		  int sum1=0;
		  int sum2=0;
		  for(int i=0 ;i <count;i++){
			  Random ran = new Random();
				float f1 =ran.nextFloat();
				//System.out.println("f1的值是"+(f1-0.5));
			  	float f2 =ran.nextFloat();
			  //	System.out.println("f2的值是"+(f2-0.5));
			  float l = (float)((0.5-f1)*(0.5-f1)+(0.5-f2)*(0.5-f2));
			//  System.out.println("l的值是"+l);
			  if(l<=0.25){
				  sum1 =sum1 +1;
				//  System.out.println("sum1的值是"+sum1);
			  }
			  else
			  {
				 sum2= sum2+1;
				// System.out.println("sum2的值是"+sum2);
			  }
		  
		  }
		 return  (float)4*sum1/(sum1+sum2);
		 //return df.format((4*sum1)/(sum1+sum2));
		  
	  }
}