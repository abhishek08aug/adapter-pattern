package in.blogspot.randomcompiler.adapter.pattern.impl;

import in.blogspot.randomcompiler.adapter.pattern.api.ILegacyPower;
import in.blogspot.randomcompiler.adapter.pattern.api.IModernPower;


public class PowerAdapter implements IModernPower {
	private ILegacyPower legacyPower;
	
	public PowerAdapter() {
		legacyPower = new LegacyPower();
	}

	@Override
	public double modernRaisePower(double y, double x) {
		return legacyPower.raiseToPower(x, y);
	}

}
