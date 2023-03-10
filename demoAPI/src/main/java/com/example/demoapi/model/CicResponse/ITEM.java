package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "ITEM")
public class ITEM {
    @JacksonXmlProperty(localName = "CUSTOMER_ID")
    String CUSTOMER_ID;

    @JacksonXmlProperty(localName = "CUSTOMERNAME")
    String CUSTOMERNAME;

    @JacksonXmlProperty(localName = "TYPE")
    String TYPE;

    @JacksonXmlProperty(localName = "XML")
    XML XML;

}
