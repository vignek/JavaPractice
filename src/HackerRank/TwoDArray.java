package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TwoDArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
//		int arr[][] = new int[6][6];
//		for(int i=0; i < 6; i++) {
//			for(int j=0; j < 6; j++){
//				arr[i][j] = in.nextInt();
//			}
//		}
		
		for(int i=0; i<=3;i++) {
			for (int j=1;j<=4;j++){
				for(int k=0;k<=3;k++){
					
					System.out.print(i+"..i   ");
					System.out.print(j+"..j   ");
					System.out.print(k+"..k   ");
				}
			}
		}

	}

}
