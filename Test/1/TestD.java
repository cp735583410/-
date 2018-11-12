package p1;
public class TestD{
	public static void main(String[]args){
		a();
	}
	//定义一个函数 计算1~100之间7的倍数的和
	public static void a(){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%7==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}