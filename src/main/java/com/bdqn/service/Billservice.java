package com.bdqn.service;

import com.bdqn.eneity.Bills;
import com.bdqn.eneity.Billtype;
import com.bdqn.eneity.pojo.pojobill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface Billservice {
    public pojobill sBills(String fild, Date frdate, Date twDate, pojobill pojobill);
    public int bills(Bills bills);
    public List<Billtype> tBills();

}
