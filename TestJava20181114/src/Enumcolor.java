/**enum Mycolor {黄色,绿色,红色};
public class Enumcolor {
	public static void main(String[] args)
	{
	Mycolor c1 = Mycolor.红色;
			System.out.println(c1);
	Mycolor c2 = Mycolor.绿色;
			System.out.println(c2);
	Mycolor c0 = Mycolor.黄色;
			System.out.println(c0);
}
}
*/
	
 	enum Mycolor{红色,黄色,绿色};
 	public class Enumcolor
 	{
 		public static void main (String[] args)
 		{
 			Mycolor c1 = Mycolor.红色;
 			switch(c1)
 			{
 			case 红色:
 			System.out.println("我是红色");
 			break;
 			case 绿色:
 				System.out.println("我是绿色");
 				break;
 			case 黄色:
 				System.out.println("我是黄色");
 				break;
 			
 			}
 			
 		}
 	}