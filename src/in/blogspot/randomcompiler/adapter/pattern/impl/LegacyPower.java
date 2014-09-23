package in.blogspot.randomcompiler.adapter.pattern.impl;

import in.blogspot.randomcompiler.adapter.pattern.api.ILegacyPower;

public class LegacyPower implements ILegacyPower {

	@Override
	public double raiseToPower(double x, double y) {
		return Math.pow(x, y);
	}
	
}
