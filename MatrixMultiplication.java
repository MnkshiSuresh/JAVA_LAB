import java.util.Scanner;
public class MatrixMultiplication{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    int i,j;
    System.out.println("enter the no of rows in matrix 1:");
    int m=s.nextInt();
    System.out.println("enter the no of column in matrix 1:");
    int n=s.nextInt();
    System.out.println("enter the no of rows in matrix 2:");
    int p=s.nextInt();
    System.out.println("enter the no of column in matrix 2:");
    int q=s.nextInt();
    System.out.println("enter the values of matrix 1:");
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        a[i][j]=s.nextInt();}}
    System.out.println("enter the values of matrix 2:");
    for(i=0;i<p;i++){
      for(j=0;j<q;j++){
        b[i][j]=s.nextInt();}}
    if(m!=p){
      System.out.println("multiplication not possible");}
    else{
      for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            int sum=0;
          for(int k=0;k<m;k++){
            sum=sum+a[i][k]*b[k][j];}
          c[i][j]=sum;
        }
      }
      System.out.println("Resultant matrix:");
      for(i=0;i<p;i++){
        for(j=0;j<q;j++){
          System.out.println(c[i][j]);}
      }System.out.println();
    }
  }
}
