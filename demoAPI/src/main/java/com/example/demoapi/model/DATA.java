package com.example.demoapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DATA {
    @JacksonXmlProperty(localName = "SRC_SYSTEM")
    String SRC_SYSTEM;

    @JacksonXmlProperty(localName = "LOAI_KH")
    String LOAI_KH;

    @JacksonXmlProperty(localName = "LOAI_YC")
    String LOAI_YC;

    @JacksonXmlProperty(localName = "CMND_DKKD")
    String CMND_DKKD;


}
