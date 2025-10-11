
public class Person {
	private int pid;
	private String name;
	static int cnt;
	
	static {
		cnt = 0;
	}
	
	//private final int c=10
	private final int c;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		cnt++;
		pid = cnt;
		c = 10;
	}

	public Person(int pid, String name, int c) {
		super();
		cnt++;
		this.pid = cnt;
		this.name = name;
		this.c=23;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}

	public int getC() {
		return c;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", c=" + c + "]";
	}
	
	
	
}
