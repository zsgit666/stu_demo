package com.student.service;

import com.student.entity.Students;

import java.util.List;

public interface StudentService {
    List<Students> getAllStudents();

    int addStudents(Students students);

    int daleteStudent(Integer xh);

    int updateStudent(Students students);
}
