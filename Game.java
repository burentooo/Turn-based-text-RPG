public class Game {

    public void startGame(){

        Player player = new Player("Hero",100,15,5);
        Enemy enemy = new Enemy("Goblin",80,10,3);

        Battle battle = new Battle();
        battle.startBattle(player, enemy);

    }

}