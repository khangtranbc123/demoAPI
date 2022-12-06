package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns:AccInfo")
public class AccInfo {
    @JacksonXmlProperty(localName = "ns5:CIFNo")
    String CIFNo;
    @JacksonXmlProperty(localName = "ns5:AdditionInformation")
    AdditionInformation additionInformation;
}
