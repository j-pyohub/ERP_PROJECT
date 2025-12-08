package com.erp.service;

import com.erp.dto.StoreDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

@SpringBootTest
public class StoreServiceTest {
    @Autowired
    StoreService storeService;

    @Test
    void getStoresTest(){
        Page<StoreDTO> result =  storeService.getStoresList(0, null, null, null, null);
        result.forEach(System.out::println);
    }

    @Test
    void getStoresByNameTest(){
        Page<StoreDTO> result =  storeService.getStoresList(0, null, null, "표", null);
        result.forEach(System.out::println);
    }
}
