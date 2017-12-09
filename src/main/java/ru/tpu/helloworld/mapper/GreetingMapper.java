package ru.tpu.helloworld.mapper;

import ru.tpu.helloworld.entity.Greeting;

public interface GreetingMapper {
    void insertGreeting(Greeting greeting);

    Greeting getGreetingById(Integer greetingId);

    void updateGreeting(Greeting greeting);

    void deleteGreeting(Integer greetingId);
}
