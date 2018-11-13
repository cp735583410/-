package p1;
public class TestB{
	public static void main(String[]args){
		add(100);
		System.out.println(add(100));
	}
	/**写一个函数定义整型返回值，此函数功能用于计算1~100之间3的倍数
	  并且也是5的倍数的所有数之和并返回该结果到函数调用处打印
	 */
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
}