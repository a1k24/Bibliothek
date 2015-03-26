/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothek;



/**
 *
 * @author AKASH
 */
class IssueDetails_member {
    private Book issuedBook;
    private String issueDate;
    private String returnDate;

    public IssueDetails_member(Book issuedBook, String issueDate) {
        this.issuedBook = issuedBook;
        this.issueDate = issueDate;
    }
    
    
    public Book getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(Book issuedBook) {
        this.issuedBook = issuedBook;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    
}
