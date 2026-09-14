import java.time.LocalDate;
import java.time.Period;

class Solution {
    public int dayOfYear(String date) {
        LocalDate dt = LocalDate.parse(date);
        return dt.getDayOfYear();
    }
}