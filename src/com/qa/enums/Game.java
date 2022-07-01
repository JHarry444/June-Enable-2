package com.qa.enums;

import java.util.Random;

public class Game {

	public static void main(String[] args) {

	}

	private static Result play(RPS playerChoice) {
		int randNum = new Random().nextInt(3);

		RPS cpuChoice = null;
		if (randNum == 0)
			cpuChoice = RPS.ROCK;
		else if (randNum == 1)
			cpuChoice = RPS.PAPER;
		else if (randNum == 2)
			cpuChoice = RPS.SCISSORS;

		return playerChoice.matchup(cpuChoice);
	}
}
