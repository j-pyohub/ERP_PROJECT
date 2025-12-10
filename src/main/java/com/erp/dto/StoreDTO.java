package com.erp.dto;

import lombok.*;

import java.time.LocalDate;

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
    private String phoneNumber;
    private String storePhoneNumber;
    private LocalDate openedDate;
    private LocalDate closedDate;
    private String openTime;
    private String closeTime;
    private String latitude;
    private String longitude;
    private String storeImage;
    private String menuStopRole;
}
