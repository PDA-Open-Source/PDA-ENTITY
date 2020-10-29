package com.pda.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class SlimRegistryEntityDocsDto {
    @JsonProperty(value="request")
    private SlimRequestEntityDocsId request;
    private String id;
    private String ver;

    public SlimRequestEntityDocsId getRequest() {
        return request;
    }

    public void setRequest(SlimRequestEntityDocsId request) {
        this.request = request;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }



}



