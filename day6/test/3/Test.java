package p1;
public class Test{
	public static void main(String[]args){
		int[]a={10,11,12};
		TestArry(a);
	}
	//定义一个函数，函数功能用于遍历整型数组
	public static void TestArry(int[]x){
		//遍历参数数组
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}