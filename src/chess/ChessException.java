package chess;

import boardgame.BoardExeptin;

public class ChessException extends BoardExeptin {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
