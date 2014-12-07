package net.lkrnac.blog.spyingonconfig.fake;

import static org.mockito.Mockito.spy;
import net.lkrnac.blog.spyingonconfig.AddressService;
import net.lkrnac.blog.spyingonconfig.annotation.BeanMock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@BeanMock
public class AddressServiceSpy {
	@Bean
	@Primary
	public AddressService registerAddressServiceSpy(AddressService addressService) {
		return spy(addressService);
	}
}
