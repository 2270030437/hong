package com.example.hong.dao;

import com.example.hong.pojo.juan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface jxDao {
    @Insert("insert  into juan(wname,tem,money) values(#{wname},#{tem},#{money})")
    public int addDonate(@Param("wname") String wname, @Param("tem") String tem, @Param("money") String money);
   @Select("select * from juan")
    List<juan> getjxList();
   @Select("select * from admin where adminName=#{adminName} and adminPwd=#{adminPwd}")
    admin login(@Param("adminName") String adminName,@Param("adminPwd") String adminPwd);
}
