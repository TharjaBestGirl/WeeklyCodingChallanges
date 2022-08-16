
public class yourNameIsMine {
	public static void yourNameIsMine(int T, String[][] S) {
		for (int i = 0; i < T; i++) {
			int l = 0; 
			int r = 0;
	        while(l < S[i][0].length() && r < S[i][1].length()) {
	            if(S[i][0].charAt(l) == S[i][1].charAt(r)) {
	            	l++;
	            }
	            r++;
	        }

	        if (S[i][0].length() == l) {
	        	System.out.println("YES");
	        }
	        else {
	        	System.out.println("NO");
	        }
		}
    }

    public static void main(String args[]) {
    	int T = 3;
    	String[][] S = {{"john","johanna"},{"ira","ira"},{"kayla","jayla"}};
    	
    	yourNameIsMine(T,S);
    }
}

/*
john johanna
ira ira
kayla jayla*/