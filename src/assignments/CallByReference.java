package assignments;

import java.util.Scanner;

public class CallByReference {
	public int a;
	public int b;
	public CallByReference(int x, int y)
	{
		a = x;
		b = y;
	}
	public void changeValue(CallByReference obj)
	{
		obj.a += 10;
		obj.b += 20;
	}
}
