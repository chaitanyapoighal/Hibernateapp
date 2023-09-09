package anudip.org;

public class College {
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + "]";
	}

	private int cid;
	private String cname;

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

}
