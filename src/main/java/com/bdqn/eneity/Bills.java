package com.bdqn.eneity;

import java.util.Date;

public class Bills {
    private int id;
    private String title;

    public Date getTitle_time() {
        return title_time;
    }

    public void setTitle_time(Date title_time) {
        this.title_time = title_time;
    }

    private Date title_time;
    private int type_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int price;

    public Billtype getBilltype() {
        return billtype;
    }

    public void setBilltype(Billtype billtype) {
        this.billtype = billtype;
    }

    private Billtype billtype;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    private String explain;

}
