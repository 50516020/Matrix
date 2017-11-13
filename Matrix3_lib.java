package matrix3

public class Matrix3_lib {
	
	private double a[][], b[][];
	
	public Matrix_3lib(double[][] a, double[][] b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getInnerProduct(double a[], double b[]){
		double answer=0;
		for(int i=0; i<a.length; i++){
			answer +=a[i]*b[i];
		}
		return answer;
	}
	public double[][] getTranspose(double a[][]){
		double t[][]=new double[a[0].length][a.length];
		for(int i=0;i<a[0].length;i++){
			for(int j=0; j<a.length;j++){
				t[i][j]=a[j][i];
			}
		}
		return t;
	}
	public double [][] getProduct(){
		double answer[][]=new double[a.length][b[0].length];
		double t[][]=this.getTranspose(this.b);
		for(int i=0;i< a.length; i++){
			for(int j=0;j<b[0].length; j++){
				answer[i][j]=this.getInnerProduct(this.a[i],t[j]);
				
			}
			
		}
		return answer;
		
	}
	public double [][] getProduct2(){
		double t[][]=getTranspose(this.b);
		return t;
	}

}
