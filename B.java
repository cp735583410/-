
package p1;
public class B{
	public static void main(String[]args){
		a(100);
		System.out.println(a(100));
	}
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100�ĺͲ����ظý�����������ô���ӡ
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
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100֮���ż���Ͳ����ظý�����������ô���ӡ
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
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100֮��3�ı���
	//����Ҳ��5�ı�����������֮�Ͳ����ظý�����������ô���ӡ
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
		//���ظý�����������ô���ӡ
		a(100);
		System.out.println(a(100));
	}
	//дһ�������������ͷ���ֵ���˺������ڼ���100����������֮��
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
		//���ظý�����������ô���ӡ
		a(100);
		System.out.println(a(100));
	}
	//дһ�������������ͷ���ֵ���˺������ڼ���100��������7�ı����Լ���λ����ʮλ����7��������֮��
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
		//���ظý�����������ô���ӡ
		a(3,4);
		System.out.println(a(3,4));
	}
	//дһ�����������������Ͳ���a��b���˺������ڼ���a��b�ĺ�
	public static int a(int a,int b){
		int c=a+b;
		return c;
	}
}
package p1;
public class B{
	public static void main(String[]args){
		//���ظý�����������ô���ӡ
		a(5);
		System.out.println(a(5));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ���n�Ľ׳�
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
		//���ظý�����������ô���ӡ
		a(100);
		System.out.println(a(100));
	}
	//дһ����������һ�����Ͳ���n���˺������ڴ�ӡ����1~n֮���������֮��
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
		//���ظý�����������ô���ӡ
		a(32);
		System.out.println(a(32));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ���1~100֮������n�ı���֮��
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
		//���ظý�����������ô���ӡ
		a(9);
		System.out.println(a(9));
	}
	//дһ����������һ�����Ͳ���n���˺������ڼ�������n������֮��
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
		//���ص��������ô���ӡ
		if(n(2)){
			System.out.println("��");
		}
		else{
			System.out.println("����");
		}
	}
	//дһ����������һ�����Ͳ���n���˺��������ж�n�Ƿ���һ������6��ż��	
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
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100�ĺͲ����ظý�����������ô���ӡ
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
		//���ظý�����������ô���ӡ
		System.out.println(a(100));
	}
	//дһ�������������ͷ���ֵ���˺����������ڼ���1~100�ĺ�
	public static int a(int n){
		int sum=o;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	}
}