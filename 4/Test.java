package p1;
public class Test{
	public static void main(String[]args){
		if(a(2)){
			System.out.println("是质数");
		}
		else {
			System.out.println("不是质数");
		}
	}
	//写一个函数 定义一个整形的参数
	public static boolean a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum++;//当n%i=0成立时，sum++, 计算n的因子数量
			}
		}
		if(sum>2){//当N的因子数量大于2时，n不是质数，反之，n 为质数。
			return false;
		}
		else return true;
	}
}