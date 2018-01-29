package com.bdqn.dao;

import com.bdqn.eneity.Bills;
import com.bdqn.eneity.Billtype;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserMapper {
        public List<Bills> sBills(@Param("fild") String fild,
                                  @Param("frdate")Date frdate,
                                  @Param("twDate")Date twDate,
                                  @Param("from") Integer from,
                                  @Param("pageSize")Integer pageSize
            )

                ;
        public Integer poBills(@Param("fild") String fild,
                               @Param("frdate")Date frdate,
                               @Param("twDate")Date twDate
                             );
        public void bills(Bills bills);
        public List<Billtype> tBills();
}
