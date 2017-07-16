package org.wyw.pupu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.Good;
import org.wyw.pupu.domain.Remark;
import org.wyw.pupu.mapper.GoodMapper;
import org.wyw.pupu.service.GoodService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("GoodService")
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodMapper goodMapper;
	@Transactional(readOnly=true)
    @Override	
	public List<Good> typegetAll(String type) {
		// TODO Auto-generated method stub
		return goodMapper.typefindAll(type);
	}
	
	@Override
	public Good show(Integer id) {
		// TODO Auto-generated method stub
		return goodMapper.singlefindAll(id);
	}
	@Override
	public List<Good> nowgetAll(String now) {
		// TODO Auto-generated method stub
		return goodMapper.nowfindAll(now);
	}

	@Override
	public List<Good> type1getAll(String type1) {
		// TODO Auto-generated method stub
		return goodMapper.type1findAll(type1);
	}

	@Override
	public List<Remark> remarkgetAll(Integer id) {
		// TODO Auto-generated method stub
		return goodMapper.remarkfindAll(id);
	}

}
