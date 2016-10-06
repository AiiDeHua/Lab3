package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DeckBuildTest()
	{
		Deck NewDeck = new Deck();
		assertTrue(NewDeck.getdeck().size() == 52);
	}
	
	@Test
	public void DeckBuildTestWithJoker(){
		Deck NewDeck = new Deck(2);
		int count = 0;
		for (int index = 0; index <  NewDeck.getdeck().size(); index ++){
			if(NewDeck.getdeck().get(index).geteRank() == eRank.JOKER){
				count+=1;
			}
		}
		assertTrue(count == 2);
	}
	@Test
	public void DeckBuildTestWithWilds(){
		ArrayList<Card> Wilds = new ArrayList<Card>();
		Wilds.add(new Card(eSuit.CLUBS,eRank.ACE,1));
		Wilds.add(new Card(eSuit.SPADES,eRank.ACE,1));
		Wilds.add(new Card(eSuit.HEARTS,eRank.ACE,1));
		Wilds.add(new Card(eSuit.DIAMONDS,eRank.ACE,1));
		Deck NewDeck = new Deck(0,Wilds);
		
		int count = 0;
		for (int index = 0; index < NewDeck.getdeck().size(); index ++){
			if(NewDeck.getdeck().get(index).isbWild()){
				count+=1;
			}
		}
		assertTrue(count == 4);
	}
	@Test
	public void DeckBuildTestDraw() throws DeckException{
		Deck NewDeck = new Deck();
		NewDeck.Draw();
		assertTrue(NewDeck.getdeck().size() == 51);
	}
	
	@Test(expected = DeckException.class)
	public void DeckBuildTestOverDraw() throws DeckException{
		Deck NewDeck = new Deck();
		for(int count = 0; count < 53 ; count ++){
			NewDeck.Draw();
		}
	}
}
