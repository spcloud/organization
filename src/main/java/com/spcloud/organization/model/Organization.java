package com.spcloud.organization.model;

import java.io.Serializable;

/**
 * @description:组织
 * @author: chenyk25600
 * @create: 2019-07-29 15:29
 **/
public class Organization implements Serializable {
    private static final long serialVersionUID = 7671418819256082391L;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
