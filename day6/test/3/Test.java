package p1;
public class Test{
	public static void main(String[]args){
		int[]a={10,11,12};
		TestArry(a);
	}
	//����һ�������������������ڱ�����������
	public static void TestArry(int[]x){
		//������������
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}