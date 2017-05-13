package com.test.product.user.dao;

import com.test.product.user.model.SystemUsersRecord;
import com.test.product.user.model.SystemUsersRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUsersRecordMapper {
    int countByExample(SystemUsersRecordExample example);

    int deleteByExample(SystemUsersRecordExample example);

    int deleteByPrimaryKey(Integer systemUsersId);

    int insert(SystemUsersRecord record);

    int insertSelective(SystemUsersRecord record);

    List<SystemUsersRecord> selectByExample(SystemUsersRecordExample example);

    SystemUsersRecord selectByPrimaryKey(Integer systemUsersId);

    int updateByExampleSelective(@Param("record") SystemUsersRecord record, @Param("example") SystemUsersRecordExample example);

    int updateByExample(@Param("record") SystemUsersRecord record, @Param("example") SystemUsersRecordExample example);

    int updateByPrimaryKeySelective(SystemUsersRecord record);

    int updateByPrimaryKey(SystemUsersRecord record);
}