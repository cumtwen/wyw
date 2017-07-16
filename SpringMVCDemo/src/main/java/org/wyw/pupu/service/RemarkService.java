package org.wyw.pupu.service;

import org.wyw.pupu.domain.Remark;

public interface RemarkService {
	void insRemark(int user_id,int good_id,int order_id,String remark,String logistics,String quality,String service);
	Remark remark(int good_id);
}
