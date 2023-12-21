/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class Medicine {
    private int id, buyingprice, sellingprice, quantity;
    private String name, description;

    public Medicine() {
        this.id = 0;
        this.buyingprice = 0;
        this.sellingprice = 0;
        this.quantity = 0;
        this.name = "";
        this.description = "";
    }
    
    

    public Medicine(int id, int buyingprice, int sellingprice, int quantity, String name, String description) {
        this.id = id;
        this.buyingprice = buyingprice;
        this.sellingprice = sellingprice;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyingprice() {
        return buyingprice;
    }

    public void setBuyingprice(int buyingprice) {
        this.buyingprice = buyingprice;
    }

    public int getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(int sellingprice) {
        this.sellingprice = sellingprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", buyingprice=" + buyingprice + ", sellingprice=" + sellingprice + ", quantity=" + quantity + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
