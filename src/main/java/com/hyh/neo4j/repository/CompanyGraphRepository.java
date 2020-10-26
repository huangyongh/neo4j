package com.hyh.neo4j.repository;

import com.hyh.neo4j.entity.CompanyGraph;
import com.hyh.neo4j.entity.SupplyGraph;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyhlmy
 */
@Repository
public interface CompanyGraphRepository extends Neo4jRepository<CompanyGraph,Long> {
}
