/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;
import cdg.Library.Model.Book;
import cdg.Library.Model.BookCategory;
import cdg.Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zacharie
 */
public class BookDao {
    public void  SaveBook(Book book){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction trans = session.beginTransaction();
    session.save(book);
    trans.commit();
    session.close();
    }
    public void UpdateBook(Book bk){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(bk);
        trans.commit();
        session.close();
        
    }
    public void DeleteBook(Book bok){
    Session se = HibernateUtil.getSessionFactory().openSession();
    Transaction trans=se.beginTransaction();
    se.delete(bok);
    trans.commit();
    se.close();
    }

    public List<Book> listAll() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Book.class);
        List<Book> bk = cr.list();
        tr.commit();
        session.close();
        return  bk;
        }

    public List<BookCategory> gettAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  

