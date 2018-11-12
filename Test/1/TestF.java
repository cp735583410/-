package p1;
public class TestF{
	public static void main(String[]args){
		a();
	}
	//定义一个函数用于打印1~100之间所有3的倍数并且也是5的倍数的所有数
	public static void a(){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i);
			}
		}
	}
}