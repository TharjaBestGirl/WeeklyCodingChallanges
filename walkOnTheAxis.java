import java.util.ArrayList;

public class walkOnTheAxis {
    public static void walkOnTheAxis(int T, int[] N) {
        int answer;
        int temp;
    	for (int i = 0; i < T; i++) {
        	temp = N[i];
        	answer = temp;
        	for(int j = temp; j > 0; j--) {
        		answer = answer + j;
        	}
        	System.out.println(answer);
        }
    }

    public static void main(String args[]) {
    	int T = 2;
    	int[] N = {1,2};
    	
    	walkOnTheAxis(T,N);
    }
}
