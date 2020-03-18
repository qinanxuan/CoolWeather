package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @version 1$
 * @Created by HTZ on 2020/3/17 18:50
 * @package_name com.coolweather.android.db
 * @des 省份实体类
 */
public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
