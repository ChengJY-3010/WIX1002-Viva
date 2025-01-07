package q4_game;

public class Enemy {
    
    //Attributes
    private String type;
    private int health,attackPower,originalAttackPower;
    
    //Constructor
    public Enemy(String type){
        this.type = type;
        health = 50;
        attackPower = 5;
        originalAttackPower = attackPower;
    }
    
    //Method
    //Reduces the player’s health based on the enemy’s attackPower. 
    void attack(Player player){
        player.setHealth(player.getHealth() - attackPower);
        resetAttackPower();
    }
    
    //Returns true if the enemy's health is greater than 0
    boolean isAlive(){
        if(health > 0){
            return true;
        }
        return false;
    }
    
    //Returns the combat log
    public String toString(Player player) {
        return "Update: Player's health has decreased to " + Math.max(0,player.getHealth());
    }
    
    //Additional method
    //Returns the player's and enemy's health and attack power
    public void printStatus(){
        String log = type + " (Health: " + Math.max(0,health) + ", Attack Power(next/after restored/reset): " + attackPower + ")";
        System.out.println(log);
    }
    
    // Reset attack power
    public void resetAttackPower() {
        while(this.attackPower>5){
            this.attackPower/=3;
        }
    }
    
    //Accessor method for originalAttackPower
    public int getOriginalAttackPower(){
        return originalAttackPower;
    }
    
    //Mutator method for OriginalAttackPower
    public void setOriginalAttackPower(int atkPower){
        originalAttackPower = atkPower;
    }
    
    //Accessor method for attackPower
    public int getAttackPower(){
        return attackPower;
    }
    
    //Mutator method for attackPower
    public void setAttackPower(int atkPower){
        attackPower = atkPower;
    }
    
    //Accessor method for health
    public int getHealth(){
        return health;
    }
    
    //Mutator method for health
    public void setHealth(int health){
        this.health = health;
    }
    
}
