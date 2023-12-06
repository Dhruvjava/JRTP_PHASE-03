package com.cb;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class LocalDateGenerator {

    public LocalDate generateLocalDate(int year, int month, int weekNumber, DayOfWeek dayOfWeek) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

        LocalDate lastWeekStart = firstDayOfMonth.with(TemporalAdjusters.firstInMonth(dayOfWeek)).plusWeeks(weekNumber - 1);
        LocalDate lastWeekEnd = lastWeekStart.plusDays(6); // Assuming Monday is the start of the week

        if (lastWeekEnd.isAfter(lastDayOfMonth)) {
            lastWeekEnd = lastDayOfMonth;
        }

        return lastWeekStart;
    }

    public static void main(String[] args) {
        LocalDateGenerator generator = new LocalDateGenerator();
        LocalDate date = generator.generateLocalDate(2023, 12, 5, DayOfWeek.FRIDAY);
        System.out.println("Generated LocalDate: " + date);
    }
}
