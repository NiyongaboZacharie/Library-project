/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;

import cdg.Library.Model.BookCategory;
import cdg.Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Zacharie
 */
public class BookCategoryDao {
    
    public void saveBookCateg(BookCategory bc){
        Session se = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = se.beginTransaction();
        se.save(bc);
        trans.commit();
        se.close();     
    }
    public void updatebookcateg(){
        Session se = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = se.beginTransaction();
        se.update(se);
        trans.commit();
        se.close();     
    }
    public void Deletecateg(){
        Session se = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = se.beginTransaction();
        se.delete(se);
        trans.commit();
        se.close();
    }
      public  List<BookCategory>getAll(){
        List<BookCategory>bc = null;
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Query q = ss.createQuery("from BookCategory");
        return q.list();
    }

   
    
    
    
    
    }

