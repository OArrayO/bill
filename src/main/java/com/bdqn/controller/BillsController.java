package com.bdqn.controller;

import com.bdqn.eneity.Bills;
import com.bdqn.eneity.Billtype;
import com.bdqn.eneity.pojo.pojobill;
import com.bdqn.service.Billservice;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class BillsController {
    @Resource
    private Billservice billservice;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String toBill(){
        return "redirect:/proList";
    }
    @RequestMapping(value = "/proList")
    public String toList(Model model, String fild, Date frdate, Date twDate, pojobill pojobill){
       pojobill= billservice.sBills(fild,frdate,twDate,pojobill);

       model.addAttribute("BList",pojobill.getBillsList());

       model.addAttribute("bool",fild);
       model.addAttribute("frdate",frdate);
       model.addAttribute("twDate",twDate);
       return "index";
    }
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String addBills(Model model){
        List<Billtype> tList=billservice.tBills();
        model.addAttribute("tList",tList);
        return "/addbill";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)

    public String addBill(Bills bills){
     int bill=   billservice.bills(bills);
     if (bill==1)
     {
         return "redirect:proList";
     }
        return   "redirect:add";
    }
}
