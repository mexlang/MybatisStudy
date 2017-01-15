package com.echo.mybatis.persistence;

import java.util.List;

import com.echo.mybatis.model.Lock;

/**
 * 定义一个接口
 * @author tangsixiang
 *
 */
public interface LockMapper {
	
  public  Lock  getLock(int id)throws Exception;
  public  List<Lock> getLockAll()throws Exception;
}
