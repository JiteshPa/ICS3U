package patel;

import java.util.Scanner;

public class ccc04j3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		
		int m=scn.nextInt();
		int n=scn.nextInt();
		String[] adj=new String [m];
		String [] noun=new String[n];
		for (int i=0;i<m;i++)
		{
			adj[i]=scn.nextLine();
		}
		for (int i=0;i<n;i++)
		{
			noun[i]=scn.nextLine();
		}
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;i++)
			{
				System.out.println(adj[i]+" as "+noun[j]);
			}
		}

	}

}
