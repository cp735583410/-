package p1;
public class Test{
	public static void main(String[]args){
		int[]data={4,2,7,6,9,1,5};
		int n=data.length;
		//ѭ��n-1�Σ�n-1��ð�ݴ���
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//data[j]��data[j+1]�Ƚ�
				if(data[j]>data[j+1]){
					//data[j]��data[j+1]����λ��
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
		//ѭ��n-1�Σ�n-1��ð�ݴ���
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//data[j]��data[j+1]�Ƚ�
				if(data[j]>data[j+1]){
					//data[j]��data[j+1]����λ��
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
		//ѭ��n-1�Σ�n-1��ð�ݴ���
		for(int i=1;i<n;i++){
		    for(int j=0;j<(n-i);j++){
				//data[j]��data[j+1]�Ƚ�
				if(data[j]>data[j+1]){
					//data[j]��data[j+1]����λ��
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