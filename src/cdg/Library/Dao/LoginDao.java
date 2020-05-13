/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg.Library.Dao;

import cdg.Library.Model.Login;
import cdg.Library.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zacharie
 */
public class LoginDao {
    public void SaveLogin(Login lg){
        Session se = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = se.beginTransaction();
        se.save(lg);
        trans.commit();
        se.close();
        
        
    }
    
}
