package org.wyw.pupu.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextHierarchy({
@ContextConfiguration(locations={"classpath:WEB-INF/applicationContext.xml"}) ,
@ContextConfiguration(locations={"classpath:WEB-INF/springmvc-config.xml"})
})
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}
