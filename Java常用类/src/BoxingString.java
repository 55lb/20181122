
public class BoxingString {
	public static void main(String[] args){
		String str = "123.6";
		double x = Double.parseDouble(str);
		System.out.println(x);
		int num =100;
		str =num+"";
		System.out.println(str);
		str ="true";
		boolean flag =Boolean.parseBoolean(str);
		if(flag){
			System.out.println("条件满足！");
		}else{
			System.out.println("条件不满足");
		}
	}
}
