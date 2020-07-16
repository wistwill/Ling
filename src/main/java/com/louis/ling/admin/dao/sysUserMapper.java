package com.louis.ling.admin.dao;

import com.louis.ling.admin.model.sysUser;
import com.louis.ling.admin.model.sysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface sysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int countByExample(sysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByExample(sysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insert(sysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insertSelective(sysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    List<sysUser> selectByExample(sysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    sysUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") sysUser record, @Param("example") sysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExample(@Param("record") sysUser record, @Param("example") sysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKeySelective(sysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKey(sysUser record);

    /**
     * 查询全部
     * @return
     */
    List<sysUser> selectAll();

    List<sysUser> findPage();

    List<sysUser> findPageByName(@Param(value="name") String name);

    sysUser findByName(@Param(value = "name") String name);
}