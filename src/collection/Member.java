package collection;

import java.util.Comparator;

// 객체 비교를 위해 Comparable 또는 Comparator 인터페이스 구현
public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	
	// memberId를 기준으로 동일한 Member 인지 확인하는 로직
	// memberId가 같으면 memberName이 다르더라도 같은 Member로 인식
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	// 객체 비교를 위한 메서드 오버라이드
	@Override
	public int compareTo(Member member) {
		
		// (내꺼 - 들어온거) 가 양수이면 오름차순
		return this.memberName.compareTo(member.memberName);
	}

	@Override
	public int compare(Member member1, Member member2) {
		// (내꺼 - 들어온거) 가 양수이면 오름차순
		return member1.memberId - member2.memberId;
	}
	
}
