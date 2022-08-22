import java.util.Arrays;

public class MedianOfTwoArrays {
	public static void medianOfTwoArrays(int M, int N, int[] Num1, int[] Num2) {
        double answer;
        int[] temp = new int[M+N];
    	
        System.arraycopy(Num1, 0, temp, 0, M);
        System.arraycopy(Num2, 0, temp, M, N);
        
        Arrays.sort(temp);
        
        if ((M+N) % 2 == 1) {
        	System.out.println(temp[(M+N)/2]);
        }
        else {
        	answer = ((double)temp[(M+N)/2] + (double)temp[((M+N)/2)-1])/2;
        	System.out.println(answer);
        }
    }

    public static void main(String args[]) {
    	int M = 2;
    	int N = 1;
    	int[] Num1 = {1,3};
    	int[] Num2 = {2};
    	
    	medianOfTwoArrays(M,N,Num1,Num2);
    	
    	M = 2;
    	N = 2;
    	int[] Num3 = {1,2};
    	int[] Num4 = {3,4};
    	
    	medianOfTwoArrays(M,N,Num3,Num4);
    }
}
