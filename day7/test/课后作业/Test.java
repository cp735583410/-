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
class TestC{
	public static void main(String[]args){
		int []a={1,2,3,4,5,6};
		int n=a.length;
		//�������
		for(int i=n;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}