package io.github.futurewl.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void test() {
		Session session =  HibernateSessionFactory.getSession();
		System.out.println(session);
	}

}
