
public class Matrix3_main {

	import java.util.Arrays;

import matrix.Matrix_lib;

	public class Matrix_main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double a[][]={{0,1},{2,0},{0,3}};
			double b[][]={{1,-1,2},{3,0,4}};
			Matrix_lib mlib = new Matrix_lib(a,b);
			
	        System.out.println("Inner Product = "+ Arrays.deepToString(mlib.getProduct()));
	        System.out.println("Inner Transpose = "+ Arrays.deepToString(mlib.getProduct2()));
		}

	}
