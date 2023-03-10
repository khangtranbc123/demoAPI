package com.example.demoapi.model.resultODH;

import lombok.Data;

@Data
public class ResultODHar {
    private String cif;
    private String dkkd;
    private String mst;

    private String duno_sanpham;

    private String duno_branch;

    private Double duno_osamount;

    public ResultODHar(String cif, String dkkd, String mst, String duno_sanpham, String duno_branch, Double duno_osamount) {
        this.cif = cif;
        this.dkkd = dkkd;
        this.mst = mst;
        this.duno_sanpham = duno_sanpham;
        this.duno_branch = duno_branch;
        this.duno_osamount = duno_osamount;
    }
}
