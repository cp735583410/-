package p1;
public class TestC{
	public static void main(String[]args){
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				if(i<2){
					int  sum=i*j;
					System.out.println(i+"*"+j+"="+sum);
				}
			}
		}
	}
}