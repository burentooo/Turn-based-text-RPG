public class Item {

    String name;
    int healAmount;

    public void use(Player player){
        player.hp += healAmount;
    }
}