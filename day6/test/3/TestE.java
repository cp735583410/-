package p1;
public class TestE{
	public static void main(String[]args){
		int[]arr={1,2,3,4,5,6,7};
		System.out.println(add(arr));
	}
	//����һ����������һ����������arr���˺������ڼ������������ż���±�ĺͲ����ص��������ô���ӡ
	public static  int add(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			//���±�i��ż��ʱ��sum+=i;
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}
}