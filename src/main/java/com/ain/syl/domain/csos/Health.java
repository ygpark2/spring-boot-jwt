package com.ain.syl.domain.csos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.kdn.eev.health")
public class Health {

    private String status;

    protected Health() {
    }

    public Health(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
