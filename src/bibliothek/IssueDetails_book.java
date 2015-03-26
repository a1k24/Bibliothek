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
class IssueDetails_book {
    private Member issueMember;
    String issueDate;
    String returnDate;

    public IssueDetails_book(Member issueMember, String issueDate) {
        this.issueMember = issueMember;
        this.issueDate = issueDate;
    }
    

    public Member getIssueMember() {
        return issueMember;
    }

    public void setIssueMember(Member issueMember) {
        this.issueMember = issueMember;
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
