package fr.univamu.iut;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

    }

}
