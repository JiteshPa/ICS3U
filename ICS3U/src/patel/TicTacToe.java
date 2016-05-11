package patel;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		String [][] tttBoard=new String [3][3];
		tttBoard[0][0]="";
		tttBoard[0][1]="";
		tttBoard[0][2]="";
		tttBoard[1][0]="";
		tttBoard[1][1]="";
		tttBoard[1][2]="";
		tttBoard[2][0]="";
		tttBoard[2][1]="";
		tttBoard[2][2]="";
		
		boolean win=false;
		int row;
		int column;
		
		Scanner scn=new Scanner (System.in);
		
		while (win==false)
		{
			System.out.println("What are the coordinates you would like to place the X(e.g. 3 1)");
		
			row=scn.nextInt();
			column=scn.nextInt();
		
			tttBoard[row-1][column-1]="X";
		
			System.out.println(tttBoard[0][0]+"     "+tttBoard[0][1]+"     "+tttBoard[0][2]);
			System.out.println(tttBoard[1][0]+"     "+tttBoard[1][1]+"     "+tttBoard[1][2]);
			System.out.println(tttBoard[2][0]+"     "+tttBoard[2][1]+"     "+tttBoard[2][2]);
		
			
			if(tttBoard[0][0]==tttBoard[0][1]&&tttBoard[0][0]==tttBoard[0][2]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][1]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][0]&&tttBoard[0][0]==tttBoard[2][0]&&!tttBoard[1][0].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][0]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][1]&&tttBoard[0][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][2]+" wins!");
				win=true;
			}
			else if(tttBoard[0][2]==tttBoard[1][1]&&tttBoard[0][2]==tttBoard[2][0]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else
			{
				win=false;
			}
			
			System.out.println("What are the coordinates you would like to place the O(e.g. 3 1)");
		
			row=scn.nextInt();
			column=scn.nextInt();
		
			tttBoard[row-1][column-1]="O";
		
			System.out.println(tttBoard[0][0]+"     "+tttBoard[0][1]+"     "+tttBoard[0][2]);
			System.out.println(tttBoard[1][0]+"     "+tttBoard[1][1]+"     "+tttBoard[1][2]);
			System.out.println(tttBoard[2][0]+"     "+tttBoard[2][1]+"     "+tttBoard[2][2]);
			
			if(tttBoard[0][0]==tttBoard[0][1]&&tttBoard[0][0]==tttBoard[0][2]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][1]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][0]&&tttBoard[0][0]==tttBoard[2][0]&&!tttBoard[1][0].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][0]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][1]&&tttBoard[0][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][2]+" wins!");
				win=true;
			}
			else if(tttBoard[0][2]==tttBoard[1][1]&&tttBoard[0][2]==tttBoard[2][0]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else
			{
				win=false;
			}
		}

	}

}
