package p1;
public class Test{
	public static void main(String[]args){
		int []arr={19,8,25,90,3};
		int n=arr.length;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}