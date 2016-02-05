package com.shl.dropwizard.bundles;

import io.dropwizard.Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jboss.weld.environment.servlet.BeanManagerResourceBindingListener;
import org.jboss.weld.environment.servlet.Listener;

/**
 * User: yshuliga
 * Date: 08.01.2016 16:32
 */
public class WeldBundle implements Bundle {

	@Override
	public void initialize(final Bootstrap<?> bootstrap) {
		// empty
	}

	@Override
	public void run(final Environment environment) {
		environment.getApplicationContext().addEventListener(new BeanManagerResourceBindingListener());
		environment.getApplicationContext().addEventListener(new Listener());
	}

}