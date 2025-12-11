package com.erp.dto;

import lombok.Data;

import java.util.Map;

@Data
public class AddStoreRequestDTO {
    private Map<String, String> manager;
    private Map<String, String> store;
}
