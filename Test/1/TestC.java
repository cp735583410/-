package p1;
public class TestC{
	public static void main(String[]args){
		a();
	}
	//定义一个函数
	public static void a(){
		int sum=0;
		//1~100的偶数和
		for(int i=1;i<=100;i++){
			if(i%2==0){	
			  sum+=i;
			}		  
		}
		System.out.println(sum);
	}
}