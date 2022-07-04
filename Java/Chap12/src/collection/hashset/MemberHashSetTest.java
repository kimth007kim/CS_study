package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		Member memberLee =new Member(101,"ÀÌ¼ø½Å");
		Member memberKim =new Member(102,"±èÀ¯½Å");
		Member memberShin =new Member(103,"½Å»çÀÓ´ç");
		hashSet.addMember(memberLee);
		hashSet.addMember(memberKim);
		hashSet.addMember(memberShin);
		
		hashSet.showAll();
		Member memberLee2 =new Member(101,"ÀÌ¸ù·æ");
		hashSet.addMember(memberLee2);
		hashSet.showAll();

	}

}
