package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns:BodyRequest")
public class BodyRequest {
    @JacksonXmlProperty(localName = "ns:AuxInfo")
    AuxInfo auxInfo;
    @JacksonXmlProperty(localName = "ns:AccInfo")
    AccInfo accInfo;
}
