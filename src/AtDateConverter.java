
/**
 *
 * @author Amer Harb
 */
public class AtDateConverter {

    public static String getAtDateBits(int year, int month, int day, int hour, int min, int sec) {

        StringBuilder sb = new StringBuilder();

        sb.append("@");

        if (year >= 0 && year < 10) {
            sb.append("000" + year);
        } else if (year >= 10 && year < 100) {
            sb.append("00" + year);
        } else if (year >= 100 && year < 1000) {
            sb.append("0" + year);
        } else if (year >= 1000 && year < 10000) {
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

        if (sec >= 0 && sec < 10) {
            sb.append("0" + sec);
        } else if (sec >= 10 && sec < 60) {
            sb.append(sec);
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        return getAtDateBits(sb.toString());
    }

    public static String getAtDateBits(int year, int month, int day, int hour, int min) {

        return getAtDateBits(year, month, day, hour, min, 0);
    }

    public static String getAtDateBits(int year, int month, int day, int hour) {

        return getAtDateBits(year, month, day, hour, 0, 0);
    }

    public static String getAtDateBits(int year, int month, int day) {

        return getAtDateBits(year, month, day, 0, 0, 0);
    }

    public static String getAtDateBits(int year, int month) {

        return getAtDateBits(year, month, 1, 0, 0, 0);
    }

    private static String getAtDateBits(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
