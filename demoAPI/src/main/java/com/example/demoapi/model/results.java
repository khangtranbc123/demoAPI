package com.example.demoapi.model;

public class results {
    private String cif;
    private String dkkd;
    private String mst;
    private String industry;

    private String industry_code;

    public results(String cif, String dkkd, String mst, String industry, String industry_code) {
        this.cif = cif;
        this.dkkd = dkkd;
        this.mst = mst;
        this.industry = industry;
        this.industry_code = industry_code;
    }

    public results() {
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDkkd() {
        return dkkd;
    }

    public void setDkkd(String dkkd) {
        this.dkkd = dkkd;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustry_code() {
        return industry_code;
    }

    public void setIndustry_code(String industry_code) {
        this.industry_code = industry_code;
    }
}
