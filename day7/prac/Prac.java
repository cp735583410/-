package p1;
public class Prac{
	public static void main(String[]args){
		int []a={1,2,3,4};		
        a=expand1(a);
	}
	//表示数组扩充，返回值为新数组
	public static int[] expand1(int[]a){
		int[]b=new int[a.length*2];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		return b;
	}
	public static int[]expand2(int[]a){
		int []b=new int[a.length*2];
		System.arrycopy(a,0,b,0,a.length);
		return b;
	}
	public static int[]expand3(int[]a){
		return java.util.Arrays.copyOf(a,a.length*2);
	}
	
}

package p1;
public class Prac{
	public static void main(String[]args){
		int []a={1,2,3,4};
	}
	public static int[]expand1(int[]a){
		int []b=new int [a.length*2];
		for(int i=0;i<a.length;i++){
			a[i]=b[i];
		}
		return b;
	}
	public static int[]expand2(int[]a){
		int []b=new int[a.length*2];
		System.arrycopy(a,0,b,0,a.length);
		return b;
	}
	public static int[]expand3(int []a){
		return java.util.Arrays.copyOf(a,a.length*2);
	}
}
package p1;
public class Prac{
	public static void main(String[]args){
		int []a={1,2,3,4};
	}
	public static int[]expand1(int []a){
		int []b=new int [a.length*2];
		for(int i=0;i<a.length;i++){
			a[i]=b[i];
		}
		return b;
	}
	public static int []expand2(int []a){
		int []b=new int[a.length*2];
		System.arrycopy(a,0,b,0,a.length);
		return b;
	}
	public static int[]expand3(int []a){
		return java.util.Arrays.copyOf(a,a.length*2);
	}
}