package p1;
public class Test{
	public static void main(String[]args){
		ma("Hello");
	}
	public static void ma(int n){
		System.out.println("ma() int");
	}
	public static void ma(String s){
		System.out.println("ma() String");
	}
	public static void ma(boolean b){
		System.out.println("ma() boolean");
	}
}