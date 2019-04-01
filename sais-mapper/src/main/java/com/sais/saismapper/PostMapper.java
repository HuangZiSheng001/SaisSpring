package com.sais.saismapper;

import com.sais.saisentity.Post;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;

@Repository
public interface PostMapper {
    int selectParentUserId(int id);

    int getLastInsertId();

    int insertBlog(String account,String content, Timestamp addtime,int user_id,int pid,int post_type,int parent_user_id,String pictures);

    int commentBlog(int pid);

    int forwardBlog(int pid);

    ArrayList<Post> selectAllBlog();

    int praiseAdd(int post_id);

    ArrayList<Post> selectCommentInfo(int pid);

    ArrayList<Post> selectForwardInfo(int pid);

    int getTotalForwardNum(int pid);

    Post selectPostFromId(int id);

    ArrayList<Post> selectForward(int pid);

    int getTotalBlogAndForwardNum(int user_id);

    ArrayList<Post> selectBlogAndForward(int user_id);

    int getUserForwardNum(int pid);

    int getUserCommentNum(int pid);

    ArrayList<Post> selectUserBlog(int id);
}
