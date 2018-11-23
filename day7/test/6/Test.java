package p1;
public class Test{
	public static void main(String[]args){
		int []arr={12,23,456,76,234,908,234,54,677,89};
		java.util.Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}