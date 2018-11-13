
package p1;
public class B{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100的和并返回该结果到函数调用处打印
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}
package p1;
public class B{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100之间的偶数和并返回该结果到函数调用处打印
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100之间3的倍数
	//并且也是5的倍数的所有数之和并返回该结果到函数调用处打印
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数用于计算100的所有因子之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数用于计算100以内所有7的倍数以及个位数和十位数是7的所有数之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if((i%7==0||i%10==7)||i/10==7){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(3,4);
		System.out.println(a(3,4));
	}
	//写一个函数定义两个整型参数a与b，此函数用于计算a与b的和
	public static int a(int a,int b){
		int c=a+b;
		return c;
	}
}
package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(5);
		System.out.println(a(5));
	}
	//写一个函数定义一个整型参数n，此函数用于计算n的阶乘
	public static int a(int n){
		int sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(100);
		System.out.println(a(100));
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

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(32);
		System.out.println(a(32));
	}
	//写一个函数定义一个整型参数n，此函数用于计算1~100之间所有n的倍数之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%n==0){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
	public static void main(String[]args){
		//返回该结果到函数调用处打印
		a(9);
		System.out.println(a(9));
	}
	//写一个函数定义一个整型参数n，此函数用于计算所有n的因子之和
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
}

package p1;
public class B{
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
package p1;
public class B{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100的和并返回该结果到函数调用处打印
	public static int a(int n){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}
package p1;
public class B{
	public static void main(String[]args){
		a(100);
		//返回该结果到函数调用处打印
		System.out.println(a(100));
	}
	//写一个函数定义整型返回值，此函数功能用于计算1~100的和
	public static int a(int n){
		int sum=o;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}