package com.study.online_learning_platform.api.discussions.entity;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.discussionReplies.entity.DiscussionRepliesEntity;
import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;

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
    @OneToMany(mappedBy = "discussion")
    List<DiscussionRepliesEntity> discussionRepliesEntities;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    LessonEntity lessonEntity;
    @ManyToOne
    @JoinColumn(name = "course_id")
    CourseEntity courseEntity;
}
