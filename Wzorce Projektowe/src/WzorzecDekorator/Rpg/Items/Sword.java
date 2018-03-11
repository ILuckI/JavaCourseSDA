package WzorzecDekorator.Rpg.Items;

public class Sword extends Items {

    Items items;

    public Sword (Items items){
        this.items = items;
    }

    @Override
    public String pobierzOpis() {
        return "Cut all virgins";
    }

    @Override
    public int attackModify() {
        return items.getAttack() + 20;
    }

    @Override
    public int defencekModify() {
        return items.getDefence();
    }

    @Override
    public int backpackkModify() {
        return items.getBackpack();
    }
}
