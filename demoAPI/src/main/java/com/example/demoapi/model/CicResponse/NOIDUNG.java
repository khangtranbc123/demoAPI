package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "NOIDUNG")
public class NOIDUNG {
    @JacksonXmlProperty(localName = "TTPHAPLY")
    TTPHAPLY TTPHAPLY;
}
