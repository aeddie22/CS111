package myProjectThinking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SummonerGame extends Summoner{

	private ArrayList<Summoner> allSummon = new ArrayList<Summoner>();
	private ArrayList<Summoner> player = new ArrayList<Summoner>();
	private ArrayList<Summoner> bot = new ArrayList<Summoner>();

	public void readSummonFromFile(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				Summoner sm = new Summoner(sc.nextLine());	
				allSummon.add(sm);			
			}
			for(int a= 0 ; a < allSummon.size() ; a++) {
				player.add(allSummon.get(a));
				bot.add(allSummon.get(a));
			}	
		}catch(FileNotFoundException e) {
			System.out.println("file not found! "+fileName+e);
		}catch(InputMismatchException e) {
			
		}
	}
	public void printData() {
		System.out.println("Player 1");
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(player.get(i).toString());
		}
	System.out.println("Player 2");
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(bot.get(i).toString());
		}

	}
	public void autoPlay() {
		System.out.println("---- Start Play ----");
		printData();
		System.out.println("---- After Play ----");
		for(int i = 0 ; i < player.size() ; i++) {
			player.get(i).attack(bot.get(getATK()));
			bot.get(i).attack(player.get(getATK()));
		}
		printData();
		
	}
	

}
