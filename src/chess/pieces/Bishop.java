package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);		
	}
	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//northWest
		p.setValues(position.getRow() - 1, position.getColum() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() - 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiecE(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		
		//northEast
	    p.setValues(position.getRow() - 1, position.getColum() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() + 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiecE(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
						
		//southEast
		p.setValues(position.getRow() + 1, position.getColum() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() + 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiecE(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		
		//southWest
		p.setValues(position.getRow() + 1, position.getColum() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() - 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiecE(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		return mat;
	}

}
