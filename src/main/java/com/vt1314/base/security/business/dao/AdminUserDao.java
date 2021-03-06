package com.vt1314.base.security.business.dao;

import com.vt1314.base.security.domain.AdminUser;

import java.util.List;
import java.util.Map;

/**
 * Author: val.jzp
 */
public interface AdminUserDao {

	// ******************************************************************************
	// ********************************* CRUD START *********************************
	// ******************************************************************************

	/**
	 * 获取总记录数
	 */
	public Long totalRecord(Map<String, String> queryHash);

	/**
	 * 分页列表
	 */
	public List<AdminUser> findList(Integer pageNow, Integer pageSize, String sqlOrder, Map<String, String> queryHash);

	/**
	 * id获取记录
	 */
	public AdminUser findModel(Long adminUserId);

	/**
	 * 增加记录
	 */
	public Integer add(AdminUser model);

	/**
	 * 修改记录
	 */
	public Integer update(AdminUser model);

	/**
	 * 删除记录
	 */
	public Integer delete(Long adminUserId);

	// ******************************************************************************
	// ********************************** CRUD END **********************************
	// ******************************************************************************
}