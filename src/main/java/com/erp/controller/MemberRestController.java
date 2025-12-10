package com.erp.controller;

import com.erp.dto.ManagerDTO;
import com.erp.dto.StoreDTO;
import com.erp.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/member")
public class MemberRestController {

    private final MemberService memberService;

    /**
     * 본사 직원 목록 (page: 0-base)
     */
    @GetMapping("/manager")
    @PreAuthorize("hasRole('ADMIN')")
    public Page<ManagerDTO> getManagerMembers(
            @RequestParam(defaultValue = "0") Integer page) {

        int safePage = (page == null ? 0 : page);
        return memberService.getManagerMembers(safePage);
    }

    /**
     * 직영점 직원 목록 (page: 0-base)
     */
    @GetMapping("/store")
    @PreAuthorize("hasRole('ADMIN')")
    public Page<StoreDTO> getStoreMembers(
            @RequestParam(defaultValue = "0") Integer page) {

        int safePage = (page == null ? 0 : page);
        return memberService.getStoreMembers(safePage);
    }
}
