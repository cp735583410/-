/**����һ����������һ����������arr��һ������n���˺������������ж�n�Ƿ��������г��ֹ�,������ֹ���ӡ�����±꣬
���û�г��ֹ����ӡһ��-1 */
package p1;
public class TestF{
	public static void main(String[]args){
		int []arr={12,324,6,7,43,99};
		System.out.println(a(arr,100));
	}
	public static int a(int []arr,int n){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				return i;
			}
		}
		return -1;
	}
}
