package p1;
public class TestE{
	public static void main(String[]args){
		a();
	}
	//定义一个函数，用于打印1~100之间7以及7的倍数和个位数	十位数为7的所有数
	public static void a(){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%7==0&&i/10%10!=7&&i%10!=7){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}