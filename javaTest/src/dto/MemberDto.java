package dto;

import java.io.Serializable;

public class MemberDto implements Serializable {
	private int rum;
	private int seq;
	private String id;
	private String name;
	private String phone;
	private String joinDate;
	private String job;
	private String dep;
	public MemberDto(int rum, int seq, String id, String name, String phone, String joinDate, String job, String dep) {
		super();
		this.rum = rum;
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.joinDate = joinDate;
		this.job = job;
		this.dep = dep;
	}
	
	
	public MemberDto(String id, String name, String phone, String job, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.job = job;
		this.dep = dep;
	}
	
	


	public MemberDto(int seq, String id, String name, String phone, String joinDate, String job, String dep) {
		super();
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.joinDate = joinDate;
		this.job = job;
		this.dep = dep;
	}


	public int getRum() {
		return rum;
	}
	public void setRum(int rum) {
		this.rum = rum;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return " 사원번호=" + seq + ", 사원아이디=" + id + ", 사원이름=" + name + ", 사원전화번호=" + phone
				+ ", 입사 날짜=" + joinDate + ", 직무=" + job + ", 부서=" + dep + "]";
	}
	
	
	
	
}
