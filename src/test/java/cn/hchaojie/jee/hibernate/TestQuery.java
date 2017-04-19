package cn.hchaojie.jee.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import cn.hchaojie.jee.hibernate.domain.Product;

public class TestQuery {
	SessionFactory sf;

	@Before
	public void init() {
		Configuration config = new Configuration().configure();
		sf = config.buildSessionFactory();
	}

	@Test
	public void testQueryAll() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// Product和keywords表关联的时候，keywords并不需要创建实体类
		// 关联查询的时候，kw like相当于kw.name like
		Query query = s.createQuery("from Product p inner join p.keywords kw where kw like ?");
		query.setParameter(0, "%哈%s");
		@SuppressWarnings("unchecked")
		List<Product> list = query.list();
		System.out.println(list);

		tx.commit();
		s.close();
	}
}
