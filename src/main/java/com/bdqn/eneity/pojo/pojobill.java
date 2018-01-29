package com.bdqn.eneity.pojo;

import com.bdqn.eneity.Bills;

import java.util.ArrayList;
import java.util.List;

public class pojobill {
    /*
    当前页码
     */
    private Integer pageIndex=1;
    /*
    每页条数
     */
    private Integer pageSize=2;

    /*
    总条数
     */
    private Integer totalCount=1;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        if (totalCount>0){
            this.pageCount=totalCount%pageSize==0?
                    totalCount/pageSize:
                    totalCount/pageSize+1;
        }
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /*
        总页数
         */
    private Integer pageCount=4;

    public List<Bills> getBillsList() {
        return billsList;
    }

    public void setBillsList(List<Bills> billsList) {
        this.billsList = billsList;
    }

    private List<Bills> billsList=new ArrayList<Bills>();
}
