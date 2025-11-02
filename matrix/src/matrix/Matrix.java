package matrix;
import java.util.*;

public class Matrix
{
	private int r;
	private int c;
	private int mat[][];
	
	public Matrix(int r, int c)
	{
		this.r = r;
		this.c = c;
		this.mat = new int[r][c];
		
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter elements : ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void display()
	{
		int i,j;
		System.out.println("Matrix is: ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void add(Matrix x, Matrix y)
	{
		int i,j;
		System.out.println("Addition of both Matrices is: ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat[i][j] = x.mat[i][j] + y.mat[i][j];
			}
		}
		
	}
	
	public void mul(Matrix x, Matrix y)
	{
		int i,j;
		System.out.println("Multiplication of both Matrices is: ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				for(int k=0; k<r; k++)
				{
					mat[i][j] = x.mat[k][j] * y.mat[i][k];
				}
			}
		}
	}
	
	public void trans(Matrix x)
	{
		int i,j;
		int temp[][];
		System.out.println("Transpose of matrix 1 is : ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat[i][j] = x.mat[i][j];
			}
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		r = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		c = sc.nextInt();
		
		Matrix m1 = new Matrix(r, c);
		m1.input();
		m1.display();
		
		Matrix m2 = new Matrix(r, c);
		m2.input();
		m2.display();
		
		Matrix result = new Matrix(r,c);
		result.add(m1, m2);
		result.display();
		
		result.mul(m1, m2);
		result.display();
		
		result.trans(m1);
		result.display();
		
		
		
		
	}
}
