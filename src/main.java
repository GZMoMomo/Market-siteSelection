import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class main {

	public static void main(String[] args) {
	System.out.println("************超市最佳选址************");
    
    System.out.print("请输入建筑物个数(输入数字回车确定),");
    System.out.println("请输入边数(输入数字回车确定)");
	Graph t = new Graph();
    int n=t.n;//顶点
    int e=t.e;//边
    int max=32767;
    int i,j,w;
    for(i=1;i<=n;i++)   //初始化图
    	for(j=1;j<=n;j++)
    		if(i==j) 
    			t.arcs[i][j]=0;
    		else t.arcs[i][j]=max;
   
    
    Scanner sc=new Scanner(System.in);
    for(int k=1;k<=e;k++) {
    	System.out.println("请输入存在路径的两个单位以及相通两个单位间的权值");
    	System.out.println("输入第一个单位(大写英文字母A-Z)");
     String b1=sc.next();
     System.out.println("输入第二个单位(大写英文字母A-Z)");
     String b2=sc.next();
     System.out.println("输入两个单位间的距离(数字)");
     int c0=sc.nextInt();
     System.out.println("输入两个单位间的频率(数字)");
     int c1=sc.nextInt();
     int te=c0*c1;//根据距离和频率计算权值
     String c=String.valueOf(te);
     String[] num=new String[3];//存储第一个单位 第二个单位 和权值
     num[0]=b1;num[1]=b2;num[2]=c;
     i=change(num[0]);//将字母转换为数字 保存在图中
     j=change(num[1]);//
     w=change(num[2]);//
     t.arcs[i][j]=w;  //
    }
    t.floyd(t, n);    //调用弗洛伊德算法
    t.add(t);         //汇总
    
     
	}
	public static int change(String str) {   //将字母转换为数字
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
