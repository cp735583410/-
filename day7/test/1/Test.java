package p1;
public class Test{
	public static void main(String[]args){
		//����һ������Ϊ3�����飬�������ݣ�������ԭ���������
		int []a={1,2,3};
		int []b=new int[6];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		a=b;
	}
}