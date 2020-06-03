package com.revature.tourofheroes.service;

import com.revature.tourofheroes.models.Hero;

public class HeroService {
    public boolean createHero() {
        // For now we hard code because we are not doing user input yet
        String[] specialMoves = {"Heat Vision", "Flight", "invulnerability"};
        String[] specialMoves2 = {"Fly"};

        Hero newHero;
        //order matters in catch blocks
        try {
            newHero = new Hero("Superman", specialMoves, -2, false);
            String[] specialMove3 = newHero.getSpecialMove();
            System.out.println(specialMove3[3]);
            System.out.println(newHero);
        } catch (Exception e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //usually where clean up goes
            // ex close file input stream
            System.out.println("Tried to make a hero could've failed");
        }
        // try with resources - to read on
       return true;
    }
}
