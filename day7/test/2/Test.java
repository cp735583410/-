package p1;
public class Test{
	public static void main(String[]args){
		int []arr={10,11,12};
		expand1(arr);
		System.out.println(expand1(arr));
	}
	//定义一个函数，使其进行扩容。
	public static int[]expand1(int []a){
		int []b=new int [a.length*2];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		return b;
	}
	public static int[]expand2(int []a){
		int []b=new int [a.length*2];
		System.arrycopy(a,0,b,0,length);
		return b;
	}
	public static int []expand3(int []a){
		return java.util.Arrays.copyOf(a,a.length*2);
	}
}