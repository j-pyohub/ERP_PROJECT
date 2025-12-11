package com.erp.dto;

import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class ManagerDTO {
    private String managerId;
    private String pw;
    private String email;
    private String managerName;
    private String phoneNumber;
    private Timestamp inDate;
    private Timestamp delDate;
    private String role;

    public static ManagerDTO toDTO(Map<String, String> data){
        return ManagerDTO.builder()
                .managerId(data.get("managerId"))
                .pw(data.get("password"))
                .email(data.get("email"))
                .managerName(data.get("name"))
                .phoneNumber(data.get("phone"))
                .inDate(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}