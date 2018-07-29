package com.theletterandrew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
		private List<Card> cards;

		public Deck(){
				this.cards = new ArrayList<>();
				for (Enums.Suit s: Enums.Suit.values()) {
						for (Enums.Face f: Enums.Face.values()) {
								this.cards.add(new Card(s.getId(), f.getId(), f.getValue()));
						}
				}
				Collections.shuffle(this.cards);
		}

		public Card draw(){
				return cards.remove(cards.size()-1);
		}


}
