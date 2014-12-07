package net.lkrnac.blog.spyingonconfig;

import static org.mockito.Mockito.mock;
import net.lkrnac.blog.spyingonconfig.annotation.BeanMock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@BeanMock
public class AddressDaoMock {
	@Bean
	@Primary
	public AddressDao registerAddressDaoMock() {
		return mock(AddressDao.class);
	}
}
