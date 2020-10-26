package com.hyh.neo4j.entity;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author hyhlmy
 */
@Builder
@Data
@NodeEntity
public class CompanyGraph {
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 公司名称
     */
    private String name;
}
