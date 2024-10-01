package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		// TODO
		int i;
		for(i=0; i<=tabell.length-1; i++ ) {
			System.out.println(tabell[i]);
			

		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String strTab = "[";
		int i;
		for(i=0; i<tabell.length;i++) {
			strTab += tabell[i];
			if (i<tabell.length-1) {
				strTab += ",";
			}
			}
		
		
		strTab = strTab + "]";
				
		return strTab;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for( int i = 0; i<tabell.length; i++) {
			if(tabell[i] == tall) {
				return true;
			}
			
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for( int i = 0; i<tabell.length; i++) {
			if(tabell[i] == tall) {
				return i;
			}
			
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] tempList = new int[tabell.length];
		int j = 0;
		
		for(int i = tabell.length-1; i>=0; i--) {
			tempList[j] = tabell[i];
			j++;
			
		}
		return tempList;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for(int i = 0; i<tabell.length-1; i++) {
			if(tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int[] tmpList = new int[tabell1.length+tabell2.length];
		
		for(int i = 0; i < tabell1.length; i++) {
			tmpList[i] = tabell1[i];
		}
		for(int j = 0; j < tabell2.length; j++) {
			tmpList[tabell1.length + j] = tabell2[j];
		}
		return tmpList;

	}
}
