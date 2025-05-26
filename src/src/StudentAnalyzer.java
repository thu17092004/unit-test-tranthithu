package src;

import java.util.List;

public class StudentAnalyzer {
 
	//Đếm số học sinh loại giỏi (điểm >= 8.0), bỏ qua điểm sai lệch.
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }
	//Tính điểm trung bình các điểm hợp lệ (0 <= điểm <= 10).
	//Trả về 0 nếu danh sách rỗng hoặc không có điểm hợp lệ.
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        double sum = 0;
        int validCount = 0;

        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        return validCount > 0 ? sum / validCount : 0;
    }
}
