package p1;
public class TestJ{
	public static void main(String[]args){
		//返回到函数调用处打印
		if(n(2)){
			System.out.println("是");
		}
		else{
			System.out.println("不是");
		}
	}
	//写一个函数定义一个整型参数n，此函数用于判断n是否是一个大于6的偶数	
	public static boolean n(int n){
		if(n%2==0&&n<6){
			return true;
		}
		else{
			return false;
		    }		
	}
}