package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		//���û�����һ������
		System.out.print("������һ������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//������������ż�������ӡ��ż����
		if(i%2==0){
			System.out.println(i+"��ż��");
		}
		else{
			System.out.println(i+"������");
		}
	}
}
package a1;
//��������
public class A{
//����������
	public static void main(String[]args){
		int n=478;
		int a=n/100;
		int b=n/10%10;
		int c=n%10;
		System.out.println(a+","+b+","+c);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		System.out.print("������ɼ�");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		if(i<60&&i>=0){
			System.out.println("������");
		}
		else if(i>=60&&i<70){
			System.out.println("����");
		}
		else if(i>=70&&i<90){
			System.out.println("��");
		}
		else if(i<=100&&i>=90){
			System.out.println("����");
		}
		else{
			System.out.println("��������");
		}
		
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		System.out.print("���������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int i=s.nextInt();
		//����������ܹ���4�������Ҳ��ܱ�100������զ��һ��������	
//����������ܹ���100�����������������Ҫ�ܱ�400������
		if ((i%4==0&&i%100!=0)||(i%100==0&&i%400==0)){
			system.out.println(i+"������");
		}
			else{
				System.out.println(i+"��������");
			}
		}
	}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=0;
		//while��ʾѭ��������Ϊһ���������ʽ
		//���ж�������ѭ�������
		while(i<10){
			System.out.println("Hello World");
			i++;
		}
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while��ʾѭ��������Ϊһ���������ʽ
		//���ж�������ѭ�������
		while(i<=100){
			a+=i;
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=1;
		//while��ʾѭ��������Ϊһ���������ʽ
		//���ж�������ѭ�������
		while(i<=10){
			a*=i;
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while��ʾѭ��������Ϊһ���������ʽ
		//���ж�������ѭ�������
		while(i<=100){
			if(i%3==0){
				a+=i;
			}
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=0;
		//while��ʾѭ��������Ϊһ���������ʽ
		//���ж�������ѭ�������
		while(i<=100){
			if(i%3==0&&i%5!=0){
				a+=i;
			}
			i++;
		}
		System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=0;
		//do while ��ִ�д���飬���ж�����
		do{
			a+=i;
			i++;
		}while(i<=100);
		System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=0;
		//do while ��ִ�д���飬���ж�����
		do{
			System.out.println("Hello World");
			i++;
		}while(i<10);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
	int i=1;
	int a=1;
	//do while ��ִ�д���飬���ж�����
	do{
		a*=i;
		i++;
	}while(i<=10);
			System.out.println(a);
	}
}

package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=1;
		int a=0;
		//do while ��ִ�д���飬���ж�����
		do{
			if(i%3==0&&i%5!=0){
			a+=i;
		    }
		    i++;
	    }while(i>=1&&i<=100);
		System.out.println(a);
    }
}
package p1;
//��������
public class TestIf{
	//����������
	public static void main(String[]args){
		int i=0;
	//while��ʾѭ��������Ϊһ���������ʽ
	//���ж�������ѭ�������
		while(i<10){
			System.out.println("Hello World");
			i++;
		}
	}
}