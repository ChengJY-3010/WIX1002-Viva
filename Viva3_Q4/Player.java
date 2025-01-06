package q4_game;

public class Player {
    
    //Attributes
    private String name;
    private int health,attackPower,originalAttackPower;
    private boolean poisoned = false;
    
    //Constructor
    public Player(String name){
        this.name = name;
        health = 100;
        attackPower = 10;
        originalAttackPower = attackPower;
    }
    
    //Method
    //Reduces the enemy's health based on the player's attackPower
    int attack(Enemy enemy){
        enemy.setHealth(enemy.getHealth() - attackPower);
        resetAttackPower();
        return attackPower;
    }
    
    //Accessor method for attackPower
    public int getAttackPower(){
        return attackPower;
    }
    
    //Mutator method for attackPower
    public void setAttackPower(int atkPower){
        attackPower = atkPower;
    }
    
    //Returns true if the player's health is greater than 0
    boolean isAlive(){
        if(health > 0){
            return true;
        }
        return false;
    }
    
    //Returns the combat log
    public String toString(Enemy enemy) { 
        return "Update: Enemy's health has decreased to " + enemy.getHealth();
        
    }
    
    
    //Additional method
    //Returns the player's and enemy's health and attack power
    public void printStatus(){
        String log = name + " (Health: " + health + ", Attack Power(next/after restored/reset): " + attackPower + ")";
        System.out.println(log);
        
    }
    
    // Apply poison effect
    public void applyPoison() {
        if (!poisoned) {
            attackPower = (int) (attackPower * 0.9); // Reduce attack power by 10%
            poisoned = true; // Set poisoned status
        }
    }
    
    // Reset attack power
    public void resetAttackPower() {
        // Handle poison effect first
        if (poisoned) {
            attackPower = (int) Math.ceil(attackPower / 0.9); // Restore original attack power
            poisoned = false; // Reset poison status
        }

        // Handle Sword effect (reduce attack power by 15 if above original)
        if (this.attackPower > 10) {
            this.attackPower -= 15;
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
    
    //Accessor method for health
    public int getHealth(){
        return health;
    }
    
    //Mutator method for health
    public void setHealth(int health){
        this.health = health;
    }
}
