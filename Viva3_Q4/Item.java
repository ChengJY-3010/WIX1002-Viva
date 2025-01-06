package q4_game;

public class Item {
    //Attributes
    private String name;
    private int effect;
    private String log;
    
    //Constructor
    public Item(String name){
        this.name = name;
        if((this.name).equalsIgnoreCase("Health Potion")){
            this.effect = 20;
        }else if((this.name).equalsIgnoreCase("Sword")){
            this.effect = 15;
        }
        
    }
    
    //Method
    //Uses the item's effect
    int use(Player player){
        if ((this.name).equalsIgnoreCase("Health Potion")){
            player.setHealth(player.getHealth()+ effect); 
            log = "Update: Player's health has increased to " + player.getHealth();
        }else if((this.name).equalsIgnoreCase("Sword")){
            player.setOriginalAttackPower(player.getAttackPower());
            player.setAttackPower(player.getAttackPower() + effect);
            log = "Update: Player's next attack power has increased from " + player.getOriginalAttackPower() + " to " + player.getAttackPower();
        }
        
        System.out.println("Item used: " + this.name);
        return effect;
    }
    
    //Returns the combat log
    public String toString() {
        return log;
    }
    
}
