package WzorzecDekorator.Rpg.Items;

public class Shild extends Items {
    Items items;

    public Shild (Items items){
        this.items = items;
    }
    @Override
    public String pobierzOpis() {
        return "Shild against the slut";
    }

    @Override
    public int attackModify() {
        return items.getAttack();
    }

    @Override
    public int defencekModify() {
        return items.getDefence() + 40;
    }

    @Override
    public int backpackkModify() {
        return items.getBackpack();
    }
}
