/**
package p1;
public class TestB{
	public static void main(String[]args){
		int[]a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		jieshou(a,5);
	}
	//����һ����������һ����������arr����һ������n.�˺������������ж�n�Ƿ��������г��ֹ���������ֹ���ӡ�����±ꡣ
	public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			//���ܳ�����������ʱ��
			if(arr[i]==n){
				//��ӡ�±�
				System.out.println(i);
				return;
			}

		}
	}
}

package p1;
public class TestC{
	public static void main(String[]args){
		int []arr={1,2,3,4};
		add(arr);
		System.out.println(add(arr));
	}
	//����һ����������һ����������arr���˺������ڼ��������ÿ��Ԫ�صĺͣ������ص��������ô���ӡ
	public static int add(int[]arr){
		int sum=0;
		//����ѭ����ÿѭ��һ�� sum+arr[i]
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}

package p1;
public class TestD{
	public static void main(String[]args){
		int []arr={1,2,3,4};
		System.out.println(add(arr));
	}
	//����һ����������һ����������arr���˺������ڼ������������Ԫ�ص�ƽ��ֵ�����ص��������ô���ӡ
	public static int add(int[]arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			//����ѭ����ÿѭ��һ�� sum+arr[i]
			sum+=arr[i];
		}
		//arr.length������ĳ��ȡ�
		int a=sum/arr.length;
		return a;
	}
}
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4};
		jieshou(a,2);
	}
	//����һ����������һ����������arr,��һ������n,�˺������������ж�n�Ƿ��������г��ֹ�
	public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return ;
			}
		}
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		add(a);
		System.out.println(add(a));
	}
	//����һ����������һ����������arr���˺������ڼ��������ÿ��Ԫ�صĺͣ������ص��������ô���ӡ
	public static int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];//ÿѭ��һ�Σ�sum+arr[i]
		}
		return sum;
		
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []b={1,2,3,4,5};
		System.out.println(add(b));
	}
	//����һ����������һ����������arr���˺������ڼ������������Ԫ�ص�ƽ��ֵ�����ص��������ô���ӡ
	public static  int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		//arr.length������ĳ��ȡ�
		int a=sum/arr.length;
		return a;
	}
}
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []b={1,2,3,4,5,88};
		jieshou(b,88);
	}
	//����һ����������һ����������arr����һ������n.�˺������������ж�n�Ƿ��������г��ֹ���������ֹ���ӡ�����±ꡣ
    public static void jieshou(int[]arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return;
			}
		}
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={1,2,3,4,5,6,7};
		add(a);
		System.out.println(add(a));
	}
	//����һ����������һ����������arr���˺������ڼ��������ÿ��Ԫ�صĺͣ������ص��������ô���ӡ
	public static int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}

package p1;
public class Lianxi{
	public static void main(String[]args){
		int []c={1,2,3,4,5,6,7,8,9,10};
		a(c);
		System.out.println(a(c));
	}
	//����һ����������һ����������arr���˺������ڼ������������Ԫ�ص�ƽ��ֵ�����ص��������ô���ӡ
	public static int a(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		int b=sum/arr.length;
		return b;
	}
}
*/
//����һ����������һ����������arr����һ������n.�˺������������ж�n�Ƿ��������г��ֹ���������ֹ���ӡ�����±ꡣ
package p1;
public class Lianxi{
	public static void main(String[]args){
		int []a={2,4,3,1,5};
		jieshou(a,2);
	}
	public static void jieshou(int []arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
				return;
			}
		}
	}
}