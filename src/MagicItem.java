public abstract class MagicItem {
    String name;
    String description;
    int weight;
    String modifies;
    int modifyAmount;
}


public class Potion extends MagicItem{
    String modifies="Health";
    int modifyAmount=100;
    void quaff(Person p){//Drink
        p.attributes.get(modifies).increaseValue(this.modifyAmount);

    }
}

