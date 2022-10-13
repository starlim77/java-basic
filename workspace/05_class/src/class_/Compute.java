package class_;

import java.security.PublicKey;

public class Compute {
	private int x,y,sum,sub,mul;
	private double div;
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y) {
	this.y=y;
	}
	public void calc() {
		sum = x+y;
		sub = x-y;
		mul = x*y;
		div = (double)x/y;
	}
	public int getX() { return x;}
	public int getY() { return y;}
	public int getSum() { return sum;}
	public int getSub() { return sub;}
	int getMul() { return mul;}
	double getDiv() { return div;}
	
}
