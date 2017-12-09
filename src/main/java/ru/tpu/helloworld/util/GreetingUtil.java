package ru.tpu.helloworld.util;

import org.apache.ibatis.session.SqlSession;
import ru.tpu.helloworld.entity.Greeting;
import ru.tpu.helloworld.mapper.GreetingMapper;

public class GreetingUtil {
    public void insertGreeting(Greeting greeting) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            GreetingMapper greetingMapper = sqlSession.getMapper(GreetingMapper.class);
            greetingMapper.insertGreeting(greeting);
            sqlSession.commit();
        }
    }

    public Greeting getGreetingById(Integer greetingId) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            GreetingMapper greetingMapper = sqlSession.getMapper(GreetingMapper.class);
            return greetingMapper.getGreetingById(greetingId);
        }
    }

    public void updateGreeting(Greeting greeting) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            GreetingMapper greetingMapper = sqlSession.getMapper(GreetingMapper.class);
            greetingMapper.updateGreeting(greeting);
            sqlSession.commit();
        }

    }

    public void deleteGreeting(Integer greetingId) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            GreetingMapper greetingMapper = sqlSession.getMapper(GreetingMapper.class);
            greetingMapper.deleteGreeting(greetingId);
            sqlSession.commit();
        }

    }
}
