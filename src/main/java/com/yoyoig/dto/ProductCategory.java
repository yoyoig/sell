package com.yoyoig.dto;

/**
 * Created by 铭刻 on 2018/1/8.
 *
 * 'category_id' INT NOT NULL ,
 'category_name' VARCHAR (64) NOT NULL COMMIT '类目名称',
 'category_type' INT NOT NULL COMMIT '类目编号',
 'create_time' TIMESTAMP NOT NULL DEFAULT crrent_timestamp COMMIT '创建时间',
 'update_time' TIMESTAMP NOT NULL DEFAULT crrent_timestamp ON UPD
 */

public class ProductCategory {


    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}