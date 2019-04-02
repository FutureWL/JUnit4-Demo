package io.github.futurewl.util;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-02:10:52
 * @version 1.0
 */
public class SpringTest {

    private static ApplicationContext context = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void name() {
        Date date = (Date) context.getBean("date");
        System.out.println(date);
    }
}
