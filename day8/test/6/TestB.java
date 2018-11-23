package p1;
public class TestC{
	public static void main(String[]args){
		
	}
}
//定义一个Teacher类
class Teacher{
	String name;//姓名
	int age;//年龄
	long number;//工号
	public Teacher(){}//无参 构造函数
	
	public Teacher(int a,long b,String n){
		age=a;
		number=n;
		String name=n;
	}//有参构造函数
	public void eat(String food){
		System.out.println(name+age+number);
	}
	
}