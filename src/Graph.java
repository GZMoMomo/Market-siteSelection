import java.util.Scanner;

public class Graph {
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();//顶点
   int e=sc.nextInt();//边
   int max=32767;
   int arcs[][]=new int[n+1][n+1];//有向图
   int a[][]=new int[n+1][n+1];//顶点间的路径长度
   int path[][]=new int[n+1][n+1];//前一顶点的顶点号
   
   
   public void floyd(Graph graph,int n) {
	  for(int i=1;i<=n;i++)  
		  for(int j=1;j<=n;j++) {
			  graph.a[i][j]=graph.arcs[i][j]; //将两顶点的权值 存储到另一个二维数组
			  if((i!=j)&&(a[i][j]<max)) 
				  graph.path[i][j]=i;
			  else 
				  graph.path[i][j]=0;
		  }
	      for(int k=1;k<=n;k++) {                 //从i号顶点到j号顶点只经过前k号点的最短路程。
	    	  for(int i=1;i<=n;i++)
	    		  for(int j=1;j<=n;j++)
	    			  if(graph.a[i][k]+graph.a[k][j]<graph.a[i][j]) {
	    				  graph.a[i][j]=graph.a[i][k]+graph.a[k][j];
	    				  graph.path[i][j]=graph.path[k][j];
	    			  }
	      }
	        for(int i=1;i<=n;i++)           //读取图中的数据打印出来
	        	for(int j=1;j<=n;j++) {
	        		if(i!=j) {
	        			System.out.print(change(i)+"到"+change(j)+"的权值为"+graph.a[i][j]);
	        		
	        			System.out.println();
	        		}
	        	}
   }
   
  
   public void add(Graph graph) {
	   int[] sum=new int[n+1];   //创建一维数组存储每栋楼的总权值
	   for(int i=0;i<n+1;i++)    //初始化一位数组
	   sum[i]=0;                   
	   for(int i=1;i<=n;i++) {   //开始计算每栋楼的总权值
		   for(int j=1;j<=n;j++) {
			   if(i!=j) {
				   sum[i]=sum[i]+graph.a[i][j];
			   }
		   }
		   System.out.println();
		   if(sum[i]>30000) {           //判断两顶点间是否为通路
			    System.out.print(change(i)+"无法到达各顶点");
		   }else {
			   System.out.print(change(i)+"到各顶点的权值总和为"+sum[i]);
		   }
		  
		   System.out.println();
	   }
	   sum[0]=sum[1];
	   int address=1;
	   for(int i=2;i<n+1;i++)    //排序 从小到大
		   if(sum[0]>sum[i]) {
			   sum[0]=sum[i];
			   address=i;
		   }
	   System.out.println("所以最小权值总和为"+sum[0]+","+"学院超市的最佳选址为顶点"+change(address));
      System.out.println("(权值总和越小代表该处总体越优)");
   }
   
   
   public static String change(int i) {        //将数字转换为字母
		String str=null;
		switch(i) {
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		case 6:
			return "F";
		case 7:
			return "G";
		case 8:
			return "H";
		case 9:
			return "I";
		case 10:
			return "J";
		case 11:
			return "K";
		case 12:
			return "L";
		case 13:
			return "M";
		case 14:
			return "N";
		case 15:
			return "O";
		case 16:
			return "P";
		}
		return str;
	}
}
