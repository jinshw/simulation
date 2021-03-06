package com.site.mountain.dao.mysql;

import java.util.List;
import com.site.mountain.entity.SseCollectionUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SseCollectionUserDao {

    int delete(SseCollectionUser pojo);

    List<SseCollectionUser> findList(SseCollectionUser pojo);

    int insert(SseCollectionUser pojo);

    int insertSelective(List<SseCollectionUser> pojo);

    int updateOne(SseCollectionUser pojo);

}