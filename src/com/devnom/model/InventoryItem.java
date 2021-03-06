package com.devnom.model;

import static com.devnom.util.Helper.*;

/**
 * All classes that implement InventoryItem must have a unique 9 digit sku number.
 */
public abstract class InventoryItem implements IinventoryItem{
    protected final String skuNumber;


    public InventoryItem() {
        int skuNum = randomNumberGenerator();
        this.skuNumber = formatNumber(skuNum, 9);
    }

    public String getSKU() {
        return skuNumber;
    }

//    @Override
//    public String toString() {
//        return "Inventory Type: " + this.getClass().getSimpleName() +
//                " | SKU: [" + this.getSKU() + "]";
//    }

    @Override
    public String toString() {
        return " SKU#: " + this.getSKU() + "";
    }
}
