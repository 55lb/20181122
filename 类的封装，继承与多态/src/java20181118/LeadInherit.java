package java20181118;

 public class LeadInherit{
	 		public static void main(String[] args){
	 			Person person = new Person("张三",21);
	 			person.speak();
	 			Student student =new Student("李四",20,"HAUT");
	 			student.speak();
	 			student.study();
	 		}

		
	}
			 class Person{
					String name;
					int age;
					Person(String name,int age){
						this.name = name;
						this.age = age;
						
					}
					void speak(){
						System.out.println("我的名字叫"+name+"我是"+age+"岁");
					}
				}
		
			class Student{
				 String name;
				 int age;
				 String school;
				 Student(String name,int age,String school){
					 this.name =name;
					 this.age = age;
					 this.school =school;
					 
				 }
				 void speak(){
					 System.out.println("我的名字叫"+name+"我"+age+"岁");
					 
				 }
				 void study(){
					 System.out.println("我在"+school+"读数");
				 }
			 
		 }
