public class BookCopy {
    int id;
    Book book;
    Rent rent;

    BookCopy(Book book) {
        this.book = book;
        this.id = book.registration(this);
        this.rent = null;
    }

    public boolean isReserved() {
        return this.book.isReserved();
    }

    public boolean isRented() { return (this.rent != null); }

    public void notifyRented(Rent rent) {
        this.rent = rent;
    }

    public String toString() {
        return "Copy{id=" + this.id + ", book=" + this.book.toString() + "}";
    }
    
    // 과제
    public String returnBook(Rent rent) {
    	
    	rent.notifyReturnBook();
    	
    	if (book.getReservation() == null) {
    		return "done";
    	} else {
    		return book.getReservation().getContactInfo(); 
    	}
    }
}
