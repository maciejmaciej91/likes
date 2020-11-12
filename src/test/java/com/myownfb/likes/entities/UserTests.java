package com.myownfb.likes.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class UserTests {
    @Autowired
    private UserRepository userRepository;
//
//    @BeforeEach
//    void openEntityManagerAndTransaction() {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db_example");
//        entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//    }

//    @Test
//    void whenSaved_thenFindsByName() {
//        User user = new User();
//
//        user.setId(100);
//        user.setName("test-junit-name");
//        user.setEmail("test-junit-email");
//        user.setSurname("test-junit-surname");
//
//        userRepository.save(user);
//        assertThat(userRepository.findByName("test-junit-name")).isNotNull();
//        userRepository.deleteByName("test-junit-name");
//    }
//    @Test
//    void givenUser_whenFindEntity_thenFoundWithComments() {
//        User foundUser = entityManager.find(User.class, 1L);
//
//        assertThat(foundUser.getId()).isEqualTo(1L);
//        assertThat(foundUser.getName()).isEqualTo("maciej");
//        assertThat(foundUser.getSurname()).isEqualTo("wie");
//        assertThat(foundUser.getEmail()).isEqualTo("maciej@maciej");
//        assertThat(foundUser.getComments())
//                .extracting(Comment::title)
//                .containsExactly("Java 101", "SQL 101", "JPA 101");
//    }
}
