package java20181118;

public class InheritDemo {
	public static void main(String[] args){
		Student s = new Student("����",25,"��ҵ��ѧ");
		s.speak();
		s.study();
		
	}

}

	class Person{
		String name;
		int age;
		Person(String name,int age){
			this.name =name;
			this.age =age;
			
		}
		void speak(){
			System.out.println("�ҵ����ֽ�"+name+"����"+age+"��");
		}
	}
		class Student extends Person{
			String school;
			Student(String name,int age,String school){
				super(name,age);
				this.school =school;
				
			}
			void study(){
				System.out.println("����"+school+"����");
			}
		}
		