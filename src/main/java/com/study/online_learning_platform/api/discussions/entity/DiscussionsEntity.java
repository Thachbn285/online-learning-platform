package com.study.online_learning_platform.api.discussions.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.discussionReplies.entity.DiscussionRepliesEntity;
import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "discussions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscussionsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer discussionId;

    @Column(name = "title")
    String title;

    @Column(name = "content")
    String content;

    @Column(name = "discussion_type")
    String discussionType;

    @Column(name = "is_pinned")
    Boolean isPinned;

    @Column(name = "is_locked")
    Boolean isLocked;

    @Column(name = "views_count")
    Integer viewsCount;

    @Column(name = "replies_count")
    Integer repliesCount;

    @Column(name = "last_reply_at")
    Date lastReplyAt;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CourseEntity course;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private LessonEntity lesson;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "discussion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiscussionRepliesEntity> replies;

}
