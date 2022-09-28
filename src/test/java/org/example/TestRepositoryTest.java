//package org.example;
//
//import org.example.dto.test;
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestRepositoryTest {
//    @Autowired
//    TestRepository testRepository;
//
//    @After
//    public void cleanup() {
//        testRepository.deleteAll();
//    }
//
//    @Test
//    public void 게시글저장_불러오기() {
//        //given
//        String title = "테스트 게시글";
//        String content = "테스트 본문";
//
//        TestRepository.save(test.builder()
//                .title(title)
//                .content(content)
//                .author("jojoldu@gmail.com")
//                .build());
//
//        //when
//        List<test> postsList = testRepository.findAll();
//
//        //then
//        test posts = postsList.get(0);
//        assertThat(test.getTitle()).isEqualTo(title);
//        assertThat(test.getContent()).isEqualTo(content);
//    }
//}
