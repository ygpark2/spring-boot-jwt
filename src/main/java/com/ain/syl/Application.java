package com.ain.syl;

// import de.codecentric.boot.admin.config.EnableAdminServer;
import com.ain.syl.domain.admin.User;
import com.ain.syl.domain.admin.UserRole;
import com.ain.syl.repository.admin.UserAuthorityRepository;
import com.ain.syl.repository.admin.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
// @EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
// @EnableAdminServer
@EnableWebMvc
public class Application extends WebMvcAutoConfiguration {
// public class Application {

    @Inject
    UserRepository userRepository;

    @Inject
    UserAuthorityRepository userAuthorityRepository;

    public static void main(String[] args) {

        // List<Class<?>> classes = ClassFinder.find("com.package");

        SpringApplication.run(Application.class, args);

        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

    }

    @PostConstruct
    private void loadInitData() {
        System.out.println("---------------- load default data -----------------------");

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        User user = new User("test_user", new Date());
        user.setPassword(passwordEncoder.encode("test_pass"));
        Set<UserRole> set = new HashSet<UserRole>();
        set.add(UserRole.USER);
        user.setRoles(set);
        userRepository.save(user);

        /*
        UserAuthority ua = new UserAuthority();
        ua.setAuthority("USER");
        ua.setUser(user);
        userAuthorityRepository.save(ua);
        */

        System.out.println("---------------- load default data -----------------------");
    }
}
