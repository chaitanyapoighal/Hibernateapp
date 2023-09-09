package anudip.org;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CollegeImpl {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();  
        
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		   
		   SessionFactory sfactory=meta.getSessionFactoryBuilder().build();
		   
		   Session session=sfactory.openSession();
		   Transaction tsc=session.beginTransaction();
		   
		   College c1=new College();
		    c1.setCid(1025);
		    //c1.setCname("JNTU");
		    
		    /*College c2=new College();
		    c2.setCid(1025);
		    c2.setCname("Venkateshwara");
		    */
		    session.delete(c1);
		    //session.save(c2);
		    
		    tsc.commit();
		    
		    TypedQuery tq=session.createQuery("from College");
		    
		    List<College> collegelist=tq.getResultList();
		    
		    Iterator<College> itr=collegelist.iterator();
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.next());
		    }
		    
		    sfactory.close();
		    session.close();
		    
		   
		   

	}

}
