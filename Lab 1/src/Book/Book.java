package Book;

import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public Book()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
         id = scanner.nextInt();
        System.out.print("Title: ");
         title = scanner.next();
        System.out.print("Author: ");
         author = scanner.next();
        System.out.print("Publisher: ");
         publisher = scanner.next();
        System.out.print("Year: ");
         year = scanner.nextInt();
        System.out.print("Pages: ");
         pages = scanner.nextInt();
        System.out.print("Price: ");
         price=scanner.nextDouble();
    }
    public Book(int id, String title, String author, String publisher, int year, int pages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public int getYear() {
        return this.year;
    }

    public int getPages() {
        return this.pages;
    }

    public double getPrice() {
        return this.price;
    }



    public String show() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}