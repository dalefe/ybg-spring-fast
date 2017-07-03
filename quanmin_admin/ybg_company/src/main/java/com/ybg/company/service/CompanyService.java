package com.ybg.company.service;
import java.util.List;
import com.ybg.base.jdbc.BaseMap;
import com.ybg.base.util.Page;
import com.ybg.company.domain.Company;
import com.ybg.company.qvo.CompanyQvo;
import com.ybg.component.org.inter.Organization;

public interface CompanyService {
	
	/** 创建 企业
	 * 
	 * @throws Exception **/
	Company create(Company org) throws Exception;
	
	/** 查询企业 
	 * @throws Exception **/
	List<Company> query(CompanyQvo qvo) throws Exception;
	
	/** 查询企业 
	 * @throws Exception **/
	Page query(Page page, CompanyQvo qvo) throws Exception;
	
	void remove(BaseMap<String, Object> condictionmap);
	
	void update(BaseMap<String, Object> updatemap, BaseMap<String, Object> wheremap);
	
	Organization get(String id);
}
