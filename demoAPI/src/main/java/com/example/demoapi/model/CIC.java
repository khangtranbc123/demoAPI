package com.example.demoapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CIC {
    @JacksonXmlProperty(localName = "INFO")
    INFO INFO;
    @JacksonXmlProperty(localName = "DATA")
    DATA DATA;

}
