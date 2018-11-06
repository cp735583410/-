package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		//让用户输入一个整数
		System.out.print("请输入一个整数");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//如果这个整数是偶数，则打印“偶数”
		if(i%2==0){
			System.out.println(i+"是偶数");
		}
		else{
			System.out.println(i+"是奇数");
		}
	}
}
package a1;
//这是主类
public class A{
//这是主函数
	public static void main(String[]args){
		int n=478;
		int a=n/100;
		int b=n/10%10;
		int c=n%10;
		System.out.println(a+","+b+","+c);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		System.out.print("请输入成绩");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		if(i<60&&i>=0){
			System.out.println("不及格");
		}
		else if(i>=60&&i<70){
			System.out.println("及格");
		}
		else if(i>=70&&i<90){
			System.out.println("良");
		}
		else if(i<=100&&i>=90){
			System.out.println("优秀");
		}
		else{
			System.out.println("输入有误");
		}
		
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		System.out.print("请输入年份");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//如果这个年份能够被4整除，且不能被100整除，咋这一年是闰年	
//如果这个年份能够被100整除，则这个数必须要能被400整除；
		if ((i%4==0&&i%100!=0)||(i%100==0&&i%400==0)){
			system.out.println(i+"是闰年");
		}
			else{
				System.out.println(i+"不是闰年");
			}
		}
	}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=0;
		//while表示循环括号内为一个布尔表达式
		//先判断条件再循环代码块
		while(i<10){
			System.out.println("Hello World");
			i++;
		}
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while表示循环括号内为一个布尔表达式
		//先判断条件再循环代码块
		while(i<=100){
			a+=i;
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=1;
		//while表示循环括号内为一个布尔表达式
		//先判断条件再循环代码块
		while(i<=10){
			a*=i;
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while表示循环括号内为一个布尔表达式
		//先判断条件再循环代码块
		while(i<=100){
			if(i%3==0){
				a+=i;
			}
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while表示循环括号内为一个布尔表达式
		//先判断条件再循环代码块
		while(i<=100){
			if(i%3==0&&i%5!=0){
				a+=i;
			}
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
		//do while 先执行代码块，再判断条件
		do{
			a+=i;
			i++;
		}while(i<=100);
		System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=0;
		//do while 先执行代码块，再判断条件
		do{
			System.out.println("Hello World");
			i++;
		}while(i<10);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
	int i=1;
	int a=1;
	//do while 先执行代码块，再判断条件
	do{
		a*=i;
		i++;
	}while(i<=10);
			System.out.println(a);
	}
}

package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=1;
		int a=0;
		//do while 先执行代码块，再判断条件
		do{
			if(i%3==0&&i%5!=0){
			a+=i;
		    }
		    i++;
	    }while(i>=1&&i<=100);
		System.out.println(a);
    }
}
package p1;
//这是主类
public class TestIf{
	//这是主函数
	public static void main(String[]args){
		int i=0;
	//while表示循环括号内为一个布尔表达式
	//先判断条件再循环代码块
		while(i<10){
			System.out.println("Hello World");
			i++;
		}
	}
}