import Book.Book;

import java.util.Scanner;

public class Main {
    private Book[] books;

    public static void main(String[] args) {
        Main main = new Main();
        main.Show_Author();
        main.Show_Publisher();
        main.Show_PublishDate();
    }

    public Main() {
        books = new Book[2];

        books[0] = new Book(1, "To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960, 281, 15.29);
        books[1] = new Book();

    }
    public void Show_Author() {

        System.out.println("Enter customers Author:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Book item : books) {
            if (item.getAuthor().equals(name))
                System.out.println(item.show());
        }
    }

    public void Show_Publisher() {

        System.out.println("Enter customers Publisher:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Book item : books) {
            if (item.getPublisher() .equals(name) )
                System.out.println(item.show());
        }
    }

    public void Show_PublishDate() {

        System.out.println("Enter customers PublishDate:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (Book item : books) {
            if (item.getYear() > number )
                System.out.println(item.show());
        }
    }
}