package com.bdqn.service.impl;

import com.bdqn.dao.UserMapper;
import com.bdqn.eneity.Bills;
import com.bdqn.eneity.Billtype;
import com.bdqn.eneity.pojo.pojobill;
import com.bdqn.service.Billservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class Billserviceimpl implements Billservice{
    @Resource
    private UserMapper userMapper;
    public pojobill sBills(String fild, Date frdate, Date twDate, pojobill pojobill) {
            if (pojobill==null){
            pojobill=new pojobill();
        }
       Integer totalCount= userMapper.poBills(fild,frdate,twDate);
        pojobill.setTotalCount(totalCount);
        if (pojobill.getPageIndex()<1){
            pojobill.setPageIndex(1);
        }
        if (pojobill.getPageIndex()>pojobill.getPageCount()){
            pojobill.setPageIndex(pojobill.getPageCount());
        }
        pojobill.setBillsList(userMapper.sBills(fild,frdate,twDate,(pojobill.getPageIndex()-1)*pojobill.getPageSize(),pojobill.getPageSize()));
        return pojobill;
    }





    public int bills(Bills bills) {
        int state=0;
        if (bills!=null){
            state=1;
            userMapper.bills(bills);
        }
        return state;
    }

    public List<Billtype> tBills() {
       return userMapper.tBills();
    }
}
