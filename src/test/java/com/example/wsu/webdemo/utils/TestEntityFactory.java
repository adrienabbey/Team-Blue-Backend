package com.example.wsu.webdemo.utils;

import com.example.wsu.webdemo.domain.CourseLevel;
import com.example.wsu.webdemo.dto.CourseDTO;
import com.example.wsu.webdemo.entity.Course;

public class TestEntityFactory {
    public static CourseDTO validCourseDTO() {
        return CourseDTO.builder()
                .type("CS")
                .code("1000")
                .name("Technology and Society")
                .description(
                        "Examines and evaluates the consequences of technology on individuals, organizations and society to recognize its benefits, potential, and limitations. Explores current social, ethical, legal and philosophical topics to understand how the Digital Revolution impacts society. Integrated Writing course.")
                .level(CourseLevel.UNDERGRADUATE)
                .creditHours(3)
                .build();
    }

    public static Course validCourse() {
        return new Course(1L, "CS", "1000", "Technology and Society",
                "Examines and evaluates the consequences of technology on individuals, organizations and society to recognize its benefits, potential, and limitations. Explores current social, ethical, legal and philosophical topics to understand how the Digital Revolution impacts society. Integrated Writing course.",
                CourseLevel.UNDERGRADUATE, 3);
    }
}
