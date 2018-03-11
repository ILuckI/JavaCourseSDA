package WzorzecDekorator.Rpg.Items;

public class Boots extends Items {
    Items items;
    @Override
    public String pobierzOpis() {
        return "Boots of stops";
    }

    @Override
    public int attackModify() {
        return items.getAttack();
    }

    @Override
    public int defencekModify() {
        return items.getDefence() + 10;
    }

    @Override
    public int backpackkModify() {
        return items.getBackpack() + 2;
    }
}
