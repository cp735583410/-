//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//�����ѡ�������㷨��
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//����Ŀ��������㷨
class TestB{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		java.util.Arrays.sort(a);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={12,324,65,8,423,35,98};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ѡ�������㷨 
//����ѡ��������䰴�մ�С�����˳������Ȼ����������
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={123,3426,678,324,67,999};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={2,435,1,87,43,9};
		
		java.util.Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ѡ�������㷨 
//����ѡ��������䰴�մ�С�����˳������Ȼ����������
package p1;
public class Lianxia{
	//ѡ�������㷨��
	public static void main(String[]args){
		int []a={12,4,567,32,978,22};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				//�Ƚ�a[i]��a[j]�Ĵ�С��
				if(a[i]>a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨
//����ð��������䰴�մ�С�����˳������Ȼ����������
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={87,23,980,234,765,123};
		int n=a.length;
		//��ð������
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,6,4,7};
		java.util.Array.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
package p1;
public class Lianxia{
	public static void main(String[]args){
		int []a={1,2,6,4,7};
		java.util.Array.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
	}
}
//�����ѡ�������㷨��
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//�����ѡ�������㷨��
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//�����ѡ�������㷨��
class TestA{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(in	t i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
//��������ð�������㷨 ���������飺int[] a = {1,2,3,4,5},
//����ð��������䰴�մӴ�С��˳������Ȼ����������
package p1;
public class Test{
	public static void main(String[]args){
		int []a={1,2,3,4,5};
		int n=a.length;
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}