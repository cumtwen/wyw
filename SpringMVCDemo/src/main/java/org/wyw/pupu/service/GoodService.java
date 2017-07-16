package org.wyw.pupu.service;

import java.util.List;
import org.wyw.pupu.domain.Good;
import org.wyw.pupu.domain.Remark;

public interface GoodService {

	List<Good> typegetAll(String type);
	List<Good> type1getAll(String type1);
	Good show(Integer id);
	List<Good> nowgetAll(String now);
	List<Remark> remarkgetAll(Integer id);
}
