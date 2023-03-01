package org.example.idcard;

import org.example.framework.Factory;
import org.example.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int serial = 100;

    @Override

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
