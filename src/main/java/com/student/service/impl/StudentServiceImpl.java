package com.student.service.impl;

import com.student.entity.Students;
import com.student.entity.StudentsExample;
import com.student.mapper.StudentsMapper;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudents() {
        return studentsMapper.selectByExample(new StudentsExample());
    }

    @Override
    public int addStudents(Students students) {
        return studentsMapper.insertSelective(students);
    }

    @Override
    public int daleteStudent(Integer xh) {
        return studentsMapper.deleteByPrimaryKey(xh);
    }

    @Override
    public int updateStudent(Students students) {
        return studentsMapper.updateByPrimaryKey(students);
    }
}
