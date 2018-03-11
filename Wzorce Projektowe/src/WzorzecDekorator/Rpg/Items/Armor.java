package WzorzecDekorator.Rpg.Items;

public class Armor extends Items {

    Items items;

    @Override
    public String pobierzOpis() {
        return "Tors of anihilation";
    }

    @Override
    public int attackModify() {
        return items.getAttack();
    }

    @Override
    public int defencekModify() {
        return items.getDefence() + 20;
    }

    @Override
    public int backpackkModify() {
        return items.getBackpack();
    }


}
