package p1;
public class TestG{
    public static void main(String[]args){
	    a(1000);
		//返回该结果到函数调用处打印
		System.out.println(a(1000));
    }
	//写一个函数定义一个整型参数n，此函数用于打印计算1~n之间的所有数之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}