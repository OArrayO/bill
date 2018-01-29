package com.bdqn.util;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class Billutil implements Converter<String,Date> {


    public Date convert(String arg0){
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       try {
           return sdf.parse(arg0);
       } catch (ParseException e) {

           return null;
       }
   }


}
