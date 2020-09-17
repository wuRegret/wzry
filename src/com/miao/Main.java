package com.miao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    String name = getPlayerInput();
	    ISkill iSkill = HeroFactory.getHero(name);
	    iSkill.firstSkill();
    }

    private static String getPlayerInput(){
        System.out.println("Enter a Hero's Name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
