/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;

import cdg.Library.Model.Checkout;
import cdg.Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zacharie
 */
public class CheckoutDao {
    public void savecheckout(Checkout cout){
    Session se = HibernateUtil.getSessionFactory().openSession();
    Transaction trans = se.beginTransaction();
    se.save(cout);
    
    }
     public List<Checkout> getCheckOut(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Checkout.class);
        List<Checkout> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
    
}
