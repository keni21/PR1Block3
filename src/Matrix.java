
public class Matrix {

	public static void main(String[] args) {
		
		double[][] idMat4 = generateIdentityMatrix(4);
		printMatrix(idMat4);

		System.out.println();
		
		double[][] idMat7 = generateIdentityMatrix(7);
		printMatrix(idMat7);
		
		System.out.println();
		
		double[][] idMat1 = generateIdentityMatrix(1);
		printMatrix(idMat1);

	}
	
	public static void printMatrix(double[][] matrix) {
		
		//the outer for loop runs across all the
		//arrays of the 2d array (=that is its 1st dimension)
		for(int i=0;i < matrix.length; i++) {
			//the inner for loop runs up to the number of
			//elements in the corresponding array referred
			//to using the outer loop's i variable
			//(= that is its 2nd dimension)
			for(int n=0; n < matrix[i].length; n++) {
				System.out.print(matrix[i][n]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static double[][] generateIdentityMatrix(int size) {
		
		double[][] idMat = new double[size][size];
		//NOTE: The identity matrix is always quadratic and
		//we just need to set diagonal values to 1.0. Thus
		//there's only a single for loop needed here...
		for(int z=0;z<size;z++) {
			idMat[z][z] = 1.0;
		}
		return idMat;
		
	}

}
