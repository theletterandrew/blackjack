package com.theletterandrew;

import java.util.ArrayList;

public class Player {

		private int currency;
		private int gamesWon;
		private int gamesLost;
		private ArrayList cards;
		private int handScore;

		public Player(){
				this.gamesWon = 0;
				this.gamesLost = 0;
				this.currency = 500;
		}

		public int getCurrency() {
				return currency;
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
