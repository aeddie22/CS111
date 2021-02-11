package monster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonsterFighter extends Monster{

	
	private ArrayList<Monster> monsterPools = new ArrayList<Monster>();
	private ArrayList<Monster> player1Mons = new ArrayList<Monster>(2);
	private ArrayList<Monster> player2Mons = new ArrayList<Monster>(2);
	
	public void loadMonster(String fileName){
		
		File f1 = new File(fileName);
		Scanner sc = null;
		try {
			sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				Monster a = new Monster(sc.nextLine());
				if(a.hp != 0 && a.atk != 0) {
					monsterPools.add(a);
				}
			}
			for(int i = 0 ; i < 2 ; i++) {
				player1Mons.add(monsterPools.get(i));
				player2Mons.add(monsterPools.get(i+2));
			}
		}catch (FileNotFoundException e1) {
			System.out.println("File not found");
		}
	
	}
	public void printMonster() {
		System.out.println("Player 1");
			for(int i = 0 ; i < 2 ; i++) {
				System.out.println(player1Mons.get(i).toString());
			}
		System.out.println("Player 2");
			for(int i = 0 ; i < 2 ; i++) {
				System.out.println(player2Mons.get(i).toString());
			}
	}
	public void autoPlay() {
		System.out.println("---- Start Auto Play ----");
		printMonster();
		System.out.println("---- After Play ----");
		for(int i = 0 ; i < player1Mons.size() ; i++) {
			player1Mons.get(i).fight(player2Mons.get(getAtk()));
			player2Mons.get(i).fight(player1Mons.get(getAtk()));
		}
		printMonster();
		
	}
}
