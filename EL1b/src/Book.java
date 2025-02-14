public class Book {
    private String isbn;
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
public Book (String name, Author[] authors, double price ) {
    this.name = name;
    this.authors = authors;
    this.price = price;
}
public Book (String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
}
public String getName() {
    return name;
}
public Author[] getAuthor() {
    return authors;
}
public double getPrice() {
    return price;
}
public int getQty() {
    return qty;
}
public void setQty(int qty) {
    this.qty = qty;
}
public void setPrice(double price) {
    this.price = price;
}


public String getAuthorName() {
    StringBuilder names = new StringBuilder();
    for (int i = 0; i < authors.length; i++) {
        names.append(authors[i].getName());
        if (i < authors.length - 1){
            names.append(", ");
        }
    }
    return names.toString();
}
public Book (String isbn, String name, Author[] author, double price) {
    this.isbn = isbn;
    this.name = name;
    this.authors = author;
    this.price = price;
}
public Book (String isbn, String name, Author[] author, double price, int qty) {
    this.isbn = isbn;
    this.name = name;
    this.authors = author;
    this.price = price;
    this.qty = qty;
}

    public String getIsbn() {
        return isbn;
    }
public String toString(){
    return "isbn: " + isbn + "name: " + name + "author: " + getAuthorName() + "price: " + price + "qty: " + qty;
}
}
