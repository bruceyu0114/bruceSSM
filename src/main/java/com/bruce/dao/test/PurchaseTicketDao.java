package com.bruce.dao.test;

import com.bruce.model.test.PurchaseTicket;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface PurchaseTicketDao {
    public List<PurchaseTicket> getAllPurchaseTicketList();

    public PurchaseTicket findOne(Long id);
}
