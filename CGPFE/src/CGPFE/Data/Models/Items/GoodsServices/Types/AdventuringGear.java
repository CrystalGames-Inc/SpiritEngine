package CGPFE.Data.Models.Items.GoodsServices.Types;

import CGPFE.Data.Models.Items.Item;

public class AdventuringGear extends Item {

    double weight;

    public AdventuringGear(String name, int itemId, double cost, double weight) {
        super(name, itemId, cost);
        this.weight = weight;
    }
}
