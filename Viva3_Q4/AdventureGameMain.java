package q4_game;

public class AdventureGameMain {

    public static void main(String[] args) {
       //Create Player obj and Enemy obj with a name/type of your choice
       Player player = new Player("Maksim");
       Enemy enemy = new Enemy("Orc");
       
       //Create a few Item objects
       Item hp = new Item("Health Potion");
       Item sword = new Item("Sword");
       BlackMagic poison = new BlackMagic("Poison");
       BlackMagic magic = new BlackMagic("Magic Orb");
       
       //The player and enemy take turns attacking each other using the attack methods
       //Player and enemy initial health and attackPower
        System.out.print("Player's initial health: " + player.getHealth());
        System.out.println("\tAttack power: " + player.getAttackPower());
        System.out.print("Enemy's initial health: " + enemy.getHealth());
        System.out.println("\tAttack power: " + enemy.getAttackPower());
        System.out.println("");
       
        while(player.isAlive() && enemy.isAlive()){
            System.out.println("Player has attacked!");
            player.attack(enemy);
            player.printStatus();
            enemy.printStatus();
            System.out.println(player.toString(enemy));
            System.out.println("");
            
            if (!enemy.isAlive()) {
                System.out.println("Enemy was defeated!");
                break; // Exit the loop immediately if the enemy is defeated
            }

            System.out.println("Enemy has attacked!");
            enemy.attack(player);
            player.printStatus();
            enemy.printStatus();
            System.out.println(enemy.toString(player));
            System.out.println("");
            
            if (!player.isAlive()) {
                System.out.println("Player was defeated!");
                break; // Exit the loop immediately if the player is defeated
            }

            System.out.println("Item used by player!");
            System.out.println("Item's effect: " + hp.use(player));
            player.printStatus();
            enemy.printStatus();
            System.out.println(hp.toString());
            System.out.println("");
            
            if (!enemy.isAlive()) {
                System.out.println("Enemy was defeated!");
                break; // Exit the loop immediately if the enemy is defeated
            }
            
            System.out.println("Black Magic used by enemy!");
            System.out.println("Black Magic's primary effect: " + poison.use(player,enemy));
            player.printStatus();
            enemy.printStatus();
            System.out.println(poison.toString());
            System.out.println("");
            
            if (!player.isAlive()) {
                System.out.println("Player was defeated!");
                break; // Exit the loop immediately if the player is defeated
            }
            
            System.out.println("Player has attacked!");
            player.attack(enemy);
            player.printStatus();
            enemy.printStatus();
            System.out.println(player.toString(enemy));
            System.out.println("");
            
            if (!enemy.isAlive()) {
                System.out.println("Enemy was defeated!");
                break; // Exit the loop immediately if the enemy is defeated
            }

            System.out.println("Enemy has attacked!");
            enemy.attack(player);
            player.printStatus();
            enemy.printStatus();
            System.out.println(enemy.toString(player));
            System.out.println("");
            
            if (!player.isAlive()) {
                System.out.println("Player was defeated!");
                break; // Exit the loop immediately if the player is defeated
            }

            System.out.println("Item used by player!");
            System.out.println("Item's effect: " + sword.use(player));
            player.printStatus();
            enemy.printStatus();
            System.out.println(sword.toString());
            System.out.println("");
            
            if (!enemy.isAlive()) {
                System.out.println("Enemy was defeated!");
                break; // Exit the loop immediately if the enemy is defeated
            }
            
            System.out.println("Black Magic used by enemy!");
            System.out.println("Black Magic's primary effect: " + magic.use(player,enemy) + "00%");
            player.printStatus();
            enemy.printStatus();
            System.out.println(magic.toString());
            System.out.println("");
            
            if (!player.isAlive()) {
                System.out.println("Player was defeated!");
                break; // Exit the loop immediately if the player is defeated
            }

            System.out.println("");
        }
        
        if(!player.isAlive()){
            System.out.println("Enemy wins! The player was defeated.");
        }else{
            System.out.println("Player wins! The enemy was defeated.");
        }

        

        //(written in combat log that will be generated by toString method)  
        //Player use items
        //Result of the battle
    }
    
}
