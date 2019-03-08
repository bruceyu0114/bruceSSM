package com.bruce.model.test;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class PurchaseTicket {
    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;
    private String picketId;
    private String picketName;
    private String picketCode;
    private String pruductName;
    private String pruductId;
    private String generateDate;
    private String overdayDate;
    private String statues;
    private Long phonenum;

}
