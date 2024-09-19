package org.example;

public enum Weapon {
    SWORD(0,0),
    AXE(0,0),
    DAGGER(0,0);
 private int damage;
 private double attackSpeed;

  Weapon(int damage, double attackSpeed){
    this.damage = damage;
    this.attackSpeed=attackSpeed;
 };
public int getDamage(){
  return this.damage ;
}
public double getAttackSpeed(){
        return this.attackSpeed;
    }
}
