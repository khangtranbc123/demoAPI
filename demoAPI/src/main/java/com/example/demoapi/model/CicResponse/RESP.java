package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "RESP")
public class RESP {
    @JacksonXmlProperty(localName = "CODE")
    String CODE;

    @JacksonXmlProperty(localName = "DESC")
    String DESC;
}
