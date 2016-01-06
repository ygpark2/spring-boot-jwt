package com.ain.syl.support;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import com.ain.syl.Application;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@org.springframework.boot.test.IntegrationTest("server.port=9000")
@ActiveProfiles("web")
// @Sql(scripts = "classpath:data.sql.bak", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
public @interface ApplicationTest {

}
