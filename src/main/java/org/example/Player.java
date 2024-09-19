package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;
    public Player(String name, int healthPercentage, Weapon weapon){
        if(healthPercentage <0) this.healthPercentage = 0;
        else if(healthPercentage>100)this.healthPercentage = 100;
        else this.healthPercentage=healthPercentage;
        this.name = name;
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.healthPercentage =  this.healthPercentage - damage;
        if(healthPercentage<0) {
            this.healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage = healthPotion + healthPercentage;
        if(healthPercentage > 100) this.healthPercentage = 100;
    }

}
