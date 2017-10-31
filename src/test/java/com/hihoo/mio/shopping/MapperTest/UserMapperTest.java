package com.hihoo.mio.shopping.MapperTest;

import com.hihoo.mio.shopping.ShoppingApplicationTests;
import com.hihoo.mio.shopping.common.utils.IdGeneralUtils;
import com.hihoo.mio.shopping.modules.entity.User;
import com.hihoo.mio.shopping.modules.service.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest extends ShoppingApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindbyName() {
		userMapper.insert(IdGeneralUtils.uuid(),"楚子航", "23");
		User user = userMapper.findByName("楚子航");
		Assert.assertEquals("楚子航", user.getName());
	}
}
