package bean;

public class Person {
	private int pid;
	private String pname;
	private int page;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}
	
}
