package p1;
public class TestC{
	public static void main(String[]args){
		
	}
}
//����һ��Teacher��
class Teacher{
	String name;//����
	int age;//����
	long number;//����
	public Teacher(){}//�޲� ���캯��
	
	public Teacher(int a,long b,String n){
		age=a;
		number=n;
		String name=n;
	}//�вι��캯��
	public void eat(String food){
		System.out.println(name+age+number);
	}
	
}