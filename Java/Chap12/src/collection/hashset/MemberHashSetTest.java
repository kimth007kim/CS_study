package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		Member memberLee =new Member(101,"�̼���");
		Member memberKim =new Member(102,"������");
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
