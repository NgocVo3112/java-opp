package lession7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("===========MENU============");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve Book (ISBN)");
            System.out.println("0. Exit!");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 0:
                    System.out.println("Bye!");
                    isContinuing = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBook();
                    break;
            }
        }

    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.println("Book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Book's author name: ");
        String authorName = scanner.nextLine();
        Book book = new Book(ISBN, bookTitle, authorName);
        bookList.add(book);
    }

    private static void retrieveBook() {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        if (bookList.isEmpty()) {
            System.out.println("List book is empty");
        } else {
            System.out.println("Which book are you searching for?");
            String bookSearch = scanner.nextLine();
            for (Book book : bookList) {
                if(book.getTitle().contains(bookSearch) || book.getAuthorName().contains(bookSearch)){
                    counter ++;
                }
            }
            if(counter ==0) {
                System.out.println("No book found!!!");
            }else
            {
                System.out.println("Have " + counter +" book you're looking for!");
            }
        }
    }
}
