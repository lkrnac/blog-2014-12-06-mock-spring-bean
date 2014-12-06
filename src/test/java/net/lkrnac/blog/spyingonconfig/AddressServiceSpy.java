package net.lkrnac.blog.spyingonconfig;

import static org.mockito.Mockito.spy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AddressServiceSpy {
	@Bean
	@Primary
	public AddressService registerAddressServiceSpy(AddressService addressService) {
		return spy(addressService);
	}
}
