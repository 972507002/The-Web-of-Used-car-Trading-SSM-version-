package cn.com.service;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;

@Repository
public interface ISystemConfigService {
	/**
	 * ��ȡ����SystemConfig��ϵ�ҵ��
	 * @return
	 */
	public Map<Long, Systemconfig> getAllSystemConfig();
	/**
	 * ͨ��u��ID��ȡSystemConfig
	 * @param systemConfig
	 * @return
	 */
	public Systemconfig getSystemConfigById(Carinfo carInfo);
	public boolean addSystemConfig(Systemconfig systemConfig);
	public boolean updateSystemConfig(Systemconfig systemConfig);
}
