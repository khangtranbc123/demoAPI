package com.example.demoapi.model.resultODH;

import lombok.Data;

@Data
public class ResultODHcts {
    private String cif;
    private String dkkd;
    private String mst;

    private Integer cusdebtstatus;

    private Integer maxdebtgroup;

    private Double non_fin5;

    public ResultODHcts(String cif, String dkkd, String mst, Integer cusdebtstatus, Integer maxdebtgroup, Double non_fin5) {
        this.cif = cif;
        this.dkkd = dkkd;
        this.mst = mst;
        this.cusdebtstatus = cusdebtstatus;
        this.maxdebtgroup = maxdebtgroup;
        this.non_fin5 = non_fin5;
    }

    public ResultODHcts(String cif, String dkkd, String mst, Double non_fin5) {
        this.cif = cif;
        this.dkkd = dkkd;
        this.mst = mst;
        this.non_fin5 = non_fin5;
    }
}
