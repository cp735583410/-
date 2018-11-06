package a4;
public class TestIf4{
	public static void main(String[]args){
		//让用户输入一个整数
		System.out.print("请输入成绩");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		if(i>=0&&i<60){
			System.out.println("不及格");
		}
		else if(i>=60&&i<80){
		System.out.println("良好");
		}
			else if(i>=80&&i<90){
			System.out.println("优秀");
			}
				else if(i>=90&&i<=100){
					System.out.println("满分");
				}
				else{
					System.out.println("输入成绩错误");
				}
	}
}
