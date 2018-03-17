package tictac;
import java.util.Scanner;

public class tictac {
	public static void main(String args[]){
		System.out.println("Welcome to the Tic Tac Toe Game");
		System.out.println("Rules to tic tac toe");//rules
		System.out.println("Pick x or o");
		System.out.println("Pick one square at a time");
		System.out.println("Get a line with 3 you win or fill it all up with x and o it is a draw");
		int[][] multi = new int[3][3]; // declare and create
        						// array of 3 integers;

		System.out.println("Pick a square from 0-2"); //print out instruction 1.
		Scanner aga = new Scanner(System.in); //take in input
		aga.nextInt(); //put it on the next line.
		System.out.println("Pick X or O"); //ask for x or o 
		Scanner sev = new Scanner(System.in); 
		sev.next();
		for(int i = 0; i < multi.length; i++)
		{
		    for(int j = 0; j < multi[i].length; j++)
		    {
		        System.out.print(multi[i][j]);

		    }
		    System.out.println();
		}
		
		}
	}

