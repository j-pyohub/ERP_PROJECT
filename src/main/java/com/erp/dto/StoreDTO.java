package com.erp.dto;

import lombok.*;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
@Builder
public class StoreDTO {
    private long storeNo;
    private String storeName;
    private String storeStatus;
    private String storeManagerId;
    private String managerName;
    private String email;
    private String address;
    private String storePhoneNumber;
    private String openedDate;
    private String closedDate;
    private String openTime;
    private String closeTime;
    private String latitude;
    private String longitude;
    private String storeImage;
    private String menuStopRole;

    public static StoreDTO toDTO(Map<String, String> data) {
        return StoreDTO.builder()
                .storeName(data.get("storeName"))
                .storeStatus(data.get("storeStatus"))
                .address(data.get("address"))
                .longitude(data.get("longitude"))
                .latitude(data.get("latitude"))
                .storePhoneNumber(data.get("storePhoneNumber"))
                .openedDate(data.get("openedDate"))
                .openTime(data.get("openTime"))
                .closeTime(data.get("closeTime"))
                .storeImage(data.get("image"))
                .menuStopRole("N")
                .build();
    }
}
