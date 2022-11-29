package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuxInfo {
    @JacksonXmlProperty(localName = "Xref")
    String Xref;
    @JacksonXmlProperty(localName = "FunctionCode")
    String FunctionCode;
}
