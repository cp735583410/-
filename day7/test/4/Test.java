package p1;
public class Test{
	public static void main(String[]args){
		int []arr={19,8,25,90,3};
		int n=arr.length;
		//ѭ��n-1�Σ�n-1��ð�ݴ���
		for(int i=1;i<n;i++){
			for(int j=0;j<(n-i);j++){
				//arr[j]��arr[j+1]�Ƚ�
				if(arr[j]>arr[j+1]){
					//arr[j]��arr[j+1]����λ��
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