package com.bruce.controller.test;

import com.bruce.model.test.PurchaseTicket;
import com.bruce.service.test.PurchaseTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/PurchaseTicketController")
public class PurchaseTicketController {
    @Autowired
    private PurchaseTicketService purchaseTicketService;

    /**
     * excel下载测试页
     * @return
     */
    @RequestMapping(value = "/gotoPageForDownloadExcel",method = RequestMethod.GET)
    public String gotoPageForDownloadExcel(){
        return "test/gotoTest";
    }

    /**
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllList",method = RequestMethod.POST)
    public List<PurchaseTicket> getAllList(){
        return purchaseTicketService.getAllPurchaseTicketList();
    }

    /**
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findOne",method = RequestMethod.POST)
    public PurchaseTicket findOne(@RequestParam("id") Long id){
        return purchaseTicketService.findOne(id);
    }

}
