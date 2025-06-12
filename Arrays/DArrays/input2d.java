package DArrays;

import java.util.Scanner;

public class input2d {
    public static void main(String[] args) {
System.out.print("Enter The Size Of Rows : ");
Scanner sc=new Scanner (System.in);
sc.close();
int rows=sc.nextInt();
System.out.print("Enter The Size Of Columns : ");
Scanner scc=new Scanner (System.in);
scc.close();
int columns=scc.nextInt();
int [][]arr=new int [rows][columns];

System.out.println("Enter The Elements of 2-D Arrays : ");
for(int i=0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
{
arr[i][j]=sc.nextInt();
}
}

System.out.println("Elements of 2-D Arrays : ");
for(int i=0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
{
    
System.out.print(arr[i][j]+ " ");
}
System.out.println();
}

}
}
