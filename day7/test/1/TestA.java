package p1;
public class TestA{
	public static void main(String[]args){
		int arr [] ={4,5,8,10};
		int a []=new int [8];
		for(int i=0;i<arr.length;i++){
			a[i]=arr[i];
		}
		arr=a;
	}
}