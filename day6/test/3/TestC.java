package p1;
public class TestC{
	public static void main(String[]args){
		int []a={1,2,3,4};
		add(a);
		System.out.println(add(a));
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