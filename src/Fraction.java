
public class Fraction {
	
	private int num;
	private int denum;
	
	public Fraction(int n, int d) {
		if (d == 0) throw new IllegalArgumentException("Denominateur egal a 0");
		this.num = n;
		this.denum = d;
		}
			
	public String toString() {
		//return "numerateur"+num+"denominateur"+denum;
		String fraction=num+" / "+denum;
		return fraction;
		}
	//getters
	public int getNum() {
		return 0;
	}
	public int getDenum() {
		return 0;
	}
	
}
