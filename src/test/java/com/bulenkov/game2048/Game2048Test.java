package com.bulenkov.game2048;

import static org.junit.Assert.*;

import org.junit.Test;

public class Game2048Test {

	@Test
	public void givenGameStartsWhenGetCanMoveThenReturnsTrue() {
		Game2048 g = new Game2048();		
		assertTrue(g.canMove());
		
	}

}