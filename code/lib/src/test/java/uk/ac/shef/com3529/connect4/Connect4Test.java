package uk.ac.shef.com3529.connect4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Connect4Test {

    @Test
    public void shouldChangeTurn() {
        Connect4 c4 = new Connect4(7, 6);
        assertThat(c4.whoseTurn(), equalTo(Piece.RED));
        c4.makeMove(0);
        assertThat(c4.whoseTurn(), equalTo(Piece.YELLOW));
        c4.makeMove(0);
        assertThat(c4.whoseTurn(), equalTo(Piece.RED));
    }

    @Test
    public void shouldMakeMove() {
        Connect4 c4 = new Connect4(7, 6);
        c4.makeMove(3);
        assertThat(c4.getPieceAt(3, 0), equalTo(Piece.RED));
        c4.makeMove(3);
        assertThat(c4.getPieceAt(3, 1), equalTo(Piece.YELLOW));
    }

    @Test
    public void shouldNotAllowColumnToOverflow() {
        Connect4 c4 = new Connect4(7, 6);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        c4.makeMove(0);
        // the seventh move in this column causes an exception
        assertThrows(ColumnFullException.class, () -> {
            c4.makeMove(0);
        });
    }

    @Test
    public void shouldNotAllowInvalidColumns() {
        Connect4 c4 = new Connect4(7, 6);

        assertThrows(IllegalMoveException.class, () -> {
            c4.makeMove(-1);
        });

        assertThrows(IllegalMoveException.class, () -> {
            c4.makeMove(7);
        });
    }

    @Test
    public void shouldAllowHorizontalWinner() {
        Connect4 c4 = new Connect4(7, 6);
        c4.makeMove(0); // RED
        c4.makeMove(0); // YELLOW
        c4.makeMove(1); // RED
        c4.makeMove(1); // YELLOW
        c4.makeMove(2); // RED
        c4.makeMove(2); // YELLOW
        c4.makeMove(3); // RED
        assertThat(c4.isGameOver(), equalTo(true));
        assertThat(c4.winner(), equalTo(Piece.RED));
    }

    @Test
    public void shouldAllowVerticalWinner() {
        Connect4 c4 = new Connect4(7, 6);
        c4.makeMove(0); // RED
        c4.makeMove(1); // YELLOW
        c4.makeMove(0); // RED
        c4.makeMove(1); // YELLOW
        c4.makeMove(0); // RED
        c4.makeMove(1); // YELLOW
        c4.makeMove(0); // RED
        assertThat(c4.isGameOver(), equalTo(true));
        assertThat(c4.winner(), equalTo(Piece.RED));
    }
}
