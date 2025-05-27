# unit-test-tranthithu
# Mô tả bài toán:
Viết lớp `StudentAnalyzer` với hai phương thức chính:
- countExcellentStudents:  
  Đếm số học sinh có điểm loại Giỏi (>= 8.0).  
  Bỏ qua điểm không hợp lệ (âm hoặc lớn hơn 10).  
  Nếu danh sách rỗng, trả về 0.
- calculateValidAverage:  
  Tính điểm trung bình của các điểm hợp lệ (0 đến 10).  
  Nếu danh sách rỗng, trả về 0.
# Môi trường sử dụng:
- jdk 17
- Spring tool suite 4
- JUnit 5
# Cấu trúc thư mục
- src/StudentAnalyzer.java — Mã nguồn.
- test/StudentAnalyzerTest.java — Test case.
# Cách chạy kiểm thử:
- tạo thư mục src, test
- tạo file StudentAnalyzer.java và StudentAnalyzerTest.java
- thêm thư viện
- chạy chương trình
# Cách kiểm thử:
- Cài đặt plugin EclEmma Java Code Coverage.
- Chọn project -> chuột phải → chọn Coverage As > JUnit Test.
# Kết quả kiểm thử:
![image](https://github.com/user-attachments/assets/b727dec1-5b10-48c7-b28b-d743105e4d65)

