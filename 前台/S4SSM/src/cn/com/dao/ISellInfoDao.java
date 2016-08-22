package cn.com.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;
@Repository
public interface ISellInfoDao {
	/**
	 * ��ȡ����������Ϣ
	 * @return
	 */
public Map<Long, Sellinfo> getAllSellInfo();
/**
 * ���ݳ���Ż�ȡ�������
 * @return
 */
public Sellinfo getSellInfoById(Carinfo carInfo);
/**
 * �����������
 * @param sellInfo
 * @return
 */
public int addSellInfo(Sellinfo sellInfo);
/**
 * ɾ���������
 * @param sellInfo
 * @return
 */
public int deleteSellInfo(Sellinfo sellInfo);
public int updateSellInfo(Sellinfo sellInfo);

}
