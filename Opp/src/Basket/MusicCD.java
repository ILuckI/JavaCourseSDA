package Basket;

public abstract class MusicCD implements Product {
    protected int price;
    protected String name;
    protected String title;
    protected String performer;

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

    public String getPerformer() {
        return performer;
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

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
