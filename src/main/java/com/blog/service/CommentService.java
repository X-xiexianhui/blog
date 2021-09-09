package com.blog.service;

import com.blog.po.Comment;

import java.util.List;

/**
 * Created by XieXianhui on 2021/09/02.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
