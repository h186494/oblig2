package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for(int i = 0; i<matrise.length;i++) {
			for(int j = 0; j<matrise[i].length; j++) {
				System.out.print(matrise[i][j]+", ");
			}
			System.out.println(" ");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String tmpStr = "";
		for(int i = 0; i<matrise.length;i++) {
			for(int j = 0; j<matrise[i].length; j++) {
				tmpStr += (matrise[i][j]+" " );
			}
			tmpStr += ("\n");
		}
		return tmpStr;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] tmpMatrx = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i<matrise.length;i++) {
			for(int j = 0; j<matrise[i].length; j++) {
				tmpMatrx[i][j] = matrise[i][j]*tall;
			}
		}
		return tmpMatrx;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int[][] tmpMatrx = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i<matrise.length;i++) {
			for(int j = 0; j<matrise[i].length; j++) {
				tmpMatrx[i][j] = matrise[j][i];
				
			}
		}
		return tmpMatrx;
		
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// Denne funker ikke.
		int[][] tmpMatrx = new int[a.length][b[0].length];
		int i = 0;
		int j = 0;
		
		if(b.length == b.length) {
			for(;i<a.length; i++) {
				for(;j<a[i].length; j++) {
					tmpMatrx[i][j] = a[i][j]*b[i][j];
				}
			}
		}
		return tmpMatrx;
	
	}
}
