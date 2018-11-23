package p1;
public class Test{
	public static void main(String[]args){
		int []arr={19,8,25,90,3};
		int n=arr.length;
		//循环n-1次；n-1是冒泡次数
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//arr[j]和arr[j+1]比较
				if(arr[j]>arr[j+1]){
					//arr[j]和arr[j+1]交换位置
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}