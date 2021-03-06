package cdg.Library.Model;
// Generated May 13, 2020 6:57:26 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private Integer bookId;
     private String title;
     private String publisherHouse;
     private Date dateofpublication;
     private String author;
     private int pages;
     private String bookCategory;

    public Book() {
    }

	
    public Book(String title, String publisherHouse, Date dateofpublication, String author, int pages) {
        this.title = title;
        this.publisherHouse = publisherHouse;
        this.dateofpublication = dateofpublication;
        this.author = author;
        this.pages = pages;
    }
    public Book(String title, String publisherHouse, Date dateofpublication, String author, int pages, String bookCategory) {
       this.title = title;
       this.publisherHouse = publisherHouse;
       this.dateofpublication = dateofpublication;
       this.author = author;
       this.pages = pages;
       this.bookCategory = bookCategory;
    }
    public Book(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisherHouse() {
        return this.publisherHouse;
    }
    
    public void setPublisherHouse(String publisherHouse) {
        this.publisherHouse = publisherHouse;
    }
    public Date getDateofpublication() {
        return this.dateofpublication;
    }
    
    public void setDateofpublication(Date dateofpublication) {
        this.dateofpublication = dateofpublication;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return this.pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getBookCategory() {
        return this.bookCategory;
    }
    
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }




}


