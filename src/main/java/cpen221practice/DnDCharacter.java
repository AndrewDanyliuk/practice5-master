package cpen221practice;

import java.util.Arrays;
import java.util.Collections;

class DnDCharacter {

    int ability() {
        return sumOfTopThreeDie(3);
    }

    int modifier(int input) {
        return (int) Math.floor(((input - 10) / 2.0));
    }

    int getStrength() {
        return sumOfTopThreeDie(3);
    }

    int getDexterity() {
        return sumOfTopThreeDie(3);
    }

    int getConstitution() {
        return sumOfTopThreeDie(3);
    }

    int getIntelligence() {
        return sumOfTopThreeDie(3);
    }

    int getWisdom() {
        return sumOfTopThreeDie(3);
    }

    int getCharisma() {
        return sumOfTopThreeDie(3);
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    int rollOneDice()
    {
        int max = 6;
        int min = 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    int sumOfTopThreeDie(int numberOfDice)
    {
        Integer[] rolls = new Integer[numberOfDice];
        int sum = 0;
        for(int i = 0; i < numberOfDice; ++i)
        {
            rolls[i] = rollOneDice();
        }
        Arrays.sort(rolls, Collections.reverseOrder());
        for(int i = 0; i < 3; ++i)
        {
            sum += rolls[i];
        }
        return sum;
    }

}
