/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;

import cdg.Library.Model.Operation;
import cdg.Library.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zacharie
 */
public class OperationDao {
    
    public void SaveOperation(Operation oper){
    Session se = HibernateUtil.getSessionFactory().openSession();
    Transaction trans = se.beginTransaction();
    trans.commit();
    se.close();
    
    }
     public List<Operation> getOperation(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Operation.class);
        List<Operation> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
}
