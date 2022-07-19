package hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee =new Member(101,"ÀÌ¼ø½Å");
		Member memberKim =new Member(102,"±èÀ¯½Å");
		Member memberShin =new Member(103,"½Å»çÀÓ´ç");
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberShin);
		
		memberHashMap.showAllMember();
		Member memberLee2 =new Member(101,"ÀÌ¸ù·æ");
		memberHashMap.addMember(memberLee2);
		memberHashMap.showAllMember();



	}

}
