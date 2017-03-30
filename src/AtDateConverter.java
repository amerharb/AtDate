
/**
 *
 * @author Amer Harb
 */
public class AtDateConverter {

    private static String getAtDateBits(int year, int month, int day, int hour, int min, int sec) {

        StringBuilder sb = new StringBuilder();

        sb.append("@");

        if (year <= -10000) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } else if (year < -999) {
            sb.append("-" + Math.abs(year));
        } else if (year < -99) {
            sb.append("-0" + Math.abs(year));
        } else if (year < -9) {
            sb.append("-00" + Math.abs(year));
        } else if (year < 0) {
            sb.append("-000" + Math.abs(year));
        } else if (year < 10) {
            sb.append("000" + year);
        } else if (year < 100) {
            sb.append("00" + year);
        } else if (year < 1000) {
            sb.append("0" + year);
        } else if (year < 10000) {
            sb.append(year);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        if (min >= 0 && min < 10) {
            sb.append("0" + min);
        } else if (min >= 10 && min < 60) {
            sb.append(min);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        if (month >= 1 && month < 10) {
            sb.append("0" + month);
        } else if (month >= 10 && month <= 12) {
            sb.append(month);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        int maxDay;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 28;
            //TODO: leap year
        }

        if (day >= 1 && day < 10) {
            sb.append("0" + day);
        } else if (month >= 10 && month <= 12) {
            sb.append(month);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        if (sec >= 0 && sec < 10) {
            sb.append("0" + sec);
        } else if (sec >= 10 && sec < 60) {
            sb.append(sec);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        return getAtDateBits(sb.toString());
    }

    private static String getAtDateBits(int year, int month, int day, int hour, int min) {

        return getAtDateBits(year, month, day, hour, min, 0);
    }

    private static String getAtDateBits(int year, int month, int day, int hour) {

        return getAtDateBits(year, month, day, hour, 0, 0);
    }

    private static String getAtDateBits(int year, int month, int day) {

        return getAtDateBits(year, month, day, 0, 0, 0);
    }

    private static String getAtDateBits(int year, int month) {

        return getAtDateBits(year, month, 1, 0, 0, 0);
    }

    private static String getAtDateBits(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
