package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionIsCorrect() {
        Cell expected = Cell.B3;
        Figure bishop = new BishopBlack(expected);
        Cell out = bishop.position();
        assertEquals(expected, out);
    }

    @Test
    public void whenCopyIsCorrect() {
        Figure bishop = new BishopBlack(Cell.H4);
        Cell expected = Cell.C1;
        Figure bishopCopy = bishop.copy(expected);
        Cell out = bishopCopy.position();
        assertEquals(expected, out);
    }

    @Test
    public void whenWayIsCorrect() {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] out = bishop.way(Cell.G5);
        assertArrayEquals(expected, out);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove() {
        Figure bishop = new BishopBlack(Cell.C1);
        bishop.way(Cell.G2);
    }

}