package net.lkrnac.blog.testing.mockbean.fake;

import static org.mockito.Mockito.mock;
import net.lkrnac.blog.testing.mockbean.AddressDao;
import net.lkrnac.blog.testing.mockbean.annotation.BeanMock;

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
