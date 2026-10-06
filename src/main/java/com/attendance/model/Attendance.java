package com.attendance.model;

import java.time.LocalDate;

public class Attendance {

    private int attendanceId;
    private int studentId;
    private LocalDate attendanceDate;
    private String status;

    public Attendance(int attendanceId, int studentId, LocalDate attendanceDate, String status) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.attendanceDate = attendanceDate;
        this.status = status;
    }
}