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
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(10.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()));
        assertEquals(10.0, analyzer.calculateValidAverage(Arrays.asList(10.0)), 0.01);
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-3.0, 11.0)), 0.01);
    }
}
