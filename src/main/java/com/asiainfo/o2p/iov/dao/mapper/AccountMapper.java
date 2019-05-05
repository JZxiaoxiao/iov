package com.asiainfo.o2p.iov.dao.mapper;

import com.asiainfo.o2p.iov.dao.dto.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    @Select("SELECT * FROM account WHERE itemID = #{itemID}")
    Account selectAccount(int itemID);

    @Insert("insert into account(itemID,age,name,status,createDate) values(#{itemID},#{age},#{name},#{status},#{createDate})")
    Integer saveAccount(Account account);

    @Delete("delete from account where itemID =#{itemID}")
    Integer deleteAccount(int itemID);

    @Update("update account set age=#{age},name=#{name},status=#{status},createDate=#{createDate} where itemID=#{itemID}")
    Integer updateAccount(Account account);
}
