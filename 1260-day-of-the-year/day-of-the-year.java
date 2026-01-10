class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int result = 0;

        // Sum days of previous months
        for (int i = 0; i < month - 1; i++) {
            result += daysInMonth[i];
        }

        // Add current day
        result += day;

        return result;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
