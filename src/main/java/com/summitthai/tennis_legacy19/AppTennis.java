package com.summitthai.tennis_legacy19;

public class AppTennis {

	public static void main(String[] args) {
		int player1 = 5;
		int player2 = 0;
		int point = 0;
		String name1 = "joe";
		String name2 = "jame";
//		String[] gameScoreChoice = { "Love", "15", "30", "40" };

		System.out.println(" Enter first player name1 ");

		if (player1 > player2) {
			point += 1;
			System.out.println(point);

			System.out.println(name1 + " WIN!!! ");
		} else {
			point -= 1;
			System.out.println(point);

			System.out.println(name2 + " WIN!!! ");
		}
	}
}
