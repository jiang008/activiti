package com.demo.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @version 1.0
 * @Author JY
 * @Date 2020/12/11 15:30
 */
@Configuration
public class ActivitiConfig {
	@Autowired
	private DataSource dataSource;

	/**
	 * 初始化配置
	 * @return
	 */
	@Bean
	public StandaloneProcessEngineConfiguration processEngineConfiguration() {
		StandaloneProcessEngineConfiguration configuration = new StandaloneProcessEngineConfiguration();
		configuration.setDataSource(dataSource);
		configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
		configuration.setAsyncExecutorActivate(false);
		return configuration;

	}

	/**
	 * 创建引擎
	 * @return
	 */
	@Bean
	public ProcessEngine processEngine() {
		return processEngineConfiguration().buildProcessEngine();

	}
}
