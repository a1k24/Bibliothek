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
    
    // TODO :  Modify records
    public void create_record(type memberType, int ID, String name, String phoneNo, String address)
    {
        Member mbr = new Member(memberType,ID,name,phoneNo,address);
    }
    public void delete_record(int ID)
    {
        
    }
    public void create_book(String ISBN, String name, String publisher, int yearOfPurchase, int rackNo, double price)
    {
        Book book = new Book(ISBN,name,publisher,yearOfPurchase,rackNo,price);
    }
    public void delete_book(String ISBN)
    {
        
    }
}