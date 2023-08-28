package com.ly.bbs.service;

import com.ly.bbs.pojo.Article;
import com.ly.bbs.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface UserService {

    List<User> getAll();

    User getById(@Param("uId") int uId); //只包含用户不包含 articles信息

    User getByUserName(@Param("uNumber") String userName);

    List<Article> getArticlesById(int uId); //部分查询减少io次数

    int insertUser(User user);

    int updateUser(User user);

    int changeState(int uId); //需结合ban使用

    User getUserAndArticlesByUid(int uId); //包含用户和 articles信息

    int unBan(int uId);

    User adminLogin(User user);//管理员登陆

}
