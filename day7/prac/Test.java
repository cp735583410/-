package p1;
public class Test{
	public static void main(String[]args){
		int[]data={4,2,7,6,9,1,5};
		int n=data.length;
		//循环n-1次；n-1是冒泡次数
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//data[j]和data[j+1]比较
				if(data[j]>data[j+1]){
					//data[j]和data[j+1]交换位置
					int t=data[j];
					data[j]=data[j+1];
					data[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
package p1;
public class Test{
	public static void main(String[]args){
		int []data={4,2,7,6,9,1,5};
		int n=data.length;
		//循环n-1次；n-1是冒泡次数
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//data[j]和data[j+1]比较
				if(data[j]>data[j+1]){
					//data[j]和data[j+1]交换位置
					int t=data[j];
					data[j]=data[j+1];
					data[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
package p1;
public class Test{
	public static void main(String[]args){
		int []data={4,2,7,6,9,1,5};
		int n=data.length;
		//循环n-1次；n-1是冒泡次数
		for(int i=1;i<n;i++){
		    for(int j=0;j<(n-i);j++){
				//data[j]和data[j+1]比较
				if(data[j]>data[j+1]){
					//data[j]和data[j+1]交换位置
					int t=data[j];
					data[j]=data[j+1];
					data[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}