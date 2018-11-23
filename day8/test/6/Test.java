package p1;
public class Test{
	public static void main(String[]args){
		
	}
}
class Student{
	String name;//姓名
	int age;//年龄
	boolean sex;//性别

	public Student(){}//构造函数无参
	
	public Student(int a){
		age=a;
	}//有参构造函数
	
	public void study(String course){
		System.out.println("Student"+name+"studies"+course);
	}
}