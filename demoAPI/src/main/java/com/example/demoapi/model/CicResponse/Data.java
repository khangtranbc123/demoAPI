package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "DATA")
public class Data {
    @JacksonXmlProperty(localName = "ITEMS")
    Items items;

    @JacksonXmlProperty(localName = "RESP")
    RESP RESP;



}
