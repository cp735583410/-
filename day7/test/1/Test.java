package p1;
public class Test{
	public static void main(String[]args){
		//定义一个长度为3的数组，将其扩容，长度是原数组的两倍
		int []a={1,2,3};
		int []b=new int[6];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		a=b;
	}
}