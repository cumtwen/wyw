package org.wyw.pupu.service;

import java.util.List;
import org.wyw.pupu.domain.Collect;


public interface CollectService {

	List<Collect> collectgetAll(int user_id);
	Collect collectfind(int user_id,int good_id);
	void delcollect(int user_id,int good_id);
	void delAllcollect(int user_id);
	void insertcollect(int user_id,int good_id,String good_price);
}
