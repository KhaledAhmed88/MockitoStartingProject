package com.luv2code.springmvc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("/application.properties")
@SpringBootTest
public class StudentAndGradeSeviceTest {

    @Test
    public void createStudentService(){
        studentService.createStudent("Khaled" , "Ahmed" , "Kahled.ahmed94@outlook.com" );
        CollegeStudent student = studentDao.findByEmail
    }
}
