package com.theletterandrew;

import java.util.ArrayList;

public class Player {
		private int handScore;
		private int gamesWon;
		private int gamesLost;
		private ArrayList cards;

		public Player(){
				this.gamesWon = 0;
				this.gamesLost = 0;
		}

		public int getHandScore() {
				return handScore;
		}

		public int getGamesWon() {
				return gamesWon;
		}

		public int getGamesLost() {
				return gamesLost;
		}

		public ArrayList getCards() {
				return cards;
		}
}
