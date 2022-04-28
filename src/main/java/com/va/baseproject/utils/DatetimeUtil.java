package com.va.baseproject.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

@Component
public class DatetimeUtil {
    private final Calendar calendar = Calendar.getInstance();
    private final static String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";

    public static String getToday() {
        Date date = new Date();
        String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
        return d;
    }

    public static String getNow(String format) {
        Date date = new Date();
        return formatDate(date, format);
    }

    public static String formatDate(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    public static String formatDate(Date date) {
        return formatDate(date, DEFAULT_DATE_FORMAT);
    }

    public static Long diffDate(Date date1, Date date2) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date1);

        Calendar c2 = Calendar.getInstance();
        c2.setTime(date2);

        return ChronoUnit.DAYS.between(c1.toInstant(), c2.toInstant());
    }

    public static String convertDate(String date, String inputFormat, String outputFormat) throws Exception {
        SimpleDateFormat inputDate = new SimpleDateFormat(inputFormat);
        SimpleDateFormat outputDate = new SimpleDateFormat(outputFormat);
        return outputDate.format(inputDate.parse(date));
    }

    public String getTimespanSequence(Date inputDatetime) {
        return String.valueOf(inputDatetime.getTime());
    }

    public String getTimespanSequence() {
        return getTimespanSequence(new Date());
    }

    public Date addDays(Date input, int days) {
        calendar.setTime(input);
        calendar.add(Calendar.DATE, days);

        return calendar.getTime();
    }
}
