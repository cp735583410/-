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