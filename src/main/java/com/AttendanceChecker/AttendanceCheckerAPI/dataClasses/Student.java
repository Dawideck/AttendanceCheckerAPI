    package com.AttendanceChecker.AttendanceCheckerAPI.dataClasses;

    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.ToString;
    import java.util.List;

    @Entity
    @ToString(callSuper = true)
    @Getter
    public class Student extends Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long studentId;

        @OneToMany(cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "studentId")
        private List<Attendance> attendanceList;

        public Student(List<Attendance> attendance, String name, String lastName) {
            super(name, lastName);
            this.attendanceList = attendance;
        }

        public Student(){
            super();
        }
    }