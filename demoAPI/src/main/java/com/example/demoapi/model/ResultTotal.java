package com.example.demoapi.model;

public class ResultTotal {
    private results results;

    public ResultTotal(com.example.demoapi.model.results results) {
        this.results = results;
    }

    public com.example.demoapi.model.results getResults() {
        return results;
    }

    public void setResults(com.example.demoapi.model.results results) {
        this.results = results;
    }

    public ResultTotal() {
    }
}
