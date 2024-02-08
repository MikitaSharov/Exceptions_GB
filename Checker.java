import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Checker {
    public String dateChecker(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        simpleDateFormat.setLenient(false);

        try {
            simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("неверный формат даты");
        }
        return date;
    }

    public int phoneChecker(String phone) {
        int phoneChecked;
        try {
            phoneChecked = Integer.parseInt(phone);
        } catch (NumberFormatException e) {
            throw new RuntimeException("неверный формат телефона");
        }
        return phoneChecked;
    }

    public char maleChecker(String male) {
        if (!male.toLowerCase().equals("f") && !male.toLowerCase().equals("m")) {
            throw new RuntimeException("неверный формат пола");
        }
        return male.toLowerCase().charAt(0);
    }
}
