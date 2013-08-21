package org.landa.wiidget.library.html.transformer;

import org.landa.wiidget.Wiidget;
import org.landa.wiidget.engine.ResultTransformer;
import org.landa.wiidget.engine.ResultTransformerRegistrator;

import com.google.inject.Inject;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class AbstractResultTransformerWiidget extends Wiidget {

	@Inject
	ResultTransformerRegistrator resultTransformerRegistrator;

	@Override
	public void run() {

		final AbstractResultTransformerWiidget transformer = this;

		resultTransformerRegistrator.register(new ResultTransformer() {

			@Override
			public String transform(final String result) {
				return transformer.transform(result);
			}
		});
	}

	protected abstract String transform(String result);

}
