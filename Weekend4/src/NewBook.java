public class NewBook {
    private String name;
    private NewAuthor author;
    private double price;
    private int qty;

    public NewBook(String name, NewAuthor author, double price){
        this(name,author,price,0);
    }
    public NewBook(String name, NewAuthor author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public NewAuthor getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book[").append("name").append(name).append(author).append("], price=").append(price).append(", qty=").append(qty).append("]");
        return sb.toString();
    }
}
