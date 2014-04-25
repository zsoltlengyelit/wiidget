package org.landa.wiidget.library.util;

import java.util.LinkedList;
import java.util.List;

import org.landa.wiidget.Wiidget;

public class LoopHelper extends Wiidget {

	public List<Integer> loop(final int from, final int to, final int step) {

		final List<Integer> list = new LinkedList<>();

		for (int i = from; i <= to; i += step) {
			list.add(i);
		}
		return list;
	}

}
