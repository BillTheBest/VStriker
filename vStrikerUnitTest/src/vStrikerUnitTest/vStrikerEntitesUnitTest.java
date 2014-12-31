package vStrikerUnitTest;
import vStrikerEntities.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class vStrikerEntitesUnitTest {

	@Test
	public void test() {
		TestAccountCreate();
	}

	public void TestAccountCreate()
	{
		Account acct = new Account();
		Account acct2 = new Account();
		
		/********** Acct **********/
		acct.setAccountLocation("Boston");
		acct.setName("ECS Boston");
		acct.setValidated(false);
		acct.setLastValidationDate(null);
		
		/********** Acct2 **********/
		acct2.setAccountLocation("Boston");
		acct2.setName("ECS Boston");
		acct2.setValidated(false);
		acct2.setLastValidationDate(null);	
		
		
		
		EntityManagerFactory actfactory = Persistence.createEntityManagerFactory( "vStrikerEntities" );
		EntityManager entitymanager = actfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		entitymanager.persist( acct );
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		actfactory.close( );
	
		EntityManagerFactory actfactory2 = Persistence.createEntityManagerFactory( "vStrikerEntities" );
		EntityManager entitymanager2 = actfactory2.createEntityManager( );
		entitymanager2.getTransaction( ).begin( );
		entitymanager2.persist( acct2 );
		entitymanager2.getTransaction( ).commit( );
		entitymanager2.close( );
		actfactory2.close( );
	
		assertNotSame(acct,acct2);
		assertSame(acct.getName(),acct2.getName());
		
		
		
	}
}
