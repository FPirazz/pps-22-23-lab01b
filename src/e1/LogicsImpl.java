package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Chessboard board;
	 
    public LogicsImpl(final int gridSize){
    	board = new ChessboardImpl(gridSize);
	}

	public LogicsImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
		board = new ChessboardImpl(gridSize, knightPosition, pawnPosition);
	}
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.board.getSize() || col >= this.board.getSize()) {
			throw new IndexOutOfBoundsException();
		}

		this.board.getKnight().move(row, col);

		if (this.board.getKnight().getCoordinates().equals(this.board.getPawn().getCoordinates())) {
			return true;
		}

		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return ( this.board.getKnight().getCoordinates().equals(new Pair<>(row,col)) );
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.board.getPawn().getCoordinates().equals(new Pair<>(row,col));
	}


}
