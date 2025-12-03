package com.erp.controller;

import com.erp.dto.ItemOrderDTO;
import com.erp.service.ItemOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/itemOrder")
public class ItemOrderController {
    private ItemOrderService itemOrderService;

    @GetMapping("/itemOrderList")
    public String itemOrderHistory() {
        return "itemOrder/itemOrderHistory";
    }
    @GetMapping("/itemOrder")
    public String itemOrder() {
        return "itemOrder/itemOrder";
    }
    @GetMapping("/itemPropose")
    public String itemProposal() {
        return "itemOrder/itemProposal";
    }
    @GetMapping("/itemOrderListManager")
    public String itemOrderHistoryManager() {
        return "itemOrder/itemOrderHistoryManager";
    }
}
