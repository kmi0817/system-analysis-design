import java.time.LocalDate;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        
        Book dataMining = new Book("Data Mining", false);
        myLibrary.addBook(dataMining);
        BookCopy dataMining1 = new BookCopy(dataMining);
        BookCopy dataMining2 = new BookCopy(dataMining);
        
        Book ooad = new Book("Object Oriented Analysis and Design", false);
        myLibrary.addBook(ooad);
        BookCopy ooad1 = new BookCopy(ooad);
        BookCopy ooad2 = new BookCopy(ooad);
        BookCopy ooad3 = new BookCopy(ooad);
        
        Book designPattern = new Book("Design Pattern", false);
        myLibrary.addBook(ooad);
        BookCopy designPattern1 = new BookCopy(designPattern);
        
        Book softwareEng = new Book("Software Engineering", false);
        myLibrary.addBook(softwareEng);
        BookCopy softwareEng1 = new BookCopy(softwareEng);
        
        Book keras = new Book("Keras: Deep Learning", true);
        myLibrary.addBook(keras);
        BookCopy keras1 = new BookCopy(keras);
        
        Book blockChain = new Book("Block Chain", false);
        myLibrary.addBook(blockChain);
        BookCopy blockChain1 = new BookCopy(blockChain);
        
        Book positiveThinking = new Book("Positive Thinking", false);
        myLibrary.addBook(positiveThinking);
        BookCopy positiveThinking1 = new BookCopy(positiveThinking);
        
        Human kim = new Human("Kim");
        myLibrary.enrollMember(kim);
        Human lee = new Human("Lee");
        myLibrary.enrollMember(lee);
        Human park = new Human("Park");
        myLibrary.enrollMember(park);
        
        Rent rent = kim.rentBook(designPattern1);
        System.out.println(rent.toString());
        //Rent rent2 = new Rent(park, ooad1, LocalDate.of(2022, 3, 15));
        Reserve reserve = lee.reserveBook(designPattern, "010-3333-4444");
        System.out.println(reserve.toString());
    }
}
