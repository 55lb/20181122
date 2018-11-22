package practiseRandomEtc;

public class PractiseRandom1 {

		public static void main(String[] args){
			String1  str2 =new String1();
			String name ="Java is general-purpose computer programming language "
			 		+ "that is concurrent,class-based,object-oriented.";
			str2.print1(name);
			str2.stringLength(name);
			str2.charGetFirst(name);
			str2.charGetLast(name);
			str2.firstWord(name);
			str2.wordLocation(name);
			
			
		}
}
class String1{
	 private String  str1 ;
	 private String name;
	 public String1(){
		 this.name=name;
	 }
	 public String print1(String s){
		 System.out.println(s);
		 return s;
	 }
	 public int stringLength(String b ){
		 int a = b.length();
		 System.out.println(a);
		 return a;
	 }
	 public char charGetFirst(String c1){
		 char b =c1.charAt(0);
		 System.out.println(b);
		 return b;
		
	 }
	 public char charGetLast(String c2){
		 char b1 =c2.charAt(c2.length()-1);
		 System.out.println(b1);
		 return b1;
		
	 }
	 public void firstWord(String c3){
		 
		 char[] arr =c3.toCharArray();
		
		 
		 for(int i=0;i <c3.length();i++){
			 int a=0;
			 if(arr[i]==' '){
				a= i;t
				
				for(int j=0;j<i+1;j++){
					System.out.print(arr[j]);
				}
				break;
			}
			  
		 }
	 }
	 public void wordLocation(String s5){
		 System.out.println("object-oriented出现的位置是"+s5.indexOf("object-oriented"));
	 }
		 
	 }
