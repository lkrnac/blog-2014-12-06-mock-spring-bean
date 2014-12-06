package net.lkrnac.blog.spyingonconfig;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// @ConditionalOnMissingBean(value = AddressServiceSpy.class)
@Conditional(AddressDaoMockCondition.class)
public class AddressDaoMock {
	@Bean
	@Primary
	public AddressDao registerAddressDaoMock() {
		return mock(AddressDao.class);
	}
}
