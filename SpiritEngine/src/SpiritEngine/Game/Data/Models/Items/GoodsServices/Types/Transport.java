package SpiritEngine.Game.Data.Models.Items.GoodsServices.Types;

import SpiritEngine.Game.Data.Models.Items.Item;

public class Transport extends Item {

    public double weight;

    public Transport(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}