package sy.dao;

import org.apache.ibatis.annotations.Param;
import sy.model.Role_resource;

public interface Role_resourceMapper {
    int deleteByPrimaryKey(@Param("resourceid") Integer resourceid, @Param("roleid") Integer roleid);

    int insert(Role_resource record);

    int insertSelective(Role_resource record);
}