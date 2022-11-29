package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccInfo {
    @JacksonXmlProperty(localName = "CIFNo")
    String CIFNo;
    @JacksonXmlProperty(localName = "AdditionInformation")
    AdditionInformation additionInformation;
}
