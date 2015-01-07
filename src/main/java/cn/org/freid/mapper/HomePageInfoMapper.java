package cn.org.freid.mapper;

import java.sql.Timestamp;
import java.util.List;

import cn.org.freid.domain.HomePageInfoDomain;

public interface HomePageInfoMapper {
	
	void save(HomePageInfoDomain homePageInfo);
	void update(HomePageInfoDomain homePageInfo);
	void delete(Timestamp timestamp);
	HomePageInfoDomain findById(Timestamp timestamp);
	HomePageInfoDomain findLatest();
	List<HomePageInfoDomain> findAll();
}
