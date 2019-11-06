package me.devyonghee.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
//@Profile("!prod")
// VM Option -Dspring.profiles.active="test"
public class TestBookRepository implements BookRepository{
}
