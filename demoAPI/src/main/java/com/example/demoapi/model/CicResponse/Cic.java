package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "CIC")
public class Cic {

    @JacksonXmlProperty(localName = "DATA")
    private Data DATA;

    @JacksonXmlProperty(localName = "RESP_CODE")
    private String RESP_CODE;

    @JacksonXmlProperty(localName = "RESP_DESC")
    private String RESP_DESC;

    @JacksonXmlProperty(localName = "TRANS_ID")
    private String TRANS_ID;
}
