package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns1:Header")
public class Header {
    @JacksonXmlProperty(localName = "ns1:Common")
    Common common;
    @JacksonXmlProperty(localName = "ns1:Client")
    Client client;
}
