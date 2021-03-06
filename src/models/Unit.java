package models;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Unit {
	private String name;
	private int baseHealth;
	private int health;
	private int mana;
	private int baseMana;
	private int armor;
	private int baseDamage;
	private int damage;
	private int speed;
	private int criticalChance;
	private int missChance;
	protected boolean playableCharacter = false;
	private final int ID;
	private int targeting; 
	private boolean chargingUp = false;

	static AtomicInteger nextId = new AtomicInteger();
	DecimalFormat df = new DecimalFormat("###");	
	Scanner sc = new Scanner(System.in);
		
	public Unit() {
		//This is used to remove or bring back a unit from death by its ID.
		//It increments 1 for every unit so its always a unique number
		//the atomic part ensures that the integer is unique. There CANT be two of the
		//same value.
		ID = nextId.incrementAndGet(); 
	}
			
	public int getHealth() {	
		return health;
	}
	
	public void setHealth(int health) {		
		this.health = health;
		if (this.health < 1) {
			this.health = 0;
		} 
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int health) {
		this.baseDamage = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		this.criticalChance = criticalChance;
	}

	public int getMissChance() {
		return missChance;
	}

	public void setMissChance(int missChance) {
		this.missChance = missChance;
	}
	
	public boolean getPlayable() {
		return playableCharacter;
	}
	
	public int getId() {
		return ID;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int buffedDamage) {
		this.damage = buffedDamage;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	public void setBaseHealth(int baseHealth) {
		this.baseHealth = baseHealth;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getBaseMana() {
		return baseMana;
	}

	public void setBaseMana(int baseMana) {
		this.baseMana = baseMana;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 15) {
			System.out.println("NAME TOO LONG! Names can be a maximum of 15 characters long. Try again:");
			setName(sc.nextLine());
		} else {
			this.name = name;
		}		
	}

	public int getTargeting() {
		return targeting;
	}

	public void setTargeting(int targeting) {
		this.targeting = targeting;
	}
	
	public boolean isCharging() {
		return chargingUp;
	}

	public void setCharging(boolean chargingUp) {
		this.chargingUp = chargingUp;
	}
}
