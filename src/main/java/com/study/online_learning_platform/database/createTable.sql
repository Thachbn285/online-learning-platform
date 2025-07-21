CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone VARCHAR(15),
    date_of_birth DATE,
    avatar_url VARCHAR(255),
    bio TEXT,
    role ENUM('student', 'instructor', 'admin') DEFAULT 'student',
    status ENUM('active', 'inactive', 'suspended') DEFAULT 'active',
    email_verified BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    last_login TIMESTAMP NULL
);

CREATE TABLE categories (
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    parent_id INT NULL,
    slug VARCHAR(100) UNIQUE NOT NULL,
    icon_url VARCHAR(255),
    sort_order INT DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (parent_id) REFERENCES categories(category_id)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    slug VARCHAR(200) UNIQUE NOT NULL,
    short_description TEXT,
    full_description LONGTEXT,
    instructor_id INT NOT NULL,
    category_id INT NOT NULL,
    thumbnail_url VARCHAR(255),
    trailer_url VARCHAR(255),
    level ENUM('beginner', 'intermediate', 'advanced') NOT NULL,
    language VARCHAR(10) DEFAULT 'vi',
    price DECIMAL(10,2) DEFAULT 0.00,
    discount_price DECIMAL(10,2) NULL,
    duration_hours INT DEFAULT 0,
    max_students INT DEFAULT 0,
    prerequisites TEXT,
    what_you_learn LONGTEXT,
    status ENUM('draft', 'published', 'archived') DEFAULT 'draft',
    featured BOOLEAN DEFAULT FALSE,
    rating_avg DECIMAL(3,2) DEFAULT 0.00,
    rating_count INT DEFAULT 0,
    student_count INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    published_at TIMESTAMP NULL,
    FOREIGN KEY (instructor_id) REFERENCES users(user_id),
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE sections (
    section_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    description TEXT,
    sort_order INT NOT NULL DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE
);

CREATE TABLE lessons (
    lesson_id INT PRIMARY KEY AUTO_INCREMENT,
    section_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    slug VARCHAR(200) NOT NULL,
    content LONGTEXT,
    lesson_type ENUM('video', 'text', 'quiz', 'assignment', 'live') NOT NULL,
    video_url VARCHAR(255),
    video_duration INT DEFAULT 0, -- seconds
    attachments JSON, -- [{name, url, type, size}]
    is_preview BOOLEAN DEFAULT FALSE,
    sort_order INT NOT NULL DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (section_id) REFERENCES sections(section_id) ON DELETE CASCADE
);

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    completion_date TIMESTAMP NULL,
    progress_percentage DECIMAL(5,2) DEFAULT 0.00,
    status ENUM('active', 'completed', 'dropped', 'refunded') DEFAULT 'active',
    payment_status ENUM('free', 'paid', 'pending', 'refunded') DEFAULT 'pending',
    payment_amount DECIMAL(10,2) DEFAULT 0.00,
    certificate_issued BOOLEAN DEFAULT FALSE,
    certificate_url VARCHAR(255),
    last_accessed TIMESTAMP NULL,
    UNIQUE KEY unique_enrollment (user_id, course_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

CREATE TABLE lesson_progress (
    progress_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    lesson_id INT NOT NULL,
    status ENUM('not_started', 'in_progress', 'completed') DEFAULT 'not_started',
    completion_percentage DECIMAL(5,2) DEFAULT 0.00,
    time_spent INT DEFAULT 0, -- seconds
    last_position INT DEFAULT 0, -- for video lessons
    completed_at TIMESTAMP NULL,
    first_accessed TIMESTAMP NULL,
    last_accessed TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    UNIQUE KEY unique_progress (user_id, lesson_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (lesson_id) REFERENCES lessons(lesson_id)
);

CREATE TABLE quizzes (
    quiz_id INT PRIMARY KEY AUTO_INCREMENT,
    lesson_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    description TEXT,
    time_limit INT DEFAULT 0, -- minutes, 0 = no limit
    max_attempts INT DEFAULT 1,
    passing_score DECIMAL(5,2) DEFAULT 70.00,
    show_correct_answers BOOLEAN DEFAULT TRUE,
    randomize_questions BOOLEAN DEFAULT FALSE,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (lesson_id) REFERENCES lessons(lesson_id) ON DELETE CASCADE
);
CREATE TABLE questions (
    question_id INT PRIMARY KEY AUTO_INCREMENT,
    quiz_id INT NOT NULL,
    question_text LONGTEXT NOT NULL,
    question_type ENUM('multiple_choice', 'true_false', 'fill_blank', 'essay') NOT NULL,
    points DECIMAL(5,2) DEFAULT 1.00,
    explanation TEXT,
    sort_order INT DEFAULT 0,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (quiz_id) REFERENCES quizzes(quiz_id) ON DELETE CASCADE
);

CREATE TABLE question_options (
    option_id INT PRIMARY KEY AUTO_INCREMENT,
    question_id INT NOT NULL,
    option_text TEXT NOT NULL,
    is_correct BOOLEAN DEFAULT FALSE,
    sort_order INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (question_id) REFERENCES questions(question_id) ON DELETE CASCADE
);

CREATE TABLE quiz_attempts (
    attempt_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    quiz_id INT NOT NULL,
    attempt_number INT NOT NULL,
    start_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    end_time TIMESTAMP NULL,
    score DECIMAL(5,2) DEFAULT 0.00,
    total_points DECIMAL(5,2) DEFAULT 0.00,
    status ENUM('in_progress', 'completed', 'abandoned') DEFAULT 'in_progress',
    answers JSON, 
    time_taken INT DEFAULT 0,
    passed BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (quiz_id) REFERENCES quizzes(quiz_id)
);


CREATE TABLE assignments (
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    lesson_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    description LONGTEXT,
    instructions LONGTEXT,
    max_points DECIMAL(5,2) DEFAULT 100.00,
    due_date TIMESTAMP NULL,
    submission_type ENUM('text', 'file', 'url', 'multiple') DEFAULT 'text',
    max_file_size INT DEFAULT 10485760, -- 10MB in bytes
    allowed_extensions VARCHAR(255) DEFAULT 'pdf,doc,docx,txt',
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (lesson_id) REFERENCES lessons(lesson_id) ON DELETE CASCADE
);

CREATE TABLE submissions (
    submission_id INT PRIMARY KEY AUTO_INCREMENT,
    assignment_id INT NOT NULL,
    user_id INT NOT NULL,
    submission_text LONGTEXT,
    file_url VARCHAR(255),
    url_submission VARCHAR(255),
    submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('submitted', 'graded', 'returned') DEFAULT 'submitted',
    grade DECIMAL(5,2) NULL,
    feedback LONGTEXT,
    graded_by INT NULL,
    graded_at TIMESTAMP NULL,
    UNIQUE KEY unique_submission (assignment_id, user_id),
    FOREIGN KEY (assignment_id) REFERENCES assignments(assignment_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (graded_by) REFERENCES users(user_id)
);

CREATE TABLE discussions (
    discussion_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    lesson_id INT NULL,
    user_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    content LONGTEXT NOT NULL,
    discussion_type ENUM('general', 'question', 'announcement') DEFAULT 'general',
    is_pinned BOOLEAN DEFAULT FALSE,
    is_locked BOOLEAN DEFAULT FALSE,
    views_count INT DEFAULT 0,
    replies_count INT DEFAULT 0,
    last_reply_at TIMESTAMP NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (lesson_id) REFERENCES lessons(lesson_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE discussion_replies (
    reply_id INT PRIMARY KEY AUTO_INCREMENT,
    discussion_id INT NOT NULL,
    user_id INT NOT NULL,
    parent_reply_id INT NULL,
    content LONGTEXT NOT NULL,
    is_solution BOOLEAN DEFAULT FALSE,
    likes_count INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (discussion_id) REFERENCES discussions(discussion_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (parent_reply_id) REFERENCES discussion_replies(reply_id)
);
CREATE TABLE course_reviews (
    review_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    user_id INT NOT NULL,
    rating INT NOT NULL CHECK (rating >= 1 AND rating <= 5),
    review_text LONGTEXT,
    is_anonymous BOOLEAN DEFAULT FALSE,
    status ENUM('pending', 'approved', 'rejected') DEFAULT 'pending',
    helpful_count INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    UNIQUE KEY unique_review (course_id, user_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
CREATE TABLE certificates (
    certificate_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    certificate_code VARCHAR(50) UNIQUE NOT NULL,
    issued_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    expiry_date TIMESTAMP NULL,
    certificate_url VARCHAR(255),
    verification_url VARCHAR(255),
    status ENUM('active', 'revoked') DEFAULT 'active',
    UNIQUE KEY unique_certificate (user_id, course_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
CREATE TABLE payments (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    currency VARCHAR(3) DEFAULT 'VND',
    payment_method ENUM('credit_card', 'paypal', 'bank_transfer', 'momo', 'zalopay') NOT NULL,
    transaction_id VARCHAR(100) UNIQUE,
    status ENUM('pending', 'completed', 'failed', 'refunded') DEFAULT 'pending',
    payment_gateway_response JSON,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    completed_at TIMESTAMP NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
CREATE TABLE notifications (
    notification_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    title VARCHAR(200) NOT NULL,
    message LONGTEXT NOT NULL,
    notification_type ENUM('course_update', 'assignment_due', 'grade_posted', 'discussion_reply', 'system') NOT NULL,
    related_id INT NULL, -- course_id, assignment_id, etc.
    is_read BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    read_at TIMESTAMP NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
CREATE TABLE user_preferences (
    preference_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL UNIQUE,
    language VARCHAR(10) DEFAULT 'vi',
    timezone VARCHAR(50) DEFAULT 'Asia/Ho_Chi_Minh',
    email_notifications BOOLEAN DEFAULT TRUE,
    push_notifications BOOLEAN DEFAULT TRUE,
    marketing_emails BOOLEAN DEFAULT FALSE,
    theme ENUM('light', 'dark', 'system') DEFAULT 'light',
    playback_speed DECIMAL(3,2) DEFAULT 1.00,
    auto_play_next BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
