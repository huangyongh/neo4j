package com.hyh.neo4j.entity;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author hyhlmy
 */
@NodeEntity
@Builder
@Data
public class SupplyGraph {
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 供应商名称
     */
    private String name;
}
