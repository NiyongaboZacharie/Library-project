/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;

import cdg.Library.Model.Client;
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
public class ClientDao {
    public void saveclient(Client c){
    Session session=HibernateUtil.getSessionFactory().openSession();
    Transaction trans=session.beginTransaction();
    session.save(c);
    trans.commit();
    session.close();
    
    }
    public void UpdateClient(Client cl){
    Session s=HibernateUtil.getSessionFactory().openSession();
    Transaction trans=s.beginTransaction();
    s.update(cl);
    trans.commit();
    s.close();
    }
    public void DeleteClient(Client c){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        session.delete(c);
        t.commit();
        session.close();
        
    }
      public  List<Client>listAll(){
        List<Client>cl = null;
        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Query q = ss.createQuery("from Client");
        return q.list();
    } 
}
