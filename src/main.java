import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class main {

	public static void main(String[] args) {
	System.out.println("************�������ѡַ************");
    
    System.out.print("�����뽨�������(�������ֻس�ȷ��),");
    System.out.println("���������(�������ֻس�ȷ��)");
	Graph t = new Graph();
    int n=t.n;//����
    int e=t.e;//��
    int max=32767;
    int i,j,w;
    for(i=1;i<=n;i++)   //��ʼ��ͼ
    	for(j=1;j<=n;j++)
    		if(i==j) 
    			t.arcs[i][j]=0;
    		else t.arcs[i][j]=max;
   
    
    Scanner sc=new Scanner(System.in);
    for(int k=1;k<=e;k++) {
    	System.out.println("���������·����������λ�Լ���ͨ������λ���Ȩֵ");
    	System.out.println("�����һ����λ(��дӢ����ĸA-Z)");
     String b1=sc.next();
     System.out.println("����ڶ�����λ(��дӢ����ĸA-Z)");
     String b2=sc.next();
     System.out.println("����������λ��ľ���(����)");
     int c0=sc.nextInt();
     System.out.println("����������λ���Ƶ��(����)");
     int c1=sc.nextInt();
     int te=c0*c1;//���ݾ����Ƶ�ʼ���Ȩֵ
     String c=String.valueOf(te);
     String[] num=new String[3];//�洢��һ����λ �ڶ�����λ ��Ȩֵ
     num[0]=b1;num[1]=b2;num[2]=c;
     i=change(num[0]);//����ĸת��Ϊ���� ������ͼ��
     j=change(num[1]);//
     w=change(num[2]);//
     t.arcs[i][j]=w;  //
    }
    t.floyd(t, n);    //���ø��������㷨
    t.add(t);         //����
    
     
	}
	public static int change(String str) {   //����ĸת��Ϊ����
		int tp;
		switch(str) {
		case "A":
			return 1;
		case "B":
			return 2;
		case "C":
			return 3;
		case "D":
			return 4;
		case "E":
			return 5;
		case "F":
			return 6;
		case "G":
			return 7;
		case "H":
			return 8;
		case "I":
			return 9;
		case "J":
			return 10;
		case "K":
			return 11;
		case "L":
			return 12;
		case "M":
			return 13;
		case "N":
			return 14;
		case "O":
			return 15;
		case "P":
			return 16;
		}
		tp=Integer.parseInt(str);
		return tp;
	}

}
