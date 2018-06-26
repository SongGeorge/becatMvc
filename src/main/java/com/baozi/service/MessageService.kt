package com.baozi.service

import com.baozi.po.SoMessage
import com.baozi.po.SOMessageLike
import com.baozi.vo.ResultMessage


/**
 * @author zhangwenjun
 * @version 1.0<br/>
 *
 */
open interface MessageService {

    fun deleteByPrimaryKey(id: Long?): Int

    fun insert(entity: SoMessage): Int

    fun insertSelective(entity: SoMessage): Int

    fun selectByPrimaryKey(id: Long): SoMessage?

    fun selectByMessageAndKey(entity: SoMessage): Long?


    fun updateByPrimaryKeySelective(entity: SoMessage): Int

    fun updateByPrimaryKeyWithBLOBs(entity: SoMessage): Int

    fun updateByPrimaryKey(entity: SoMessage): Int
    /**
     * 加载评论列表
     * @param resultMap
     * @param pageNo
     * @param pageSize
     * @return
     */
    fun findMessageList(resultMap: MutableMap<String, Any>, pageNo: Int?, pageSize: Int?): ResultMessage

    /**
     * 获取单条评论信息，根据ID，关联查询
     * @param id
     * @return
     */
    fun findMessageById(id: Long?): ResultMessage

    fun findHot(pkey: String,userId:Long?, page: Int?): List<ResultMessage>

    fun updateLike(entity: SOMessageLike, pkey: String): Map<String, Any>
    /**
     * 根据UserId 和 Authorid 查询
     * @param entity
     * @return
     */
    fun selectByIdAndAuthorId(entity: SoMessage): SoMessage?

    /**
     * 根据层级删除
     * @param pids
     * @return
     */
    fun deleteByPids(pids: String, pkey: String): Int
}