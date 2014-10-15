package com.cheehong.base;

import java.sql.Connection;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.After;
import org.junit.Before;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;

import com.cheehong.dao.UserDAO;

@ContextConfiguration(locations = { "classpath:/InMemoryDbTestBase-context.xml" })
public class InMemorySetup {

	// &: get the actual factory, not the object it produced
	@Resource(name="&sessionFactory") 
	protected LocalSessionFactoryBean localSessionFactoryBean;
	@Resource(name="dataSource")
	protected DataSource dataSource;
	protected Configuration configuration;
	protected Connection connection;
	
	@Resource(name = "userDAO")
	protected UserDAO userDAO;

	@Before
	public void setup() throws Exception {
		if (null == this.configuration) {
			if (null == this.localSessionFactoryBean) {
				throw new IllegalStateException("No LocalSessionFactoryBean...");
			}
			this.configuration = localSessionFactoryBean.getConfiguration();
		}

		this.connection = this.dataSource.getConnection();
		SchemaExport exporter = new SchemaExport(this.configuration, this.connection);
		exporter.execute(true, true, false, true);

		if (null != exporter.getExceptions() && exporter.getExceptions().size() > 0) {
			throw new IllegalStateException("Unable to setup schema; export failed");
		}
	}

	@After
	public void teardown() throws Exception {
		if (null != this.connection) {
			this.connection.createStatement().execute("SHUTDOWN");
			this.connection.close();
			this.connection = null;
		}
	}
}
