package com.study.online_learning_platform.api.discussionReplies.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "discussion_replies")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscussionRepliesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer discussionRepliesId;

    @Column(name = "content")
    String content;

    @Column(name = "is_solution")
    Boolean isSolution;

    @Column(name = "likes_count")
    Integer likesCount;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "discussion_id", nullable = false)
    DiscussionsEntity discussion;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "parent_reply_id")
    DiscussionRepliesEntity parentReply;

    @OneToMany(mappedBy = "parentReply")
    List<DiscussionRepliesEntity> childReplies;
    

}
