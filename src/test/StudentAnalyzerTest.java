package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

import src.StudentAnalyzer;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp danh sách có điểm hợp lệ và không hợp lệ
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
        // Danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        // Trường hợp biên: toàn 0 hoặc 10
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));

        // Trường hợp có điểm null
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(null, 8.0, 7.9)));

        // Tất cả điểm không hợp lệ
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-5.0, 11.0, 12.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp danh sách có điểm hợp lệ và không hợp lệ
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);

        // Danh sách rỗng
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()));

        // Trường hợp biên: toàn 0 hoặc 10
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)));

        // Trường hợp có điểm null
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(null, 8.0)));

        // Tất cả điểm không hợp lệ
        assertEquals(0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 11.0, 12.0)));
    }
}
