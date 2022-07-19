package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>,Comparator<Member>{

	private int memberId;
	private String memberName;

	public Member() {
		
	}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId==member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + " 회원 님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memberName.compareTo(member.memberName))*(-1);
	}

	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return member1.memberId -member2.memberId;
	}

}
