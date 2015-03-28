/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothek;

/**
 *
 * @author sayan
 */
public class Librarian {

    private Member mbr;
    private Book book;

    public Member getMbr() {
        return mbr;
    }

    public void setMbr(Member mbr) {
        this.mbr = mbr;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // TODO :  Modify records

    public void create_record(type memberType, int ID, String name, String phoneNo, String address) {
        mbr = new Member(memberType, ID, name, phoneNo, address);
    }

    public void delete_record(int ID) {

    }

    public void create_book(String ISBN, String name, String publisher, int yearOfPurchase, int rackNo, double price) {
        book = new Book(ISBN, name, publisher, yearOfPurchase, rackNo, price);
    }

    public void delete_book(String ISBN) {

    }
}
