public class Battle {

    public void startBattle(Player player, Enemy enemy){

        while(player.hp > 0 && enemy.hp > 0){

            player.attack(enemy);

            if(enemy.hp > 0){
                enemy.attack(player);
            }

        }

        if(player.hp > 0)
            System.out.println("Player wins!");
        else
            System.out.println("Enemy winsss!");

    }

}