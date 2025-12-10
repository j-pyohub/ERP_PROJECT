package com.erp.service;

import com.erp.dao.StoreDAO;
import com.erp.dto.StoreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreDAO storeDAO;

    public Page<StoreDTO> getStoresList(Integer pageNo, String address, String storeName, String managerName, String storeStatus) {
        int pageSize = 10;
        int offset = pageNo * pageSize;

        Map<String, Object> params = new HashMap<>();
        params.put("address", address);
        params.put("storeName", storeName);
        params.put("managerName", managerName);
        params.put("storeStatus", storeStatus);
        params.put("offset", offset);
        params.put("limit", pageSize);

        List<StoreDTO> content = storeDAO.getStoresList(params);
        Long total = storeDAO.countStoreList(params);
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return new PageImpl<>(content, pageable, total);
    }

    public StoreDTO getStoreDetail(Long storeNo) {
        return storeDAO.getStoreDetail(storeNo);
    };
}
