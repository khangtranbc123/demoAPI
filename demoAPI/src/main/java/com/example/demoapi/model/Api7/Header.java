package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Header {
    @JacksonXmlProperty(localName = "Common")
    Common common;
    @JacksonXmlProperty(localName = "Client")
    Client client;
}
