package com.hyh.neo4j.service;

import com.hyh.neo4j.entity.CompanyGraph;
import com.hyh.neo4j.entity.SupplyGraph;
import com.hyh.neo4j.entity.SupplyRelationship;
import com.hyh.neo4j.repository.CompanyGraphRepository;
import com.hyh.neo4j.repository.SupplyGraphRepository;
import com.hyh.neo4j.repository.SupplyRelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hyhlmy
 */
@Service
public class Neo4jServiceImpl implements Neo4jService {
    @Autowired
    private SupplyGraphRepository supplyGraphRepository;
    @Autowired
    private SupplyRelationshipRepository supplyRelationshipRepository;
    @Autowired
    private CompanyGraphRepository companyGraphRepository;
    @Override
    public void saveNode() {
        //采购占比
        String scale = "47.14%";
        // 采购金额
        String amount = "18923.42";
        //公司名称
        String companyName = "苏州电气有限公司";
        //供应商名称
        String name = "常州常电及其关联公司";

        CompanyGraph companyGraph = CompanyGraph.builder().name(companyName).build();

        companyGraphRepository.save(companyGraph);

        SupplyGraph supplyGraph = SupplyGraph.builder().name(name).build();

        supplyGraphRepository.save(supplyGraph);

        String indexName = companyGraph.getName() + "-" + supplyGraph.getName();

        SupplyRelationship supplyRelationship = SupplyRelationship.builder().company(companyGraph).supply(supplyGraph)
                .amount(amount).scale(scale).indexName(indexName).build();

        supplyRelationshipRepository.save(supplyRelationship);
    }
}
