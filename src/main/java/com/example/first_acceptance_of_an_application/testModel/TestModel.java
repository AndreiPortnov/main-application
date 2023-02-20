package com.example.first_acceptance_of_an_application.testModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"error"})
public class TestModel {
    @JsonProperty(value = "page")
    private Integer page;
    @JsonProperty(value = "per_page")
    private Integer perPage;
    @JsonProperty(value = "total")
    private Integer total;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPer_page(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


}
