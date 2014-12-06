package net.lkrnac.blog.spyingonconfig;

import org.springframework.stereotype.Repository;

@Repository
public class AddressDao {
	public String readAddress(String userName) {
		return "3 Dark Corner";
	}
}
