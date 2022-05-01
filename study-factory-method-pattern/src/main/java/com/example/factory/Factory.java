package com.example.factory;

public abstract class Factory {
    public final Product create(String serialNumber) {
        // Productを生成して登録するメソッド
        Product product = createProduct(serialNumber);

        // Productの登録
        registerProduct(product);

        return product;
    }

    // Productを生成する抽象メソッド
    protected abstract Product createProduct(String serialNumber);

    // Productを登録する抽象メソッド
    protected abstract void registerProduct(Product product);
}
