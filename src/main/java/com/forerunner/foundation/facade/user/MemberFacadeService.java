package com.forerunner.foundation.facade.user;

import com.forerunner.foundation.domain.po.user.Member;
import com.forerunner.foundation.facade.system.BaseFacadeService;

public interface MemberFacadeService extends BaseFacadeService<Member,Long>{
	/**
	 * @param account
	 * @return
	 */
	public Member getAccount(String account);
			
}
