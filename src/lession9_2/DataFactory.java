package lession9_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFactory {
    static List<Book> bookList = new ArrayList<>();
    final static String bookDataFileName = "/book.txt";
    static String projectRootDirectory = System.getProperty("user.dir");

    public static boolean saveBookList(List<Book> books, String path) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            for (Book book : books) {
                String dataLine = book.getTitle() + ";" + book.getISBN() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    public static List<Book> readBookList(String path) {
        List<Book> books = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLIne = bufferedReader.readLine();
            while (dataLIne != null) {
                String[] bookData = dataLIne.split(";");
                String title = bookData[0];

                int ISBN = Integer.parseInt(bookData[1]);

                String authorName = bookData[2];

                int year = Integer.parseInt(bookData[3]);

                books.add(new Book(title, ISBN, authorName, year));

                dataLIne = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    private static void addBook() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Book's author name: ");
        String authorName = scanner.nextLine();
        System.out.println("Book ISBN: ");
        int ISBN = scanner.nextInt();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        Book book = new Book(bookTitle,ISBN, authorName,year);
        bookList.add(book);

        // Write book content
        boolean isSavedSuccess =  DataFactory.saveBookList(bookList, projectRootDirectory + bookDataFileName);

        //Read book content
        if(isSavedSuccess) {
            List<Book> bookList = DataFactory.readBookList(projectRootDirectory + bookDataFileName);
            for (Book booklist : bookList) {
                System.out.println(booklist);
            }
        }
    }

    private static void retrieveBook() {
        List<Book> bookList = DataFactory.readBookList(projectRootDirectory + bookDataFileName);
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

    public static void main(String[] args) {
        final String bookDataFileName = "/book.txt";
        String projectRootDirectory = System.getProperty("user.dir");

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
}
