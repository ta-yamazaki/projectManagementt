package com.project.management.domain.model.schedule;

import java.time.LocalDate;

/**
 * 案件の期間
 */
public class Schedule {
    LocalDate from;
    LocalDate to;

    public Schedule() {
    }

    public Schedule(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate from() {
        return from;
    }

    public LocalDate to() {
        return to;
    }

    public String asText() {
        return from + " - " + to;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
