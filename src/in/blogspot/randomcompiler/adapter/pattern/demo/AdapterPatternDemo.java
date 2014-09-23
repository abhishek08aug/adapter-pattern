package in.blogspot.randomcompiler.adapter.pattern.demo;

import in.blogspot.randomcompiler.adapter.pattern.api.IModernPower;
import in.blogspot.randomcompiler.adapter.pattern.impl.PowerAdapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		IModernPower modernPower = new PowerAdapter();
		System.out.println("2 to power 20 = " + modernPower.modernRaisePower(20, 2));
		System.out.println("1 to power 100 = " + modernPower.modernRaisePower(100, 1));
		System.out.println("100 to power 1 = " + modernPower.modernRaisePower(1, 100));
	}

}
