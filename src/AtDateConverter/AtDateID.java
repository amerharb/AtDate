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
    private int dateLevel;
    private int timeLevel;
    private int zoneLevel;
    private enum AtDateTypeEnum{
        All, End, Begin
    }
    
    protected AtDateID(LocalDate d, LocalTime t){
        this(d, t, 0, AtDateTypeEnum.Begin);
    }

    protected AtDateID(LocalDate d, LocalTime t, double timeZone){
        this(d, t, timeZone, AtDateTypeEnum.Begin);
    }

    protected AtDateID(LocalDate d, LocalTime t, AtDateTypeEnum dateType){
        this(d, t, 0, dateType);
    }
    
    protected AtDateID(LocalDate d, LocalTime t, double timeZone, AtDateTypeEnum dateType){
        
    }
}
