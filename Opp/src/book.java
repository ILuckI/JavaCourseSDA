public class book {
    author author = new author();
    String title;
    String isbn;

    public void showSurname() {
        System.out.printf("\nAutor : %s %s \nNationality: %s", author.name, author.surname, author.country);
    }

    public void showtitle() {
        System.out.printf("\nTitle : %s", title);
    }

    public void showisbn() {
        System.out.printf("\nIsbn : %s", isbn);
    }
    public String returnIsbn() {
        return isbn;
    }
    public author returnSurname() {
        return author;
    }
    public String returnTitle() {
        return title;
    }
    public void setTitle (String newTitle){
        title = newTitle;
    }
    public void setIsbn (String newIsbn){
        isbn = newIsbn;
    }
    public void setAuthor (author newAuthor){
        author = newAuthor;
    }

}
