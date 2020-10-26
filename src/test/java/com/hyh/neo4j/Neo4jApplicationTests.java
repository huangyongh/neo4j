package com.hyh.neo4j;

import com.hyh.neo4j.service.Neo4jService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Neo4jApplicationTests {
    @Autowired
    private Neo4jService neo4jService;

    @Test
    void contextLoads() {
    }

    @Test
    void SaveNeo4j(){
        neo4jService.saveNode();
    }

}
