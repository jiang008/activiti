package com.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.entity.UserEntity;
import com.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Author JY
 * @Date 2020/12/11 16:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestInfo {
	Logger logger = LoggerFactory.getLogger(TestInfo.class);
	@Resource
	private UserMapper userMapper;

	@Test
	public void test2() {
		List<UserEntity> userEntities = userMapper.selectList(new QueryWrapper<UserEntity>());
		logger.info("信息:",userEntities.toString());
	}
}
