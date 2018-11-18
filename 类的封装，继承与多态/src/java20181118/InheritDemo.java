package java20181118;

public class InheritDemo {
	public static void main(String[] args){
		Student s = new Student("张三",25,"工业大学");
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
			System.out.println("我的名字叫"+name+"今年"+age+"岁");
		}
	}
		class Student extends Person{
			String school;
			Student(String name,int age,String school){
				super(name,age);
				this.school =school;
				
			}
			void study(){
				System.out.println("我在"+school+"读书");
			}
		}
		