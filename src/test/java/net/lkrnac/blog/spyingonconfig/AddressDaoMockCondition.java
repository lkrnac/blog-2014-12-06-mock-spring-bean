package net.lkrnac.blog.spyingonconfig;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class AddressDaoMockCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String addressServiceSpyBeanName = AddressServiceSpy.class.getSimpleName();
		return !context.getBeanFactory().containsBean(addressServiceSpyBeanName);
	}
}
