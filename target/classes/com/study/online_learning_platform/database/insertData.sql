-- da them 
INSERT INTO users (username, email, password_hash, first_name, last_name, phone, date_of_birth, avatar_url, bio, role, status, email_verified, last_login) VALUES
('admin', 'admin@elearning.com', '$2y$10$example_hash_admin', 'Admin', 'System', '0123456789', '1990-01-01', 'https://example.com/avatars/admin.jpg', 'System Administrator', 'admin', 'active', TRUE, '2024-01-15 10:30:00'),
('nguyenvana', 'nguyenvana@gmail.com', '$2y$10$example_hash_instructor1', 'Nguyễn Văn', 'A', '0987654321', '1985-03-15', 'https://example.com/avatars/instructor1.jpg', 'Full-stack Developer với 10 năm kinh nghiệm. Chuyên về JavaScript, React, Node.js', 'instructor', 'active', TRUE, '2024-01-14 09:15:00'),
('tranthib', 'tranthib@gmail.com', '$2y$10$example_hash_instructor2', 'Trần Thị', 'B', '0912345678', '1988-07-22', 'https://example.com/avatars/instructor2.jpg', 'UI/UX Designer với passion về thiết kế trải nghiệm người dùng', 'instructor', 'active', TRUE, '2024-01-14 14:20:00'),
('phamvanc', 'phamvanc@gmail.com', '$2y$10$example_hash_instructor3', 'Phạm Văn', 'C', '0934567890', '1987-11-10', 'https://example.com/avatars/instructor3.jpg', 'Data Scientist và Machine Learning Expert', 'instructor', 'active', TRUE, '2024-01-13 16:45:00'),
('levand', 'levand@gmail.com', '$2y$10$example_hash_instructor4', 'Lê Văn', 'D', '0945678901', '1990-05-18', 'https://example.com/avatars/instructor4.jpg', 'Digital Marketing Specialist', 'instructor', 'active', TRUE, '2024-01-14 08:30:00'),
('student1', 'student1@gmail.com', '$2y$10$example_hash_student1', 'Hoàng Minh', 'Tuấn', '0123456788', '1995-06-12', 'https://example.com/avatars/student1.jpg', 'Sinh viên IT năm 3', 'student', 'active', TRUE, '2024-01-15 20:15:00'),
('student2', 'student2@gmail.com', '$2y$10$example_hash_student2', 'Lê Thị', 'Mai', '0123456787', '1998-09-25', 'https://example.com/avatars/student2.jpg', 'Nhân viên marketing muốn chuyển sang IT', 'student', 'active', TRUE, '2024-01-15 19:30:00'),
('student3', 'student3@gmail.com', '$2y$10$example_hash_student3', 'Nguyễn Văn', 'Nam', '0123456786', '1992-12-03', 'https://example.com/avatars/student3.jpg', 'Freelancer thiết kế web', 'student', 'active', TRUE, '2024-01-15 18:45:00'),
('student4', 'student4@gmail.com', '$2y$10$example_hash_student4', 'Trần Thị', 'Hoa', '0123456785', '1996-04-17', 'https://example.com/avatars/student4.jpg', 'Fresh graduate tìm hiểu về data science', 'student', 'active', TRUE, '2024-01-15 17:20:00'),
('student5', 'student5@gmail.com', '$2y$10$example_hash_student5', 'Phạm Minh', 'Đức', '0123456784', '1994-08-30', 'https://example.com/avatars/student5.jpg', 'Backend developer muốn học thêm frontend', 'student', 'active', TRUE, '2024-01-15 16:10:00'),
('admin01', 'admin@onlinelearning.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'System', 'Administrator', '0901234567', '1985-01-15', 'Quản trị viên hệ thống', 'admin', 'active', TRUE, '2025-01-20 10:00:00'),
('gv_levanc', 'levanc@gmail.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Lê Văn', 'C', '0901234570', '1978-12-03', 'Giảng viên thiết kế đồ họa và UI/UX', 'instructor', 'active', TRUE, '2025-01-20 07:20:00'),
('gv_phamthid', 'phamthid@gmail.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Phạm Thị', 'D', '0901234571', '1983-03-25', 'Chuyên gia Digital Marketing', 'instructor', 'active', TRUE, '2025-01-19 16:30:00'),
('hv_nguyene', 'nguyene@student.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Nguyễn', 'E', '0901234572', '1995-06-15', 'Sinh viên năm cuối ngành CNTT', 'student', 'active', TRUE, '2025-01-20 11:15:00'),
('hv_tranhf', 'tranhf@student.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Trần', 'F', '0901234573', '1997-09-22', 'Đam mê lập trình web', 'student', 'active', TRUE, '2025-01-20 10:45:00'),
('hv_levang', 'levang@student.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Lê Văn', 'G', '0901234574', '1996-04-18', 'Muốn học thiết kế UI/UX', 'student', 'active', TRUE, '2025-01-20 09:20:00'),
('hv_phamh', 'phamh@student.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Phạm', 'H', '0901234575', '1998-11-05', 'Quan tâm đến AI và Machine Learning', 'student', 'active', TRUE, '2025-01-20 08:10:00'),
('hv_hoangk', 'hoangk@student.com', '$2y$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi', 'Hoàng', 'K', '0901234576', '1999-01-30', 'Mới bắt đầu học lập trình', 'student', 'active', TRUE, '2025-01-19 20:30:00');
-- da them
INSERT INTO user_preferences (user_id, language, timezone, email_notifications, push_notifications, marketing_emails, theme, playback_speed, auto_play_next) VALUES
(1, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'light', 1.00, TRUE),
(2, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.25, TRUE),
(3, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, FALSE, 'dark', 1.00, FALSE),
(4, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.50, TRUE),
(5, 'vi', 'Asia/Ho_Chi_Minh', FALSE, TRUE, TRUE, 'dark', 1.25, TRUE),
(6, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'light', 1.00, TRUE),
(7, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, TRUE, 'light', 1.25, FALSE),
(8, 'vi', 'Asia/Ho_Chi_Minh', FALSE, TRUE, FALSE, 'dark', 1.00, TRUE),
(9, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.50, TRUE),
(10, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, FALSE, 'light', 1.25, FALSE);
INSERT INTO user_preferences (user_id, language, timezone, email_notifications, push_notifications, marketing_emails, theme, playback_speed, auto_play_next) VALUES
(11, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'light', 1.25, TRUE),
(12, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, TRUE, 'dark', 1.00, FALSE),
(13, 'en', 'Asia/Ho_Chi_Minh', FALSE, TRUE, FALSE, 'light', 1.50, TRUE),
(14, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'system', 1.00, TRUE),
(15, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'light', 1.00, TRUE),
(16, 'en', 'Asia/Ho_Chi_Minh', TRUE, FALSE, FALSE, 'dark', 1.25, FALSE);
-- chua insert dc 
select * from users;
INSERT INTO lesson_progress (user_id, lesson_id, status, completion_percentage, time_spent, last_position, completed_at, first_accessed) VALUES
(1, 1, 'completed', 100.00, 1800, 1800, '2024-01-15 10:30:00', '2024-01-15 09:00:00'),
(1, 2, 'completed', 100.00, 2400, 2400, '2024-01-15 14:30:00', '2024-01-15 13:00:00'),
(1, 3, 'completed', 100.00, 3600, 3600, '2024-01-16 10:30:00', '2024-01-16 09:00:00'),
(1, 4, 'in_progress', 65.00, 1950, 1950, NULL, '2024-01-16 14:00:00'),
(2, 7, 'completed', 100.00, 1500, 1500, '2024-01-20 11:00:00', '2024-01-20 10:00:00'),
(2, 8, 'completed', 100.00, 2100, 2100, '2024-01-20 16:00:00', '2024-01-20 14:30:00'),
(2, 9, 'in_progress', 45.00, 1350, 1350, NULL, '2024-01-21 09:00:00'),
(3, 1, 'completed', 100.00, 1650, 1650, '2024-01-18 15:00:00', '2024-01-18 14:00:00'),
(3, 2, 'completed', 100.00, 2250, 2250, '2024-01-18 20:00:00', '2024-01-18 17:30:00'),
(3, 7, 'completed', 100.00, 1400, 1400, '2024-01-25 10:30:00', '2024-01-25 09:30:00'),
(4, 1, 'completed', 100.00, 1750, 1750, '2024-01-22 11:30:00', '2024-01-22 10:00:00'),
(4, 2, 'in_progress', 80.00, 1920, 1920, NULL, '2024-01-22 15:00:00');
INSERT INTO quizzes (lesson_id, title, description, time_limit, max_attempts, passing_score, show_correct_answers, randomize_questions) VALUES
(2, 'Kiểm tra JSX Fundamentals', 'Bài kiểm tra về kiến thức cơ bản JSX', 15, 3, 70.00, TRUE, TRUE),
(4, 'Quiz: Components và Props', 'Đánh giá hiểu biết về Components và Props', 20, 2, 75.00, TRUE, FALSE),
(8, 'Python Variables Quiz', 'Kiểm tra kiến thức về biến trong Python', 10, 3, 70.00, TRUE, TRUE),
(9, 'Functions và Modules Test', 'Bài test về Functions và Modules', 25, 2, 80.00, TRUE, FALSE);
INSERT INTO questions (quiz_id, question_text, question_type, points, explanation, sort_order) VALUES
(1, 'JSX là viết tắt của gì?', 'multiple_choice', 2.00, 'JSX = JavaScript XML', 1),
(1, 'JSX có thể được sử dụng trực tiếp trong trình duyệt mà không cần biên dịch', 'true_false', 1.00, 'JSX cần được biên dịch thành JavaScript thuần túy', 2),
(1, 'Trong JSX, thuộc tính class được viết là ______', 'fill_blank', 1.50, 'Sử dụng className thay vì class', 3),
(2, 'Props trong React là gì?', 'multiple_choice', 2.50, 'Props là cách truyền dữ liệu từ component cha sang component con', 1),
(2, 'Mô tả cách sử dụng props trong functional component', 'essay', 5.00, 'Cần giải thích chi tiết cách destructuring props', 2),
(3, 'Python có cần khai báo kiểu dữ liệu cho biến không?', 'true_false', 1.00, 'Python là dynamic typing', 1),
(3, 'Biến nào sau đây hợp lệ trong Python?', 'multiple_choice', 2.00, 'Biến Python không được bắt đầu bằng số', 2),
(4, 'Từ khóa nào được sử dụng để định nghĩa function trong Python?', 'multiple_choice', 1.50, 'Sử dụng từ khóa def', 1);
INSERT INTO question_options (question_id, option_text, is_correct, sort_order) VALUES
(1, 'JavaScript XML', TRUE, 1),
(1, 'Java Syntax Extension', FALSE, 2),
(1, 'JavaScript eXtension', FALSE, 3),
(1, 'JSON XML', FALSE, 4),
(2, 'True', FALSE, 1),
(2, 'False', TRUE, 2),
(4, 'Thuộc tính CSS của component', FALSE, 1),
(4, 'Cách truyền dữ liệu từ component cha sang con', TRUE, 2),
(4, 'State của component', FALSE, 3),
(4, 'Event handler', FALSE, 4),
(6, 'True', FALSE, 1),
(6, 'False', TRUE, 2),
(7, '2variable', FALSE, 1),
(7, 'my_variable', TRUE, 2),
(7, 'my-variable', FALSE, 3),
(7, 'class', FALSE, 4),
(8, 'function', FALSE, 1),
(8, 'def', TRUE, 2),
(8, 'fun', FALSE, 3),
(8, 'define', FALSE, 4);
INSERT INTO quiz_attempts (user_id, quiz_id, attempt_number, start_time, end_time, score, total_points, status, answers, time_taken, passed) VALUES
(1, 1, 1, '2024-01-15 11:00:00', '2024-01-15 11:12:00', 4.50, 4.50, 'completed', '{"1": "JavaScript XML", "2": "False", "3": "className"}', 720, TRUE),
(1, 2, 1, '2024-01-16 15:00:00', '2024-01-16 15:18:00', 6.25, 7.50, 'completed', '{"4": "Cách truyền dữ liệu từ component cha sang con", "5": "Props được truyền như tham số..."}', 1080, TRUE),
(2, 3, 1, '2024-01-20 17:00:00', '2024-01-20 17:08:00', 3.00, 3.00, 'completed', '{"6": "False", "7": "my_variable"}', 480, TRUE),
(3, 1, 1, '2024-01-18 16:00:00', '2024-01-18 16:10:00', 3.50, 4.50, 'completed', '{"1": "JavaScript XML", "2": "False", "3": "class"}', 600, FALSE),
(3, 1, 2, '2024-01-18 18:00:00', '2024-01-18 18:09:00', 4.50, 4.50, 'completed', '{"1": "JavaScript XML", "2": "False", "3": "className"}', 540, TRUE);
-- da them
INSERT INTO assignments (lesson_id, title, description, instructions, max_points, due_date, submission_type, allowed_extensions) VALUES
(50, 'Xây dựng Todo App với React', 'Tạo một ứng dụng Todo đơn giản sử dụng React hooks', 
'1. Sử dụng useState để quản lý danh sách todos\n2. Implement thêm, xóa, và đánh dấu hoàn thành\n3. Sử dụng CSS để styling cơ bản', 
100.00, '2024-02-01 23:59:59', 'multiple', 'zip,rar,js,jsx,html,css'),
(51, 'Component Library Documentation', 'Viết documentation cho component library', 
'Tạo tài liệu chi tiết cho ít nhất 5 components đã học, bao gồm props, examples và best practices', 
80.00, '2024-02-15 23:59:59', 'file', 'pdf,doc,docx,md'),
(52, 'Python Calculator Project', 'Xây dựng máy tính console với Python', 
'1. Implement 4 phép toán cơ bản\n2. Xử lý lỗi nhập liệu\n3. Có menu lựa chọn\n4. Code clean và có comment', 
90.00, '2024-02-10 23:59:59', 'file', 'py,zip'),
(53, 'Data Analysis với Pandas', 'Phân tích dataset về bán hàng', 
'Sử dụng pandas để phân tích file CSV được cung cấp, tạo các biểu đồ và rút ra insights', 
120.00, '2024-02-20 23:59:59', 'multiple', 'py,ipynb,pdf');
-- da them
INSERT INTO submissions (assignment_id, user_id, submission_text, file_url, submitted_at, status, grade, feedback, graded_by, graded_at) VALUES
(9, 1, 'Todo App implementation với React hooks. Đã implement đầy đủ các features yêu cầu.', 
'/uploads/assignments/user1_todo_app.zip', '2024-01-30 18:30:00', 'graded', 95.00, 
'Excellent work! Code rất clean và có sử dụng đúng React patterns. Chỉ cần improve CSS styling một chút.', 
5, '2024-02-01 10:00:00'),
(9, 3, 'React Todo App với basic styling', '/uploads/assignments/user3_react_todo.zip', 
'2024-01-31 22:15:00', 'graded', 85.00, 
'Good implementation. Cần cải thiện error handling và thêm PropTypes validation.', 
5, '2024-02-02 09:30:00'),
(9, 2, 'Python Calculator với menu selection và error handling', '/uploads/assignments/user2_calculator.py', 
'2024-02-09 16:45:00', 'graded', 92.00, 
'Very well structured code. Good use of functions and excellent error handling!', 
6, '2024-02-11 14:20:00'),
(9, 4, NULL, '/uploads/assignments/user4_component_docs.pdf', 
'2024-02-14 20:00:00', 'submitted', NULL, NULL, NULL, NULL);
-- da them
INSERT INTO discussions (course_id, lesson_id, user_id, title, content, discussion_type, views_count, replies_count, last_reply_at) VALUES
(1, 50, 1, 'Khó khăn khi học JSX', 
'Mình đang gặp khó khăn trong việc hiểu cú pháp JSX, đặc biệt là phần conditional rendering. Có ai có thể giải thích thêm không?', 
'question', 15, 3, '2024-01-16 10:30:00'),
(1, 50, 5, 'Thông báo: Cập nhật nội dung khóa học', 
'Chúng ta vừa cập nhật thêm 2 bài học về React Hooks. Các bạn có thể truy cập ngay bây giờ.', 
'announcement', 45, 1, '2024-01-17 14:00:00'),
(2, 50, 2, 'Best practices khi đặt tên biến Python', 
'Mọi người có thể chia sẻ kinh nghiệm về naming convention trong Python không? Mình thấy có nhiều cách khác nhau.', 
'general', 8, 2, '2024-01-21 16:45:00'),
(1, 50, 3, 'Props vs State: Khi nào dùng cái gì?', 
'Mình vẫn còn confuse về việc khi nào nên dùng props, khi nào nên dùng state. Có ai có thể cho ví dụ cụ thể không?', 
'question', 22, 4, '2024-01-19 11:20:00');
INSERT INTO discussion_replies (discussion_id, user_id, parent_reply_id, content, is_solution, likes_count) VALUES
(13, 5, NULL, 'JSX conditional rendering có thể dùng ternary operator hoặc && operator. Ví dụ: {isLoggedIn ? <UserProfile /> : <LoginForm />}', TRUE, 5),
(13, 6, NULL, 'Mình suggest bạn nên practice thêm với các ví dụ nhỏ trước khi làm project lớn.', FALSE, 2),
(13, 3, 1, 'Cảm ơn giải thích của thầy! Mình đã hiểu rõ hơn rồi.', FALSE, 1),
(14, 1, NULL, 'Cảm ơn thầy đã update thêm nội dung về Hooks!', FALSE, 3),
(14, 6, NULL, 'Python PEP 8 recommend sử dụng snake_case cho variables và functions. Ví dụ: user_name, calculate_total()', TRUE, 4),
(14, 3, 2, 'Ngoài ra nên tránh dùng reserved keywords làm tên biến.', FALSE, 2),
(14, 5, NULL, 'Props dùng để truyền data từ parent xuống child component. State dùng để manage data trong chính component đó.', FALSE, 6),
(14, 6, NULL, 'Rule đơn giản: Nếu data không thay đổi trong component → dùng props. Nếu data cần thay đổi → dùng state.', TRUE, 8),
(14, 1, 4, 'Ví dụ rất hay! Giờ mình hiểu rồi. Thanks thầy!', FALSE, 2),
(14, 4, NULL, 'Mình cũng đang thắc mắc điều này. Cảm ơn các thầy đã giải đáp!', FALSE, 1);
-- da them
INSERT INTO course_reviews (course_id, user_id, rating, review_text, status, helpful_count) VALUES
(1, 1, 5, 'Khóa học React rất tuyệt vời! Giảng viên giải thích rất dễ hiểu, từ cơ bản đến nâng cao. Assignments thực tế và hữu ích. Highly recommended!', 'approved', 12),
(1, 3, 4, 'Nội dung khá hay và cập nhật. Tuy nhiên mình mong muốn có thêm nhiều bài tập thực hành hơn. Overall vẫn là khóa học chất lượng.', 'approved', 8),
(1, 4, 5, 'Perfect course cho người mới bắt đầu với React. Thầy dạy rất tận tình và support học viên nhiệt tình.', 'approved', 15),
(2, 2, 5, 'Python for Beginners đúng như tên gọi - rất phù hợp cho người mới. Explain từng concept rất kỹ, có nhiều examples thực tế.', 'approved', 7),
(2, 3, 4, 'Khóa học Python cơ bản tốt. Content được organize khá logic. Chỉ mong có thêm advanced topics.', 'approved', 5);
-- da them
INSERT INTO certificates (user_id, course_id, certificate_code, issued_date, certificate_url, verification_url, status) VALUES
(1, 1, 'CERT-REACT-001-2024', '2024-01-17 10:00:00', '/certificates/cert_react_user1.pdf', '/verify/CERT-REACT-001-2024', 'active'),
(2, 2, 'CERT-PYTHON-001-2024', '2024-01-22 15:30:00', '/certificates/cert_python_user2.pdf', '/verify/CERT-PYTHON-001-2024', 'active'),
(3, 1, 'CERT-REACT-002-2024', '2024-01-20 14:15:00', '/certificates/cert_react_user3.pdf', '/verify/CERT-REACT-002-2024', 'active');
-- da them
INSERT INTO payments (user_id, course_id, amount, currency, payment_method, transaction_id, status, completed_at) VALUES
(1, 1, 1500000.00, 'VND', 'momo', 'MOMO_TXN_001_2024', 'completed', '2024-01-10 14:30:00'),
(2, 2, 0.00, 'VND', 'credit_card', NULL, 'completed', '2024-01-15 09:00:00'), -- Free course
(3, 1, 1500000.00, 'VND', 'bank_transfer', 'BANK_TXN_002_2024', 'completed', '2024-01-12 10:15:00'),
(3, 2, 0.00, 'VND', 'paypal', NULL, 'completed', '2024-01-20 08:30:00'), -- Free course
(4, 1, 1500000.00, 'VND', 'zalopay', 'ZALO_TXN_003_2024', 'completed', '2024-01-18 16:45:00'),
(6, 1, 699000.00, 'VND', 'momo', 'MOMO_20250118_001', 'completed', '{"transaction_id": "MOMO_20250118_001", "status": "success"}', '2025-01-18 10:05:00'),
(6, 5, 599000.00, 'VND', 'zalopay', 'ZALO_20250119_002', 'completed', '{"transaction_id": "ZALO_20250119_002", "status": "success"}', '2025-01-19 14:35:00'),
(7, 1, 699000.00, 'VND', 'credit_card', 'CC_20250117_003', 'completed', '{"transaction_id": "CC_20250117_003", "status": "success"}', '2025-01-17 09:20:00'),
(7, 2, 999000.00, 'VND', 'bank_transfer', 'BANK_20250120_004', 'completed', '{"transaction_id": "BANK_20250120_004", "status": "success"}', '2025-01-20 11:10:00');
select * from payments;
INSERT INTO notifications (user_id, title, message, notification_type, related_id, is_read, read_at) VALUES
(1, 'Chào mừng bạn đến với khóa học React!', 'Cảm ơn bạn đã đăng ký khóa học. Hãy bắt đầu với bài học đầu tiên!', 'course_update', 1, TRUE, '2024-01-10 15:00:00'),
(1, 'Bài tập mới được giao', 'Bạn có bài tập mới: "Xây dựng Todo App với React". Hạn nộp: 01/02/2024', 'assignment_due', 1, TRUE, '2024-01-15 12:00:00'),
(1, 'Điểm bài tập đã được chấm', 'Bài tập "Todo App" của bạn được 95/100 điểm. Xem feedback từ giảng viên.', 'grade_posted', 1, TRUE, '2024-02-01 10:30:00'),
(2, 'Chào mừng đến với Python for Beginners', 'Chúc mừng bạn đã tham gia khóa học Python miễn phí!', 'course_update', 2, TRUE, '2024-01-15 09:30:00'),
(2, 'Có phản hồi mới trong discussion', 'Câu hỏi của bạn về "naming convention" đã có người trả lời.', 'discussion_reply', 3, FALSE, NULL),
(3, 'Chứng chỉ React đã sẵn sàng', 'Chúc mừng! Chứng chỉ hoàn thành khóa học React đã được tạo.', 'system', 1, TRUE, '2024-01-20 14:30:00'),
(3, 'Bài tập Python sắp hết hạn', 'Bài tập "Python Calculator" sẽ hết hạn trong 2 ngày nữa.', 'assignment_due', 3, FALSE, NULL),
(4, 'Welcome to React Fundamentals', 'Bắt đầu hành trình học React của bạn ngay hôm nay!', 'course_update', 1, FALSE, NULL),
(4, 'Bài tập đã được nộp thành công', 'Component Library Documentation của bạn đã được nộp và đang chờ chấm.', 'system', 2, TRUE, '2024-02-14 20:05:00');
-- da them
select * from categories;
INSERT INTO categories (name, description, parent_id, slug, icon_url, sort_order, is_active) VALUES
('Lập trình', 'Các khóa học về lập trình và phát triển phần mềm', NULL, 'lap-trinh', 'https://example.com/icons/programming.svg', 1, TRUE),
('Thiết kế', 'Khóa học về UI/UX Design, Graphic Design', NULL, 'thiet-ke', 'https://example.com/icons/design.svg', 2, TRUE),
('Marketing', 'Digital Marketing, SEO, Social Media', NULL, 'marketing', 'https://example.com/icons/marketing.svg', 3, TRUE),
('Kinh doanh', 'Quản lý, Leadership, Entrepreneurship', NULL, 'kinh-doanh', 'https://example.com/icons/business.svg', 4, TRUE),
('Frontend Development', 'React, Vue, Angular, HTML, CSS, JavaScript', 1, 'frontend', 'https://example.com/icons/frontend.svg', 1, TRUE),
('Backend Development', 'Node.js, Python, Java, PHP, Databases', 1, 'backend', 'https://example.com/icons/backend.svg', 2, TRUE),
('Mobile Development', 'React Native, Flutter, iOS, Android', 1, 'mobile', 'https://example.com/icons/mobile.svg', 3, TRUE),
('Data Science', 'Python, R, Machine Learning, AI', 1, 'data-science', 'https://example.com/icons/data.svg', 4, TRUE),
('UI/UX Design', 'User Interface và User Experience Design', 2, 'ui-ux', 'https://example.com/icons/uiux.svg', 1, TRUE),
('Graphic Design', 'Photoshop, Illustrator, Design Theory', 2, 'graphic-design', 'https://example.com/icons/graphic.svg', 2, TRUE);
-- da them
INSERT INTO courses (title, slug, short_description, full_description, instructor_id, category_id, thumbnail_url, trailer_url, level, language, price, discount_price, duration_hours, max_students, prerequisites, what_you_learn, status, featured, rating_avg, rating_count, student_count, published_at) VALUES
('Node.js Backend Development', 'nodejs-backend', 'Học xây dựng API và backend với Node.js', 'Khóa học toàn diện về Node.js, Express.js, MongoDB. Học cách xây dựng RESTful API, authentication, authorization và deploy lên cloud.', 2, 6, 'https://example.com/thumbnails/nodejs.jpg', 'https://example.com/trailers/nodejs.mp4', 'intermediate', 'vi', 1800000.00, 1500000.00, 40, 100, 'Kiến thức JavaScript cơ bản', 'Xây dựng RESTful API|Authentication & Authorization|Database Design|Cloud Deployment', 'published', TRUE, 4.7, 28, 45, '2024-01-05 10:00:00'),
('UI/UX Design Fundamentals', 'uiux-design', 'Thiết kế giao diện và trải nghiệm người dùng', 'Học các nguyên lý thiết kế UI/UX, sử dụng Figma, tạo wireframes, prototypes và user research.', 3, 9, 'https://example.com/thumbnails/uiux.jpg', 'https://example.com/trailers/uiux.mp4', 'beginner', 'vi', 1200000.00, 900000.00, 30, 150, 'Không yêu cầu kiến thức trước', 'Design Thinking|Figma Mastery|User Research|Prototyping', 'published', TRUE, 4.8, 35, 62, '2024-01-08 14:00:00'),
('Digital Marketing Strategy', 'digital-marketing', 'Chiến lược Marketing số toàn diện', 'Học SEO, SEM, Social Media Marketing, Content Marketing, Email Marketing và Analytics.', 5, 3, 'https://example.com/thumbnails/marketing.jpg', 'https://example.com/trailers/marketing.mp4', 'intermediate', 'vi', 1000000.00, 800000.00, 25, 200, 'Hiểu biết cơ bản về marketing', 'SEO & SEM|Social Media Strategy|Content Marketing|Analytics & ROI', 'published', FALSE, 4.5, 18, 34, '2024-01-10 09:00:00'),
('Flutter Mobile Development', 'flutter-mobile', 'Phát triển ứng dụng di động với Flutter', 'Học Dart, Flutter framework, state management, navigation và publish app lên store.', 4, 7, 'https://example.com/thumbnails/flutter.jpg', 'https://example.com/trailers/flutter.mp4', 'intermediate', 'vi', 2000000.00, 1700000.00, 50, 80, 'Kinh nghiệm lập trình OOP', 'Dart Programming|Flutter Widgets|State Management|App Store Publishing', 'published', FALSE, 4.6, 22, 28, '2024-01-12 11:00:00'),
('Advanced Python Programming', 'python-advanced', 'Python nâng cao và ứng dụng thực tế', 'OOP, decorators, generators, async programming, testing, web scraping và automation.', 4, 6, 'https://example.com/thumbnails/python-advanced.jpg', 'https://example.com/trailers/python-advanced.mp4', 'advanced', 'vi', 1600000.00, NULL, 35, 60, 'Python cơ bản', 'Advanced OOP|Async Programming|Web Scraping|Testing & TDD', 'published', FALSE, 4.4, 15, 19, '2024-01-15 16:00:00'),
('Photoshop for Beginners', 'photoshop-beginner', 'Học Photoshop từ cơ bản đến nâng cao', 'Khóa học Photoshop cho người mới bắt đầu, từ interface đến các kỹ thuật chỉnh sửa ảnh chuyên nghiệp.', 3, 10, 'https://example.com/thumbnails/photoshop.jpg', 'https://example.com/trailers/photoshop.mp4', 'beginner', 'vi', 800000.00, 600000.00, 20, 100, 'Không yêu cầu', 'Photoshop Interface|Photo Retouching|Digital Art|Layer Masking', 'draft', FALSE, 0.00, 0, 0, NULL);
-- da them
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(3, 'Giới thiệu Node.js', 'Tổng quan về Node.js và môi trường phát triển', 1, TRUE),
(3, 'Express.js Framework', 'Xây dựng web server với Express.js', 2, TRUE),
(3, 'Database và MongoDB', 'Kết nối và thao tác với MongoDB', 3, TRUE),
(3, 'Authentication & Security', 'Bảo mật và xác thực người dùng', 4, TRUE),
(3, 'Testing và Deployment', 'Test code và deploy lên production', 5, TRUE),
(4, 'Design Thinking', 'Tư duy thiết kế và quy trình UX', 1, TRUE),
(4, 'User Research', 'Nghiên cứu người dùng và phân tích', 2, TRUE),
(4, 'Wireframing & Prototyping', 'Tạo wireframes và prototypes', 3, TRUE),
(4, 'Visual Design', 'Thiết kế giao diện trực quan', 4, TRUE),
(4, 'Figma Mastery', 'Thành thạo công cụ Figma', 5, TRUE),
(5, 'Marketing Fundamentals', 'Kiến thức nền tảng về marketing', 1, TRUE),
(5, 'SEO & Content Strategy', 'Tối ưu hóa công cụ tìm kiếm', 2, TRUE),
(5, 'Social Media Marketing', 'Marketing trên mạng xã hội', 3, TRUE),
(5, 'Paid Advertising', 'Quảng cáo trả phí Google, Facebook', 4, TRUE),
(5, 'Analytics & Measurement', 'Đo lường hiệu quả marketing', 5, TRUE);
-- da them
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(1, 'Giới thiệu HTML', 'Cấu trúc trang web và các thẻ HTML cơ bản', 1, TRUE),
(1, 'Styling với CSS', 'Định dạng và trang trí trang web với CSS', 2, TRUE),
(1, 'CSS Layout', 'Flexbox và Grid Layout', 3, TRUE),
(1, 'Responsive Design', 'Thiết kế web thích ứng mọi thiết bị', 4, TRUE),
(1, 'Projects & Practice', 'Dự án thực hành và bài tập', 5, TRUE);
-- da them
-- Course ID 1: HTML & CSS Cơ bản
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(1, 'Giới thiệu HTML', 'Cấu trúc trang web và các thẻ HTML cơ bản', 1, TRUE),
(1, 'Styling với CSS', 'Định dạng và trang trí trang web với CSS', 2, TRUE),
(1, 'CSS Layout', 'Flexbox và Grid Layout', 3, TRUE),
(1, 'Responsive Design', 'Thiết kế web thích ứng mọi thiết bị', 4, TRUE),
(1, 'Projects & Practice', 'Dự án thực hành và bài tập', 5, TRUE);
-- da them
-- Course ID 2: JavaScript Fundamentals
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(2, 'JavaScript Basics', 'Cú pháp và kiến thức nền tảng JavaScript', 1, TRUE),
(2, 'DOM Manipulation', 'Thao tác với Document Object Model', 2, TRUE),
(2, 'Events & Functions', 'Xử lý sự kiện và functions', 3, TRUE),
(2, 'Async Programming', 'Promise, async/await và AJAX', 4, TRUE),
(2, 'Modern JavaScript', 'ES6+ và các tính năng mới', 5, TRUE);
-- da them
-- Course ID 6: React Development
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(6, 'React Fundamentals', 'Components, JSX và Props', 1, TRUE),
(6, 'State Management', 'useState, useEffect và Context', 2, TRUE),
(6, 'Router & Navigation', 'React Router và điều hướng', 3, TRUE),
(6, 'Advanced Hooks', 'Custom hooks và performance', 4, TRUE),
(6, 'Testing & Deployment', 'Test React apps và deployment', 5, TRUE);

-- Course ID 7: Vue.js Complete
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(7, 'Vue.js Basics', 'Vue instance, templates và directives', 1, TRUE),
(7, 'Components & Props', 'Component communication và props', 2, TRUE),
(7, 'Vuex State Management', 'Quản lý state với Vuex', 3, TRUE),
(7, 'Vue Router', 'Single Page Application với Vue Router', 4, TRUE),
(7, 'Build & Deploy', 'Optimization và deployment', 5, TRUE);

-- Course ID 8: Python Programming
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(8, 'Python Basics', 'Cú pháp và kiểu dữ liệu Python', 1, TRUE),
(8, 'Data Structures', 'Lists, dictionaries và functions', 2, TRUE),
(8, 'Object-Oriented Programming', 'Classes và inheritance trong Python', 3, TRUE),
(8, 'Libraries & Modules', 'Pandas, NumPy và popular libraries', 4, TRUE),
(8, 'Projects & Applications', 'Dự án thực tế với Python', 5, TRUE);

-- Course ID 9: Data Science with Python
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(9, 'Data Science Introduction', 'Tổng quan về Data Science và tools', 1, TRUE),
(9, 'Data Analysis', 'Pandas và data manipulation', 2, TRUE),
(9, 'Data Visualization', 'Matplotlib, Seaborn và Plotly', 3, TRUE),
(9, 'Machine Learning Basics', 'Scikit-learn và ML algorithms', 4, TRUE),
(9, 'Real-world Projects', 'Dự án phân tích dữ liệu thực tế', 5, TRUE);

-- Course ID 10: Mobile App Development
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(10, 'Mobile Development Overview', 'Native vs Cross-platform development', 1, TRUE),
(10, 'React Native Basics', 'Components và navigation', 2, TRUE),
(10, 'State & Data Management', 'Redux và API integration', 3, TRUE),
(10, 'Native Features', 'Camera, GPS và device features', 4, TRUE),
(10, 'Publishing Apps', 'App Store và Google Play deployment', 5, TRUE);
INSERT INTO lessons (section_id, title, slug, content, lesson_type, video_url, video_duration, attachments, is_preview, sort_order, is_active) VALUES
(6, 'Node.js là gì?', 'nodejs-introduction', 'Node.js là runtime environment cho JavaScript...', 'video', 'https://example.com/videos/nodejs-intro.mp4', 900, '[{"name": "slides.pdf", "url": "/attachments/nodejs-intro-slides.pdf", "type": "pdf", "size": 2048000}]', TRUE, 1, TRUE),
(6, 'Cài đặt môi trường', 'setup-environment', 'Hướng dẫn cài đặt Node.js, npm, IDE...', 'video', 'https://example.com/videos/nodejs-setup.mp4', 1200, '[]', FALSE, 2, TRUE),
(6, 'NPM và Package Management', 'npm-packages', 'Quản lý packages với NPM...', 'video', 'https://example.com/videos/npm.mp4', 1500, '[{"name": "package-list.txt", "url": "/attachments/npm-packages.txt", "type": "txt", "size": 1024}]', FALSE, 3, TRUE),
(7, 'Tạo Express Server', 'express-server', 'Xây dựng web server đầu tiên với Express...', 'video', 'https://example.com/videos/express-server.mp4', 1800, '[]', FALSE, 1, TRUE),
(7, 'Routing và Middleware', 'routing-middleware', 'Định tuyến và xử lý middleware...', 'video', 'https://example.com/videos/express-routing.mp4', 2100, '[]', FALSE, 2, TRUE),
(7, 'RESTful API Design', 'restful-api', 'Thiết kế API theo chuẩn REST...', 'video', 'https://example.com/videos/restful-api.mp4', 2400, '[]', FALSE, 3, TRUE),
(11, 'Design Thinking Process', 'design-thinking-process', 'Quy trình 5 bước của Design Thinking...', 'video', 'https://example.com/videos/design-thinking.mp4', 1500, '[{"name": "design-thinking-worksheet.pdf", "url": "/attachments/design-thinking.pdf", "type": "pdf", "size": 3072000}]', TRUE, 1, TRUE),
(11, 'Empathy và Problem Definition', 'empathy-problem', 'Hiểu user và định nghĩa vấn đề...', 'video', 'https://example.com/videos/empathy.mp4', 1200, '[]', FALSE, 2, TRUE),
(12, 'User Interview Techniques', 'user-interview', 'Kỹ thuật phỏng vấn người dùng...', 'video', 'https://example.com/videos/user-interview.mp4', 1800, '[]', FALSE, 1, TRUE),
(12, 'Survey và Analytics', 'survey-analytics', 'Thu thập data qua survey và tools...', 'video', 'https://example.com/videos/survey.mp4', 1500, '[]', FALSE, 2, TRUE),
(16, 'Marketing Mix 4P', 'marketing-4p', 'Product, Price, Place, Promotion...', 'video', 'https://example.com/videos/4p.mp4', 1200, '[]', TRUE, 1, TRUE),
(16, 'Customer Journey Mapping', 'customer-journey', 'Lập bản đồ hành trình khách hàng...', 'video', 'https://example.com/videos/customer-journey.mp4', 1800, '[]', FALSE, 2, TRUE),
(17, 'Keyword Research', 'keyword-research', 'Nghiên cứu từ khóa cho SEO...', 'video', 'https://example.com/videos/keyword-research.mp4', 2100, '[{"name": "keyword-tools.pdf", "url": "/attachments/keyword-tools.pdf", "type": "pdf", "size": 1536000}]', FALSE, 1, TRUE),
(17, 'On-page SEO', 'onpage-seo', 'Tối ưu hóa SEO on-page...', 'video', 'https://example.com/videos/onpage-seo.mp4', 1900, '[]', FALSE, 2, TRUE);
INSERT INTO enrollments (user_id, course_id, enrollment_date, completion_date, progress_percentage, status, payment_status, payment_amount, certificate_issued, last_accessed) VALUES
(6, 3, '2024-01-16 10:00:00', NULL, 25.50, 'active', 'paid', 1500000.00, FALSE, '2024-01-20 14:30:00'),
(7, 3, '2024-01-18 14:00:00', NULL, 45.75, 'active', 'paid', 1500000.00, FALSE, '2024-01-21 16:45:00'),
(8, 3, '2024-01-20 09:30:00', NULL, 15.25, 'active', 'paid', 1500000.00, FALSE, '2024-01-21 10:15:00'),
(6, 4, '2024-01-17 11:00:00', NULL, 60.80, 'active', 'paid', 900000.00, FALSE, '2024-01-21 19:20:00'),
(7, 4, '2024-01-19 15:30:00', '2024-01-25 20:00:00', 100.00, 'completed', 'paid', 900000.00, TRUE, '2024-01-25 20:00:00'),
(9, 4, '2024-01-21 08:45:00', NULL, 35.40, 'active', 'paid', 900000.00, FALSE, '2024-01-22 12:30:00'),
(10, 4, '2024-01-22 13:15:00', NULL, 20.15, 'active', 'paid', 900000.00, FALSE, '2024-01-22 18:45:00'),
(8, 5, '2024-01-19 16:20:00', NULL, 75.60, 'active', 'paid', 800000.00, FALSE, '2024-01-22 11:10:00'),
(9, 5, '2024-01-21 10:00:00', NULL, 42.30, 'active', 'paid', 800000.00, FALSE, '2024-01-22 15:20:00'),
(10, 5, '2024-01-22 14:45:00', NULL, 18.90, 'active', 'paid', 800000.00, FALSE, '2024-01-22 20:30:00');
INSERT INTO lesson_progress (user_id, lesson_id, status, completion_percentage, time_spent, last_position, completed_at, first_accessed) VALUES
(6, 11, 'completed', 100.00, 900, 900, '2024-01-16 11:30:00', '2024-01-16 10:30:00'),
(6, 12, 'completed', 100.00, 1200, 1200, '2024-01-16 15:00:00', '2024-01-16 13:30:00'),
(6, 13, 'in_progress', 65.00, 975, 975, NULL, '2024-01-17 09:00:00'),
(7, 11, 'completed', 100.00, 850, 850, '2024-01-18 15:30:00', '2024-01-18 14:30:00'),
(7, 12, 'completed', 100.00, 1150, 1150, '2024-01-19 10:00:00', '2024-01-19 08:30:00'),
(7, 13, 'completed', 100.00, 1500, 1500, '2024-01-19 16:30:00', '2024-01-19 14:00:00'),
(7, 14, 'in_progress', 40.00, 720, 720, NULL, '2024-01-20 09:00:00'),
(6, 17, 'completed', 100.00, 1500, 1500, '2024-01-17 13:00:00', '2024-01-17 11:30:00'),
(6, 18, 'completed', 100.00, 1200, 1200, '2024-01-18 11:30:00', '2024-01-18 10:00:00'),
(6, 19, 'completed', 100.00, 1800, 1800, '2024-01-19 15:00:00', '2024-01-19 13:00:00'),
(6, 20, 'in_progress', 75.00, 1125, 1125, NULL, '2024-01-20 14:00:00'),
(7, 17, 'completed', 100.00, 1400, 1400, '2024-01-19 17:00:00', '2024-01-19 15:30:00'),
(7, 18, 'completed', 100.00, 1100, 1100, '2024-01-20 10:30:00', '2024-01-20 09:00:00'),
(7, 19, 'completed', 100.00, 1750, 1750, '2024-01-21 14:00:00', '2024-01-21 11:30:00'),
(7, 20, 'completed', 100.00, 1500, 1500, '2024-01-22 16:00:00', '2024-01-22 13:30:00'),
(8, 21, 'completed', 100.00, 1200, 1200, '2024-01-19 18:00:00', '2024-01-19 16:30:00'),
(8, 22, 'completed', 100.00, 1800, 1800, '2024-01-20 12:00:00', '2024-01-20 09:30:00'),
(8, 23, 'completed', 100.00, 2100, 2100, '2024-01-21 15:30:00', '2024-01-21 12:00:00'),
(8, 24, 'in_progress', 80.00, 1520, 1520, NULL, '2024-01-22 10:00:00');
INSERT INTO quizzes (lesson_id, title, description, time_limit, max_attempts, passing_score, show_correct_answers, randomize_questions) VALUES
(12, 'Node.js Environment Setup Quiz', 'Kiểm tra kiến thức về cài đặt môi trường Node.js', 10, 3, 70.00, TRUE, TRUE),
(14, 'Express.js Fundamentals Test', 'Đánh giá hiểu biết về Express.js cơ bản', 15, 2, 75.00, TRUE, FALSE),
(18, 'Design Thinking Assessment', 'Quiz về quy trình Design Thinking', 12, 3, 70.00, TRUE, TRUE),
(22, 'Marketing Strategy Quiz', 'Kiểm tra kiến thức về chiến lược marketing', 20, 2, 80.00, TRUE, FALSE);
INSERT INTO questions (quiz_id, question_text, question_type, points, explanation, sort_order) VALUES
(5, 'NPM là viết tắt của gì?', 'multiple_choice', 2.00, 'NPM = Node Package Manager', 1),
(5, 'Node.js được xây dựng trên V8 JavaScript Engine của Google', 'true_false', 1.00, 'Đúng, Node.js sử dụng V8 engine', 2),
(5, 'Lệnh để kiểm tra phiên bản Node.js là ______', 'fill_blank', 1.50, 'node --version hoặc node -v', 3),
(6, 'Express.js là gì?', 'multiple_choice', 2.50, 'Express.js là web framework cho Node.js', 1),
(6, 'Giải thích cách middleware hoạt động trong Express', 'essay', 5.00, 'Middleware là các hàm có quyền truy cập vào request, response và next function', 2),
(7, 'Design Thinking có bao nhiều giai đoạn chính?', 'multiple_choice', 2.00, '5 giai đoạn: Empathize, Define, Ideate, Prototype, Test', 1),
(7, 'Empathy là giai đoạn đầu tiên của Design Thinking', 'true_false', 1.00, 'Đúng, Empathy giúp hiểu người dùng', 2),
(8, 'Marketing Mix gồm những yếu tố nào?', 'multiple_choice', 2.50, '4P: Product, Price, Place, Promotion', 1);
INSERT INTO question_options (question_id, option_text, is_correct, sort_order) VALUES
(9, 'Node Package Manager', TRUE, 1),
(9, 'Node Program Manager', FALSE, 2),
(9, 'New Package Manager', FALSE, 3),
(9, 'Node Project Manager', FALSE, 4),
(10, 'True', TRUE, 1),
(10, 'False', FALSE, 2),
(12, 'Database cho Node.js', FALSE, 1),
(12, 'Web framework cho Node.js', TRUE, 2),
(12, 'Package manager', FALSE, 3),
(12, 'Testing framework', FALSE, 4),
(14, '3 giai đoạn', FALSE, 1),
(14, '4 giai đoạn', FALSE, 2),
(14, '5 giai đoạn', TRUE, 3),
(14, '6 giai đoạn', FALSE, 4),
(15, 'True', TRUE, 1),
(15, 'False', FALSE, 2),
(16, '3P: Product, Price, Place', FALSE, 1),
(16, '4P: Product, Price, Place, Promotion', TRUE, 2),
(16, '5P: Product, Price, Place, Promotion, People', FALSE, 3),
(16, '2P: Product, Price', FALSE, 4);
INSERT INTO quiz_attempts (user_id, quiz_id, attempt_number, start_time, end_time, score, total_points, status, answers, time_taken, passed) VALUES
(6, 5, 1, '2024-01-16 16:00:00', '2024-01-16 16:08:00', 4.50, 4.50, 'completed', '{"9": "Node Package Manager", "10": "True", "11": "node --version"}', 480, TRUE),
(7, 5, 1, '2024-01-19 11:00:00', '2024-01-19 11:07:00', 3.50, 4.50, 'completed', '{"9": "Node Package Manager", "10": "True", "11": "node -v"}', 420, FALSE),
(7, 5, 2, '2024-01-19 14:00:00', '2024-01-19 14:06:00', 4.50, 4.50, 'completed', '{"9": "Node Package Manager", "10": "True", "11": "node --version"}', 360, TRUE),
(6, 7, 1, '2024-01-18 12:00:00', '2024-01-18 12:10:00', 3.00, 3.00, 'completed', '{"14": "5 giai đoạn", "15": "True"}', 600, TRUE);
INSERT INTO assignments (lesson_id, title, description, instructions, max_points, due_date, submission_type, allowed_extensions) VALUES
(15, 'Xây dựng REST API với Express', 'Tạo một REST API đơn giản cho quản lý sản phẩm', 
'1. Tạo server Express.js\n2. Implement CRUD operations cho products\n3. Sử dụng middleware validation\n4. Error handling\n5. Documentation API', 
120.00, '2024-02-25 23:59:59', 'multiple', 'js,zip,md,json'),
(20, 'User Research Report', 'Thực hiện nghiên cứu người dùng cho một ứng dụng', 
'1. Chọn một ứng dụng để nghiên cứu\n2. Tạo user survey (tối thiểu 10 câu hỏi)\n3. Interview ít nhất 3 users\n4. Phân tích kết quả\n5. Đưa ra recommendations', 
100.00, '2024-02-28 23:59:59', 'file', 'pdf,doc,docx,ppt,pptx'),
(24, 'SEO Audit và Strategy', 'Phân tích SEO cho một website thật', 
'1. Chọn một website để audit\n2. Sử dụng tools (Google Analytics, Search Console, etc.)\n3. Phân tích keywords, backlinks, technical SEO\n4. Đề xuất strategy cải thiện\n5. Timeline implementation', 
110.00, '2024-03-05 23:59:59', 'multiple', 'pdf,xlsx,ppt,zip');
INSERT INTO submissions (assignment_id, user_id, submission_text, file_url, submitted_at, status, grade, feedback, graded_by, graded_at) VALUES
(5, 7, 'REST API implementation với Express.js và MongoDB. Đã implement đầy đủ CRUD operations, validation và error handling.', 
'/uploads/assignments/user7_express_api.zip', '2024-02-24 20:30:00', 'graded', 115.00, 
'Excellent work! API structure rất tốt, code clean và có proper error handling. Documentation chi tiết. Bonus points cho testing.', 
2, '2024-02-26 14:20:00'),
(6, 6, NULL, '/uploads/assignments/user6_user_research.pdf', 
'2024-02-27 18:45:00', 'graded', 95.00, 
'Good research methodology và insights. Survey questions well-designed. Cần improve phần analysis và recommendations.', 
3, '2024-03-01 10:15:00'),
(6, 9, NULL, '/uploads/assignments/user9_ux_research.pptx', 
'2024-02-28 21:30:00', 'submitted', NULL, NULL, NULL, NULL);
INSERT INTO categories (name, description, parent_id, slug, icon_url, sort_order, is_active) VALUES
('Công nghệ thông tin', 'Các khóa học về lập trình, phát triển phần mềm', NULL, 'cong-nghe-thong-tin', '/icons/it.svg', 1, TRUE),
('Thiết kế', 'Khóa học về thiết kế đồ họa, UI/UX', NULL, 'thiet-ke', '/icons/design.svg', 2, TRUE),
('Marketing', 'Digital Marketing, Social Media Marketing', NULL, 'marketing', '/icons/marketing.svg', 3, TRUE),
('Kinh doanh', 'Khóa học về quản lý, kinh doanh', NULL, 'kinh-doanh', '/icons/business.svg', 4, TRUE),
('Lập trình Web', 'HTML, CSS, JavaScript, PHP, React, Vue...', 1, 'lap-trinh-web', '/icons/web.svg', 1, TRUE),
('Lập trình Mobile', 'Android, iOS, React Native, Flutter', 1, 'lap-trinh-mobile', '/icons/mobile.svg', 2, TRUE),
('Machine Learning', 'AI, Deep Learning, Data Science', 1, 'machine-learning', '/icons/ai.svg', 3, TRUE),
('Cơ sở dữ liệu', 'MySQL, PostgreSQL, MongoDB', 1, 'co-so-du-lieu', '/icons/database.svg', 4, TRUE),
('UI/UX Design', 'Thiết kế giao diện người dùng', 2, 'ui-ux-design', '/icons/uiux.svg', 1, TRUE),
('Graphic Design', 'Thiết kế đồ họa', 2, 'graphic-design', '/icons/graphic.svg', 2, TRUE),
('Social Media', 'Facebook, Instagram, TikTok Marketing', 3, 'social-media', '/icons/social.svg', 1, TRUE),
('SEO', 'Search Engine Optimization', 3, 'seo', '/icons/seo.svg', 2, TRUE);
INSERT INTO courses (title, slug, short_description, full_description, instructor_id, category_id, thumbnail_url, trailer_url, level, language, price, discount_price, duration_hours, max_students, prerequisites, what_you_learn, status, featured, rating_avg, rating_count, student_count, published_at) VALUES
('Lập trình Web từ A-Z với HTML, CSS, JavaScript', 'lap-trinh-web-html-css-js', 'Khóa học toàn diện về lập trình web front-end', 'Khóa học này sẽ dạy bạn từ những kiến thức cơ bản nhất về HTML, CSS cho đến JavaScript nâng cao. Bạn sẽ xây dựng được những website đẹp và tương tác tốt.', 2, 5, '/thumbnails/web-course-1.jpg', '/videos/trailer-1.mp4', 'beginner', 'vi', 899000.00, 699000.00, 40, 100, 'Không yêu cầu kiến thức lập trình trước', 'HTML5 semantic, CSS3 advanced, JavaScript ES6+, DOM manipulation, Responsive design', 'published', TRUE, 4.5, 15, 45, '2025-01-15 10:00:00'),
('React.js và Redux cho người mới bắt đầu', 'reactjs-redux-beginner', 'Học React từ cơ bản đến nâng cao', 'Khóa học React.js đầy đủ với Redux, React Hooks, và các pattern hiện đại. Xây dựng Single Page Applications chuyên nghiệp.', 2, 5, '/thumbnails/react-course.jpg', '/videos/trailer-2.mp4', 'intermediate', 'vi', 1299000.00, 999000.00, 35, 80, 'Có kiến thức JavaScript cơ bản', 'React Components, JSX, State Management, Redux, React Router, API integration', 'published', TRUE, 4.7, 23, 67, '2025-01-10 14:00:00'),
('Machine Learning cơ bản với Python', 'machine-learning-python-basic', 'Nhập môn ML với Python và Scikit-learn', 'Khóa học Machine Learning từ cơ bản đến nâng cao sử dụng Python. Học các thuật toán ML phổ biến và ứng dụng thực tế.', 3, 7, '/thumbnails/ml-course.jpg', '/videos/trailer-3.mp4', 'intermediate', 'vi', 1599000.00, 1199000.00, 50, 60, 'Python cơ bản, Toán học cấp 3', 'Python for ML, Pandas, NumPy, Scikit-learn, Linear Regression, Classification, Clustering', 'published', FALSE, 4.8, 18, 34, '2025-01-12 09:00:00'),
('Deep Learning với TensorFlow', 'deep-learning-tensorflow', 'Xây dựng mô hình Deep Learning chuyên nghiệp', 'Khóa học về Deep Learning sử dụng TensorFlow và Keras. Học Neural Networks, CNN, RNN và các ứng dụng thực tế.', 3, 7, '/thumbnails/dl-course.jpg', '/videos/trailer-4.mp4', 'advanced', 'vi', 2199000.00, 1699000.00, 60, 40, 'Machine Learning cơ bản, Python', 'Neural Networks, CNN, RNN, LSTM, Computer Vision, NLP basics', 'published', TRUE, 4.9, 12, 28, '2025-01-08 16:00:00'),
('UI/UX Design với Figma', 'ui-ux-design-figma', 'Thiết kế giao diện chuyên nghiệp', 'Học thiết kế UI/UX từ cơ bản đến nâng cao với Figma. Từ wireframe đến prototype hoàn chỉnh.', 4, 9, '/thumbnails/uiux-course.jpg', '/videos/trailer-5.mp4', 'beginner', 'vi', 799000.00, 599000.00, 30, 120, 'Không yêu cầu kinh nghiệm trước', 'Design principles, User research, Wireframing, Prototyping, Figma advanced', 'published', TRUE, 4.6, 31, 89, '2025-01-14 11:00:00'),
('Digital Marketing toàn diện', 'digital-marketing-complete', 'Học Digital Marketing từ A-Z', 'Khóa học Digital Marketing đầy đủ bao gồm SEO, SEM, Social Media Marketing, Email Marketing và Analytics.', 5, 3, '/thumbnails/digital-marketing.jpg', '/videos/trailer-6.mp4', 'beginner', 'vi', 1099000.00, 799000.00, 45, 150, 'Không yêu cầu kinh nghiệm', 'SEO, Google Ads, Facebook Ads, Content Marketing, Email Marketing, Analytics', 'published', FALSE, 4.4, 27, 76, '2025-01-11 13:00:00'),
('Facebook Ads Mastery', 'facebook-ads-mastery', 'Chạy quảng cáo Facebook hiệu quả', 'Khóa học chuyên sâu về Facebook Ads, từ setup campaign đến optimization và scaling.', 5, 11, '/thumbnails/facebook-ads.jpg', '/videos/trailer-7.mp4', 'intermediate', 'vi', 899000.00, 699000.00, 25, 80, 'Kiến thức Marketing cơ bản', 'Facebook Ads Manager, Targeting, Creative optimization, Campaign scaling', 'published', TRUE, 4.3, 19, 43, '2025-01-13 15:00:00'),
('Node.js và Express.js Backend', 'nodejs-express-backend', 'Xây dựng API với Node.js', 'Khóa học về backend development với Node.js, Express.js, và MongoDB.', 2, 5, '/thumbnails/nodejs-course.jpg', NULL, 'intermediate', 'vi', 1299000.00, NULL, 38, 70, 'JavaScript cơ bản', 'Node.js, Express.js, MongoDB, REST API, Authentication, Deployment', 'draft', FALSE, 0.00, 0, 0, NULL);
-- da them
INSERT INTO user_preferences (user_id, language, timezone, email_notifications, push_notifications, marketing_emails, theme, playback_speed, auto_play_next) VALUES
(1, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'dark', 1.00, TRUE),
(2, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.25, TRUE),
(3, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, FALSE, 'light', 1.00, FALSE),
(4, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'system', 1.50, TRUE),
(5, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.00, TRUE),
(6, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'dark', 1.25, TRUE),
(7, 'vi', 'Asia/Ho_Chi_Minh', TRUE, FALSE, FALSE, 'light', 1.00, TRUE),
(8, 'vi', 'Asia/Ho_Chi_Minh', FALSE, TRUE, FALSE, 'system', 1.75, FALSE),
(9, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, TRUE, 'light', 1.00, TRUE),
(10, 'vi', 'Asia/Ho_Chi_Minh', TRUE, TRUE, FALSE, 'dark', 1.50, TRUE);
select * from courses;
-- da them
INSERT INTO sections (course_id, title, description, sort_order, is_active) VALUES
(1, 'Giới thiệu và chuẩn bị', 'Tổng quan về khóa học và cài đặt môi trường', 1, TRUE),
(1, 'HTML cơ bản', 'Học các thẻ HTML và cấu trúc trang web', 2, TRUE),
(1, 'CSS Styling', 'Trang trí và layout với CSS', 3, TRUE),
(1, 'CSS Advanced', 'Flexbox, Grid, Animation', 4, TRUE),
(1, 'JavaScript cơ bản', 'Biến, hàm, điều kiện, vòng lặp', 5, TRUE),
(1, 'DOM Manipulation', 'Tương tác với HTML bằng JavaScript', 6, TRUE),
(1, 'Dự án thực hành', 'Xây dựng website hoàn chỉnh', 7, TRUE),
(2, 'React Fundamentals', 'Component, JSX, Props, State', 1, TRUE),
(2, 'React Hooks', 'useState, useEffect, custom hooks', 2, TRUE),
(2, 'State Management', 'Context API và Redux', 3, TRUE),
(2, 'React Router', 'Navigation trong ứng dụng React', 4, TRUE),
(2, 'API Integration', 'Fetch data từ REST API', 5, TRUE),
(2, 'Final Project', 'Xây dựng ứng dụng Todo List', 6, TRUE),
(3, 'Python for ML', 'NumPy, Pandas, Matplotlib cơ bản', 1, TRUE),
(3, 'Supervised Learning', 'Linear Regression, Logistic Regression', 2, TRUE),
(3, 'Classification', 'Decision Tree, Random Forest, SVM', 3, TRUE),
(3, 'Unsupervised Learning', 'K-Means, Hierarchical Clustering', 4, TRUE),
(3, 'Model Evaluation', 'Cross-validation, Metrics', 5, TRUE),
(5, 'Design Principles', 'Nguyên lý thiết kế cơ bản', 1, TRUE),
(5, 'Figma Basics', 'Interface và các công cụ cơ bản', 2, TRUE),
(5, 'Wireframing', 'Tạo wireframe cho ứng dụng', 3, TRUE),
(5, 'UI Design', 'Thiết kế giao diện chi tiết', 4, TRUE),
(5, 'Prototyping', 'Tạo prototype tương tác', 5, TRUE);
-- da them
INSERT INTO lessons (section_id, title, slug, content, lesson_type, video_url, video_duration, attachments, is_preview, sort_order, is_active) VALUES
(17, 'Chào mừng đến với khóa học', 'chao-mung-khoa-hoc', '<p>Chào mừng các bạn đến với khóa học lập trình web từ A-Z. Trong bài này chúng ta sẽ tìm hiểu về roadmap học tập.</p>', 'video', '/videos/lesson-1-1.mp4', 480, '[{"name": "Roadmap.pdf", "url": "/attachments/roadmap.pdf", "type": "pdf", "size": 1024000}]', TRUE, 1, TRUE),
(17, 'Cài đặt VS Code và Extension', 'cai-dat-vscode', '<p>Hướng dẫn cài đặt Visual Studio Code và các extension hữu ích cho web development.</p>', 'video', '/videos/lesson-1-2.mp4', 720, '[{"name": "Extensions-list.txt", "url": "/attachments/extensions.txt", "type": "txt", "size": 2048}]', TRUE, 2, TRUE),
(17, 'Tạo project đầu tiên', 'tao-project-dau-tien', '<p>Tạo thư mục project và file HTML đầu tiên của bạn.</p>', 'video', '/videos/lesson-1-3.mp4', 600, NULL, FALSE, 3, TRUE),
(18, 'Cấu trúc HTML cơ bản', 'cau-truc-html-co-ban', '<p>Tìm hiểu về cấu trúc cơ bản của một trang HTML với DOCTYPE, html, head, body.</p>', 'video', '/videos/lesson-2-1.mp4', 900, NULL, FALSE, 1, TRUE),
(18, 'Các thẻ HTML phổ biến', 'cac-the-html-pho-bien', '<p>Học về các thẻ h1-h6, p, div, span, a, img, ul, ol, li...</p>', 'video', '/videos/lesson-2-2.mp4', 1200, '[{"name": "HTML-tags-reference.pdf", "url": "/attachments/html-tags.pdf", "type": "pdf", "size": 512000}]', FALSE, 2, TRUE),
(17, 'Forms và Input', 'forms-va-input', '<p>Tạo form với các loại input khác nhau: text, email, password, radio, checkbox...</p>', 'video', '/videos/lesson-2-3.mp4', 1080, NULL, FALSE, 3, TRUE),
(17, 'Bài tập HTML', 'bai-tap-html', '<p>Thực hành tạo trang HTML đơn giản với đầy đủ các elements đã học.</p>', 'assignment', NULL, 0, NULL, FALSE, 4, TRUE),
(17, 'CSS Selectors và Properties', 'css-selectors-properties', '<p>Học về các selector: element, class, id và các properties cơ bản.</p>', 'video', '/videos/lesson-3-1.mp4', 1080, NULL, FALSE, 1, TRUE),
(17, 'Box Model', 'css-box-model', '<p>Hiểu về margin, padding, border, content trong CSS box model.</p>', 'video', '/videos/lesson-3-2.mp4', 960, NULL, FALSE, 2, TRUE),
(17, 'Colors và Typography', 'colors-typography', '<p>Làm việc với màu sắc và typography trong CSS.</p>', 'video', '/videos/lesson-3-3.mp4', 720, NULL, FALSE, 3, TRUE),
(17, 'Quiz CSS cơ bản', 'quiz-css-co-ban', '', 'quiz', NULL, 0, NULL, FALSE, 4, TRUE),
(17, 'Giới thiệu React', 'gioi-thieu-react', '<p>React là gì và tại sao nên học React?</p>', 'video', '/videos/react-1-1.mp4', 600, NULL, TRUE, 1, TRUE),
(17, 'JSX Syntax', 'jsx-syntax', '<p>Tìm hiểu về JSX và cách viết component đầu tiên.</p>', 'video', '/videos/react-1-2.mp4', 900, NULL, FALSE, 2, TRUE),
(17, 'Components và Props', 'components-props', '<p>Tạo component và truyền dữ liệu qua props.</p>', 'video', '/videos/react-1-3.mp4', 1200, NULL, FALSE, 3, TRUE),
(17, 'Design Thinking', 'design-thinking', '<p>Phương pháp Design Thinking trong thiết kế sản phẩm.</p>', 'video', '/videos/uiux-1-1.mp4', 1500, NULL, TRUE, 1, TRUE),
(17, 'User Research', 'user-research', '<p>Nghiên cứu người dùng và tạo User Persona.</p>', 'video', '/videos/uiux-1-2.mp4', 1800, NULL, FALSE, 2, TRUE);
select * from sections;
-- da them
INSERT INTO enrollments (user_id, course_id, enrollment_date, completion_date, progress_percentage, status, payment_status, payment_amount, certificate_issued, last_accessed) VALUES
(6, 1, '2025-01-18 10:00:00', NULL, 35.50, 'active', 'paid', 699000.00, FALSE, '2025-01-20 09:30:00'),
(6, 5, '2025-01-19 14:30:00', NULL, 15.20, 'active', 'paid', 599000.00, FALSE, '2025-01-19 20:15:00'),
(7, 1, '2025-01-17 09:15:00', '2025-01-20 16:20:00', 100.00, 'completed', 'paid', 699000.00, TRUE, '2025-01-20 16:20:00'),
(7, 2, '2025-01-20 11:00:00', NULL, 8.33, 'active', 'paid', 999000.00, FALSE, '2025-01-20 11:45:00'),
(8, 5, '2025-01-16 16:20:00', NULL, 60.80, 'active', 'paid', 599000.00, FALSE, '2025-01-20 08:45:00'),
(8, 6, '2025-01-19 13:10:00', NULL, 22.10, 'active', 'paid', 799000.00, FALSE, '2025-01-19 21:30:00'),
(9, 3, '2025-01-15 11:30:00', NULL, 45.60, 'active', 'paid', 1199000.00, FALSE, '2025-01-20 10:20:00'),
(9, 4, '2025-01-18 15:45:00', NULL, 12.30, 'active', 'paid', 1699000.00, FALSE, '2025-01-19 18:40:00'),
(10, 1, '2025-01-19 20:00:00', NULL, 5.15, 'active', 'paid', 699000.00, FALSE, '2025-01-20 07:30:00'),
(10, 6, '2025-01-20 08:30:00', NULL, 2.80, 'active', 'paid', 799000.00, FALSE, '2025-01-20 09:10:00');



