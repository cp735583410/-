package p1;
public class Test{
	public static void main(String[]args){
		
	}
}
class Student{
	String name;//����
	int age;//����
	boolean sex;//�Ա�

	public Student(){}//���캯���޲�
	
	public Student(int a){
		age=a;
	}//�вι��캯��
	
	public void study(String course){
		System.out.println("Student"+name+"studies"+course);
	}
}