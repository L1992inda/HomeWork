package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod other) {
        if (!(this.end.isBefore(other.start) || this.start.isAfter(other.end))) {
            LocalDate finalStart;
            if (this.start.isAfter(other.start)) {
                finalStart = this.start;
            } else {
                finalStart = other.start;
            }
            LocalDate finalEnd;
            if (this.end.isAfter(other.end)) {
                finalEnd = this.end;
            } else {
                finalEnd = other.end;
            }
            return new DatePeriod(finalStart, finalEnd);
        } else {
            return null;
        }
    }

}