package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns:AuxInfo")
public class AuxInfo {
    @JacksonXmlProperty(localName = "ns4:Xref")
    String Xref;
    @JacksonXmlProperty(localName = "ns4:FunctionCode")
    String FunctionCode;
}
