package PractiseClassInherit;

public class InheritPractise1 {
			
			public static void main(String[] args){
				Person s =new Student("张三","上海","男",28,100,90);
				System.out.println(s.talk());
				Student s1 = new Student(80,90);
				System.out.println(s1.talk());
				Student s3 =new Student();
				System.out.println(s3.talk());
			}
		
}
		class Person{
				String name;
				String addr;
				String sex;
				int age;
				public  String talk(){
					return "我叫"+name+"我住在"+addr+"我的性别是"+sex+"我的年龄是"+age+"岁";
					
				}
				public Person(){
					this.name=null;
					this. addr =null;
					this. sex =null;
					this. age = 20; 
				}
				
		}
		class Student extends Person{
			
			int Math;
			int English;
			public Student(String name,String addr,String sex,
					int age,int Math,int English){
				super.name = name;
				super.addr =addr;
				super.sex =sex;
				super.age =age;
				this.Math =Math;
				this.English =English;
				}
			
			
			public Student(int Math,int English){
					this.Math =Math;
					this.English =English;
				}
			public Student(){
				
			}  
			public String talk(){
					return super.talk()+"我的数学成绩是"+this.Math+"我的英语成绩是"+this.English;
				
			}
			
			
			}
			
	
	
		