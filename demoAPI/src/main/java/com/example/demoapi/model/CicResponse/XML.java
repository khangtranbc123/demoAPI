package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "XML")
public class XML {
    @JacksonXmlProperty(localName = "NOIDUNG_BANTLTIN")
    NOIDUNG_BANTLTIN NOIDUNG_BANTLTIN;
}
