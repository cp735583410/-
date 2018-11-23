package p1;
public class PracB{
	public static void main(String[]args){
		int []data={4,2,7,6,9,1,5};
		int n=data.length;
		//选择排序
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(data[i]>data[j]){
				//交换data[i]和data[j]
				int t=data[i];
				data[i]=data[j];
				data[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
	}
}
package p1;
public class PracB{
	public static void main(String[]args){
		int []data={4,2,7,6,9,1,5};
		int n=data.length;
		//选择排序
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(data[i]>data[j]){
					//交换data[i]和data[j];
					int t=data[i];
					data [i]=data[j];
					data [j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
	}
}
package p1;
public class PracB{
	public static void main(String[]args){
		int []data={4,2,7,6,9,1,5};
		int n=data.length;
		//选择排序
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){
				if(data[i]>data[j]){
					//交换data[i]和data[j];
					int t=data[i];
					data[i]=data[j];
					data[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
	}
}