package cn.org.freid.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.org.freid.domain.HomePageInfoDomain;

@Repository
public interface HomePageInfoDao {

	void save(HomePageInfoDomain homePageInfo);
	void update(HomePageInfoDomain homePageInfo);
	void delete(Timestamp timestamp);
	HomePageInfoDomain findById(Timestamp timestamp);
	HomePageInfoDomain findLatest();
	List<HomePageInfoDomain> findAll();
	
}
