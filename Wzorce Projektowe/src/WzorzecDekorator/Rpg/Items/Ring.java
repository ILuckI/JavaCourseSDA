package WzorzecDekorator.Rpg.Items;

public class Ring extends Items {
    Items items;

    @Override
    public String pobierzOpis() {
        return "Ring of black hole";
    }

    @Override
    public int attackModify() {
        return items.getAttack() + 10;
    }

    @Override
    public int defencekModify() {
        return items.getDefence() + 10;
    }

    @Override
    public int backpackkModify() {
        return items.getBackpack() + 3;
    }
}
