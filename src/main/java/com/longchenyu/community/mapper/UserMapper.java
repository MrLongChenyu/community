package com.longchenyu.community.mapper;

import com.longchenyu.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name ,account_id,token,gmt_creat,gmt_modified) values(#{name},#{account_id},#{token},#{gmt_creat},#{gmt_modified})")
    void insert(User user);
}
