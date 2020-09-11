package com.test.cdx;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Setter
@Getter
public class ClockCalculate {
    private String time_zone;
    //根据时区获得对应当前时间
    public String CurrentTime(){
        TimeZone time = TimeZone.getTimeZone(time_zone);
        TimeZone.setDefault(time);
        Calendar calendar  = Calendar.getInstance();
        Date date  =calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int a =0;
        return format.format(date);
    }
}
