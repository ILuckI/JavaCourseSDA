package Basket;

public abstract class Book implements Product {
    protected int price;
    protected String name;
    protected String title;
    protected String author;

    @Override
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProductName(String productName) {
        this.name = productName;
    }

    @Override
    public String getProductName() {
        return name;
    }

    public void setAuthor(String performer) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
