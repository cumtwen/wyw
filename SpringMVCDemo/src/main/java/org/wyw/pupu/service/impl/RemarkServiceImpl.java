package org.wyw.pupu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.Remark;
import org.wyw.pupu.mapper.RemarkMapper;
import org.wyw.pupu.service.RemarkService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("remarkService")
public class RemarkServiceImpl implements RemarkService {
	@Autowired
	private RemarkMapper remarkMapper;
	@Override
	public void insRemark(int user_id, int good_id, int order_id, String remark, String logistics, String quality,
			String service) {
		// TODO Auto-generated method stub
		remarkMapper.insRemark(user_id, good_id, order_id, remark, logistics, quality, service);
	}

	@Override
	public Remark remark(int good_id) {
		// TODO Auto-generated method stub
		return remarkMapper.remark(good_id);
	}

}
