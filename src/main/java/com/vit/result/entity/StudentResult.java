
package com.vit.result.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_result")
public class StudentResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String rollNo;

    private String subject1;
    private int mse1;
    private int ese1;

    private String subject2;
    private int mse2;
    private int ese2;

    private String subject3;
    private int mse3;
    private int ese3;

    private String subject4;
    private int mse4;
    private int ese4;

    // Keep all your existing getters and setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject1() { return subject1; }
    public void setSubject1(String subject1) { this.subject1 = subject1; }

    public int getMse1() { return mse1; }
    public void setMse1(int mse1) { this.mse1 = mse1; }

    public int getEse1() { return ese1; }
    public void setEse1(int ese1) { this.ese1 = ese1; }

    public String getSubject2() { return subject2; }
    public void setSubject2(String subject2) { this.subject2 = subject2; }

    public int getMse2() { return mse2; }
    public void setMse2(int mse2) { this.mse2 = mse2; }

    public int getEse2() { return ese2; }
    public void setEse2(int ese2) { this.ese2 = ese2; }

    public String getSubject3() { return subject3; }
    public void setSubject3(String subject3) { this.subject3 = subject3; }

    public int getMse3() { return mse3; }
    public void setMse3(int mse3) { this.mse3 = mse3; }

    public int getEse3() { return ese3; }
    public void setEse3(int ese3) { this.ese3 = ese3; }

    public String getSubject4() { return subject4; }
    public void setSubject4(String subject4) { this.subject4 = subject4; }

    public int getMse4() { return mse4; }
    public void setMse4(int mse4) { this.mse4 = mse4; }

    public int getEse4() { return ese4; }
    public void setEse4(int ese4) { this.ese4 = ese4; }

    public Long getId() {
    return id;
     }

    public void setId(Long id) {
    this.id = id;
}
}