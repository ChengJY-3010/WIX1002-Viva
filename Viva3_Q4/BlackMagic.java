package q4_game;

public class BlackMagic {
    //Attributes
    private String name;
    private int effect;
    private String log;
    
    //Constructor
    public BlackMagic(String name){
        this.name = name;
        if ((this.name).equalsIgnoreCase("Poison")){
            this.effect = -10;
        }else if((this.name).equalsIgnoreCase("Magic Orb")){
            this.effect = 3;
        }
    }
    
    //Method
    //Uses the BlackMagic to enhance attack power or damage the player
    int use(Player player,Enemy enemy){
        if ((this.name).equalsIgnoreCase("Poison")){
            player.setOriginalAttackPower(player.getAttackPower());
            
            player.setHealth(player.getHealth() + effect);
            player.applyPoison();
            System.out.println("Black Magic used: " + this.name);
            
            log = "Update: Player's health has decreased to " + player.getHealth() + " and next attack power has decreased to " + player.getAttackPower();
            
        }else if((this.name).equalsIgnoreCase("Magic Orb")){
            enemy.setOriginalAttackPower(enemy.getAttackPower());
            
            enemy.setAttackPower((int)(enemy.getAttackPower() * effect));
            System.out.println("Black Magic used: " + this.name);
            log = "Update: Enemy's next attack power has increased from " + enemy.getOriginalAttackPower() + " to " + enemy.getAttackPower();
        }
        return effect;
    }
    
    //Returns the combat log
    public String toString() {
        return log;
    }
    
    
}
