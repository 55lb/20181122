package java20181118;

 public class LeadInherit{
	 		public static void main(String[] args){
	 			Person person = new Person("����",21);
	 			person.speak();
	 			Student student =new Student("����",20,"HAUT");
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
						System.out.println("�ҵ����ֽ�"+name+"����"+age+"��");
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
					 System.out.println("�ҵ����ֽ�"+name+"��"+age+"��");
					 
				 }
				 void study(){
					 System.out.println("����"+school+"����");
				 }
			 
		 }
