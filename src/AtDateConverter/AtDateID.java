/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtDateConverter;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author amharb
 */
class AtDateID {

    private int dateLevel = -1;
    private int timeLevel = -1;
    private int zoneLevel = -1;

    private enum AtDateTypeEnum {
        All, End, Begin
    }

    private double z;

    protected AtDateID(LocalDate d, LocalTime t) {
        this(d, t, 0, AtDateTypeEnum.Begin);
    }

    protected AtDateID(LocalDate d, LocalTime t, double timeZone) {
        this(d, t, timeZone, AtDateTypeEnum.Begin);
    }

    protected AtDateID(LocalDate d, LocalTime t, AtDateTypeEnum dateType) {
        this(d, t, 0, dateType);
    }

    protected AtDateID(LocalDate d, LocalTime t, double z, AtDateTypeEnum dateType) {

        this(d, g)
    }

    protected AtDateID(LocalDate d, int DateLevel, LocalTime t, int TimeLevel, double timeZone, int zoneLevel, AtDateTypeEnum dateType) {

        //TODO:write code here
    }

    private int getDateLevelNeeded(LocalDate d) {
        if (d == null) {
            return 0;
        } else if (d.isAfter(LocalDate.of(2016, 7, 30)) && d.isBefore(LocalDate.of(2106, 4, 20))) {
            return 1;

        } else { //TODO: support more level
            return 2;

        }
    }

    private int getTimeLevelNeeded(LocalTime t) {
        if (t == null) {
            return 0;
        } else if (t.getMinute() == 0 && t.getSecond() == 0 && t.getNano() == 0) {
            return 1; //hours
        } else if (t.getMinute() % 5 == 0 && t.getSecond() == 0 && t.getNano() == 0) {
            return 2; //5 min
        } else if (t.getSecond() == 0 && t.getNano() == 0) {
            return 3; //min
        } else if (t.getNano() == 0) {
            return 4; //sec
        } else if (t.getNano() % 1000000 == 0) {
            return 5; //Mili Sec
        } else if (t.getNano() % 1000 == 0) {
            return 6; //Micro Sec
        } else {
            return 7; //Nano
            //TODO: support more level    
        }
    }

    private int getZoneLevelNeeded(double timeZone) {
        if (timeZone == 0) {
            return 0;
        } else if (timeZone % 0.25 == 0) {
            return 1;
        } else {
            return 2;
            //TODO: support more level    
        }
    }

}

class AtDateUtil {

}
