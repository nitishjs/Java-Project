package com.nt.learning.araay;

public class twodarray {
	public static void main(String[] args) {
		int[][] s = new int[2][4];
	    s[0][0] = 2;
	    s[0][1] = 5;
	    s[0][2] = 7;
	    s[0][3] = 4;
	    s[1][0] = 9;
	    s[1][1] = 3;
	    s[1][2] = 2;
	    s[1][3] = 8;
	    System.out.println("Sum of the items produced in the first factory :");
	    int sum1 = 0, sum2 = 0;
	    for(int i = 0; i < 4; i++)
	    {
	      sum1 += s[0][i];
	    }
	    System.out.println(sum1);
	    System.out.println("Sum of the items produced in the second factory :");
	    for(int j = 0; j < 4; j++)
	    {
	      sum2 += s[1][j];
	    }
	    System.out.println(sum2);
}
}
