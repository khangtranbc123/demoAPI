package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BodyRequest {
    @JacksonXmlProperty(localName = "AuxInfo")
    AuxInfo auxInfo;
    @JacksonXmlProperty(localName = "AccInfo")
    AccInfo accInfo;
}
