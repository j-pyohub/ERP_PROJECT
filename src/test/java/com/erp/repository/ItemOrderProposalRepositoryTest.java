package com.erp.repository;

import com.erp.repository.entity.Item;
import com.erp.repository.entity.ItemProposal;
import com.erp.repository.entity.Manager;
import com.erp.repository.entity.Store;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

@SpringBootTest
public class ItemOrderProposalRepositoryTest {
    @Autowired
    private ItemProposalRepository repo;

    @Test
    void find(){
        System.out.println(repo.findByStoreNoAndResponseDateNull(Store.builder().storeNo(1L).build()));

    }

    @Test
    public void findAllProposal() {
        repo.findAll().forEach(System.out::println);
    }

    // 직영점 별 발주 제안 조회
    @Test
    public void getProposalByStoreNo() {
        repo.findByStoreNo(Store.builder().storeNo(1L).build()).forEach(System.out::println);
    }

    // 발주 제안
    @Test
    public void itemPropose() {
        ItemProposal proposal = ItemProposal.builder()
                .managerId(Manager.builder().managerId("abc12").build()) // 관리자id
                .storeNo(Store.builder().storeNo(1L).build()) // 매장id
                .itemNo(Item.builder().itemNo(30L).build()) // 품목id
                .proposalQuantity(4) // 수량
                .proposalReason("test") // 사유
                .proposalDate(new Timestamp(System.currentTimeMillis()))
                .build();
        repo.save(proposal);
    }


    // 발주 제안 응답
    @Test
    public void itemProposeRespond() {
        ItemProposal proposal = repo.findById(37L).orElseThrow(()-> new EntityNotFoundException("ItemProposal not found"));
        proposal.setResponseDate(new Timestamp(System.currentTimeMillis()));
        repo.save(proposal);
    }
}
