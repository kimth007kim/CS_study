package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet hashSet = new MemberTreeSet();
		
		Member memberLee =new Member(102,"ÀÌ¼ø½Å");
		Member memberKim =new Member(101,"±èÀ¯½Å");
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
