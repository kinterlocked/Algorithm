import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cake a = new Cake();
		Cake b = new Cake();
		Cake c = new Cake();
		
		a.setX(sc.nextInt());
		a.setY(sc.nextInt());
		a.setZ(sc.nextInt());
		c.setX(sc.nextInt());
		c.setY(sc.nextInt());
		c.setZ(sc.nextInt());
		
		b.setX(c.getX() - a.getZ());
		b.setY(c.getY() / a.getY());
		b.setZ(c.getZ() - a.getX());
		
		System.out.println(b.getX() + " " + b.getY() + " " + b.getZ());
		sc.close();
	}
}

class Cake {
	
	private int x, y, z;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
}
