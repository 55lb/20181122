package PractiseClassInherit;

public class InheritPractise1 {
			
			public static void main(String[] args){
				Person s =new Student("����","�Ϻ�","��",28,100,90);
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
					return "�ҽ�"+name+"��ס��"+addr+"�ҵ��Ա���"+sex+"�ҵ�������"+age+"��";
					
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
					return super.talk()+"�ҵ���ѧ�ɼ���"+this.Math+"�ҵ�Ӣ��ɼ���"+this.English;
				
			}
			
			
			}
			
	
	
		