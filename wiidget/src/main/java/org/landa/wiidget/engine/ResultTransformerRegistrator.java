package org.landa.wiidget.engine;

import java.util.ArrayList;
import java.util.List;

public class ResultTransformerRegistrator {

	private final List<ResultTransformer> resultTransformers;

	public ResultTransformerRegistrator() {
		this.resultTransformers = new ArrayList<ResultTransformer>();
	}

	public void register(final ResultTransformer resultTransformer) {
		this.resultTransformers.add(resultTransformer);
	}

	public String transform(final String viewResult) {
		String transformed = viewResult;

		for (final ResultTransformer resultTransformer : this.resultTransformers) {
			transformed = resultTransformer.transform(transformed);
		}

		return transformed;
	}

}
