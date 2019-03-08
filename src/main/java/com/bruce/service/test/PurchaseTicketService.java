package com.bruce.service.test;

import com.bruce.dao.test.PurchaseTicketDao;
import com.bruce.model.test.PurchaseTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseTicketService {
    @Autowired
    private PurchaseTicketDao purchaseTicketDao;

    public List<PurchaseTicket> getAllPurchaseTicketList(){
        return purchaseTicketDao.getAllPurchaseTicketList();
    }

    public PurchaseTicket findOne(Long id){
        return purchaseTicketDao.findOne(id);
    };
}
