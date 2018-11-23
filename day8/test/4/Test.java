package p1;
public class Test{
	public static void main(String[]args){
		
	}
}
//写一个student类
class student{
	//定义属性
	String name;//姓名
	int age;//年龄
	boolean sex;//性别
	double score;//分数
	public void study(String course){
		System.out.println("Student"+name+"studies"+course);
	}
}