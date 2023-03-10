package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "TTPHAPLY")
@XmlType(propOrder = { "MACIC", "TENKH", "DIACHI_TRUSOCHINH", "CMND_HC", "GIAYTOKHAC", "DKKD", "MST", "TGD_GD", "NGUOI_DAIDIENPL" })
public class TTPHAPLY {
    @JacksonXmlProperty(localName = "MACIC")
    String MACIC;

    @JacksonXmlProperty(localName = "TENKH")
    String TENKH;

    @JacksonXmlProperty(localName = "DIACHI_TRUSOCHINH")
    String DIACHI_TRUSOCHINH;

    @JacksonXmlProperty(localName = "CMND_HC")
    String CMND_HC;

    @JacksonXmlProperty(localName = "GIAYTOKHAC")
    String GIAYTOKHAC;

    @JacksonXmlProperty(localName = "DKKD")
    String DKKD;

    @JacksonXmlProperty(localName = "MST")
    String MST;

    @JacksonXmlProperty(localName = "TGD_GD")
    String TGD_GD;

    @JacksonXmlProperty(localName = "NGUOI_DAIDIENPL")
    String NGUOI_DAIDIENPL;

    public String getMACIC() {
        return MACIC;
    }

    public String getTENKH() {
        return TENKH;
    }

    public String getDIACHI_TRUSOCHINH() {
        return DIACHI_TRUSOCHINH;
    }

    public String getCMND_HC() {
        return CMND_HC;
    }

    public String getGIAYTOKHAC() {
        return GIAYTOKHAC;
    }

    public String getDKKD() {
        return DKKD;
    }

    public String getMST() {
        return MST;
    }

    public String getTGD_GD() {
        return TGD_GD;
    }

    public String getNGUOI_DAIDIENPL() {
        return NGUOI_DAIDIENPL;
    }
    @XmlElement
    public void setMACIC(String MACIC) {
        this.MACIC = MACIC;
    }
    @XmlElement
    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }
    @XmlElement
    public void setDIACHI_TRUSOCHINH(String DIACHI_TRUSOCHINH) {
        this.DIACHI_TRUSOCHINH = DIACHI_TRUSOCHINH;
    }
    @XmlElement
    public void setCMND_HC(String CMND_HC) {
        this.CMND_HC = CMND_HC;
    }
    @XmlElement
    public void setGIAYTOKHAC(String GIAYTOKHAC) {
        this.GIAYTOKHAC = GIAYTOKHAC;
    }
    @XmlElement
    public void setDKKD(String DKKD) {
        this.DKKD = DKKD;
    }
    @XmlElement
    public void setMST(String MST) {
        this.MST = MST;
    }
    @XmlElement
    public void setTGD_GD(String TGD_GD) {
        this.TGD_GD = TGD_GD;
    }
    @XmlElement
    public void setNGUOI_DAIDIENPL(String NGUOI_DAIDIENPL) {
        this.NGUOI_DAIDIENPL = NGUOI_DAIDIENPL;
    }
}
