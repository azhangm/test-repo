package com.dajuancai.web_proj.dao.utiles;

import com.dajuancai.web_proj.pojo.User;

import java.sql.SQLException;

public interface UserLoginDao {
    User SelectUserNameAndPwd(String username , String pwd) throws SQLException;
}
