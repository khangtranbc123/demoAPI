package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "NOIDUNG_BANTLTIN")
public class NOIDUNG_BANTLTIN {
    @JacksonXmlProperty(localName = "TT_NGUOITRACUU")
    TT_NGUOITRACUU TT_NGUOITRACUU;

    @JacksonXmlProperty(localName = "NOIDUNG")
    NOIDUNG NOIDUNG;
}
