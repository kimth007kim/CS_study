package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet hashSet = new MemberTreeSet();
		
		Member memberLee =new Member(102,"�̼���");
		Member memberKim =new Member(101,"������");
		Member memberShin =new Member(103,"�Ż��Ӵ�");
		hashSet.addMember(memberLee);
		hashSet.addMember(memberKim);
		hashSet.addMember(memberShin);
		
		hashSet.showAll();
		Member memberLee2 =new Member(101,"�̸���");
		hashSet.addMember(memberLee2);
		hashSet.showAll();

	}

}
