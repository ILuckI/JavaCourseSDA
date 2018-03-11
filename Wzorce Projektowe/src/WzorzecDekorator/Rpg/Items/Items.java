package WzorzecDekorator.Rpg.Items;

import WzorzecDekorator.Rpg.DarkRanger;

public abstract class Items extends DarkRanger{
    public abstract String pobierzOpis();
    public abstract int attackModify();
    public abstract int defencekModify();
    public abstract int backpackkModify();



}
