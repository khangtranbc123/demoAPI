package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "TT_NGUOITRACUU")
public class TT_NGUOITRACUU {
    @JacksonXmlProperty(localName = "DONVITRACUU")
    String DONVITRACUU;

    @JacksonXmlProperty(localName = "DIACHI")
    String DIACHI;

    @JacksonXmlProperty(localName = "TENTRUYCAP")
    String TENTRUYCAP;

    @JacksonXmlProperty(localName = "DTHOAI")
    String DTHOAI;

    @JacksonXmlProperty(localName = "MSPHIEU")
    String MSPHIEU;

    @JacksonXmlProperty(localName = "THOIGIANYC")
    String THOIGIANYC;

    @JacksonXmlProperty(localName = "THOIGIANTL")
    String THOIGIANTL;

    @JacksonXmlProperty(localName = "TT_TRALOI")
    String TT_TRALOI;
}
