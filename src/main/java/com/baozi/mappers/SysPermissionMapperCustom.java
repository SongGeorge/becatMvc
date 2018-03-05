package com.baozi.mappers;

import com.baozi.po.SysPermission;

import java.util.List;


/**
 * 
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 * <p>Company: www.itcast.com</p> 
 * @author	张文君
 * @date	2015-3-23下午2:55:28
 * @version 1.0
 */
public interface SysPermissionMapperCustom {
	
	//根据用户id查询菜单
	public List<SysPermission> findMenuListByUserId(int userid)throws Exception;

	//根据用户id查询权限url
	public List<SysPermission> findPermissionListByUserId(int userid)throws Exception;

}
