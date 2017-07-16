package org.wyw.pupu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.Collect;
import org.wyw.pupu.mapper.CollectMapper;
import org.wyw.pupu.service.CollectService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService {
	@Autowired
	private CollectMapper collectMapper;
	@Override
	public List<Collect> collectgetAll(int user_id) {
		// TODO Auto-generated method stub
		return collectMapper.collectfindAll(user_id);
	}

	@Override
	public void delcollect(int user_id, int good_id) {
		// TODO Auto-generated method stub
		collectMapper.delcollect(user_id, good_id);
	}

	@Override
	public void delAllcollect(int user_id) {
		// TODO Auto-generated method stub
		collectMapper.delAllcollect(user_id);
	}

	@Override
	public Collect collectfind(int user_id, int good_id) {
		// TODO Auto-generated method stub
		Collect collect=collectMapper.collectfind(user_id, good_id);
		return collect;
	}

	@Override
	public void insertcollect(int user_id, int good_id, String good_price) {
		// TODO Auto-generated method stub
		collectMapper.insertcollect(user_id, good_id, good_price);
	}





}
