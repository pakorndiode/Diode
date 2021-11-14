package camt.ch01.ex01;

public class Lesson {
  public static void main(String [] args) {
    /* TODO: Step 1 - instantiate an object of class camt.day1.ex01.Book
             and assign it to a  variable named myBook */
    Book myBook1 = new Book();
    Book myBook2 = new Book();
    Book myBook3 = new Book();


    /* TODO: Step 2 - assign a value to the title, author
             and numberOfPages fields of your object.*/
    myBook1.title = "Title 01";
    myBook1.author = "John";
    myBook1.numberOfPages = 400;

    myBook2.title = "Milkman: A Novel";
    myBook2.author = "Anna Burns";
    myBook2.numberOfPages = 200;

    myBook3.title = "The Undefeated";
    myBook3.author = "Kwame Alexander, Kadir Nelson";
    myBook3.numberOfPages = 300;

    //Print the values
    System.out.println("The title of the book is "
      + myBook1.title + "\nIts author is"
      + myBook1.author + "\nIt contains "
      + myBook1.numberOfPages+"\n\n");

    System.out.println("The title of the book is "
      + myBook2.title + "\nIts author is"
      + myBook2.author + "\nIt contains "
      + myBook2.numberOfPages+"\n\n");

    System.out.println("The title of the book is "
      + myBook3.title + "\nIts author is"
      + myBook3.author + "\nIt contains "
      + myBook3.numberOfPages+"\n\n");
  }
}
