package com.Sapient.Week4;

public class Matrix {
	
	private int[][] matrix;
	private int n;
	private int m;
	
	public Matrix() {
		matrix = new int[3][3];
		this.m = 3;
		this.n = 3;
	}
	
	public Matrix(int i, int j) {
		// TODO Auto-generated constructor stub
		matrix = new int[i][j];
		this.m = i;
		this.n = j;
	}
	
	public Matrix(int[][] mat) {
		this.m = mat.length; 
		this.n = mat[0].length; 
		
		matrix = new int[m][n];
		
		for(int i = 0 ; i < this.m ; i++ )
			for(int j = 0 ; j < this.n ; j++)
				matrix[i][j] = mat[i][j];
		
	}	
	
	public void display()
	{
		for(int i = 0 ; i < this.m ; i++)
		{
			for(int j = 0 ; j < this.n ; j++)
			{
				System.out.print(this.matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void readMatrix()
	{
		Read read = new Read();
		for(int i = 0 ; i < this.m ; i++)
		{
			for(int j = 0 ; j < this.n ; j++)
				matrix[i][j] = read.nextIntegerInput();
		}
	}	
	
	public int[][] addition(int[][] matrix2)
	{
		int m2 = matrix2.length;
		int n2 = matrix[0].length;
		
		if(this.m != m2 || this.n != n2)
			return matrix;
		
		int[][] additionMatrix = new int[this.m][this.n];
		
		for(int i = 0 ; i < this.m ; i++ )
			for(int j = 0 ; j < this.n ; j++)
				additionMatrix[i][j] = matrix[i][j] + matrix2[i][j];
		
		return additionMatrix;
	}	
	
	public boolean isScalar() {
		
		if(this.m !=this.n)
			return false;
		
		int root = matrix[0][0];
		
		for(int i = 0 ; i < this.m ; i++)
		{
			for(int j = 0 ; j < this.m ; j++ )
			{
				if(i != j)
				{	if(matrix[i][j] != 0)
						return false;
				
				} else if(matrix[i][j] != root)
					return false;
			}
		}
		
			
		return true;
		
	}
	
	public int[][] multipyMatrix (int[][] mat){
		int m2 = mat.length;
		int n2  = mat[0].length;
		
		if (this.n != m2) { 
            System.out.println("\nMultiplication Not Possible"); 
            return matrix; 
        } 
  
        int C[][] = new int[this.m][n2]; 
   
        for (int i = 0; i < this.m; i++) { 
            for (int j = 0; j < n2; j++) { 
                for (int k = 0; k < m2; k++) 
                    C[i][j] += matrix[i][k] * mat[k][j]; 
            } 
        }
        
        return C;
	}
	

}
