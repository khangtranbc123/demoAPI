package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns:GetCustomerInfoReq")
public class GetCustomerInfoReq {
    @JacksonXmlProperty(localName = "ns1:Header")
    Header header;
    @JacksonXmlProperty(localName = "ns:BodyRequest")
    BodyRequest bodyRequest;
}
