import java.io.*;
import java.util.Scanner;



//派生的Chess国际象棋
public class Chess extends Game{
	
	public Chess(String inputname){
		super(inputname);
		
		board = new Board(8);
		size = 8;
		player1 = new Player("A", size,1);
		player2 = new Player("b", size,2);
		board.initboard_chess(player1, player2);	
		
	}
	
}	
