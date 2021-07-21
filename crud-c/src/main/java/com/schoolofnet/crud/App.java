package com.schoolofnet.crud;

import java.util.List;

import org.hibernate.Session;

import com.schoolofnet.model.HibernateSession;
import com.schoolofnet.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Session session = HibernateSession.getSessionFactory().openSession();
    		
    		session.beginTransaction();
    		
    		/* Create 
    		Product product = new Product();
    		product.setName("P 1");
    		product.setPrice(10.00);
    		session.save(product);  
    		*/
    		
    		/* Read
    		List<Product> products = session.createQuery("from Product").getResultList();
    		Product p1 = session.find(Product.class, 1);
    		System.out.println(products.toString());
    		System.out.println(p1.getName());
    		*/
    		
    		/* Update 
    		Product product = session.find(Product.class, 1);
    		
    		if(product != null) {
    			product.setName("Product Edited 1");
    			product.setPrice(20.20);
    			
    			// session.update(product);
    			session.saveOrUpdate(product);
    		}
    		*/
    		
    		/* Delete */
    		Product product = session.find(Product.class, 2);
    		
    		if(product != null) {
    			//session.remove(product);
    			session.delete(product);
    		}
    		
    		
    		session.getTransaction().commit();
    }
}