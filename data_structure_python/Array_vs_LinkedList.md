Array와 LinkedList 

- 저장 위치
Array - element 들은 인접한 memory위치에 저장된다.
LinkedList - element들은 memory 어딘가에 적용이 된다.

-크기
Array= size 는 반드시 array 선언 시점에 지정되어있어야한다.
LinkedList= size는 다양할수 있다. runtime 시점에 커질수있다.

- 메모리 할당
Array= memory는 array가 선언되자마자 Compile time에 할당 되어진다.
이것을 static memory Allocation이라고 부른다.
Stack section에 메모리 할당이 이루어 진다.


LinkedList= memory는 새로운 node가 추가될때 runtime에 할당 되어진다.
이것을 dynamic Memory Allocation 이라고 부른다.
Heap section에 메모리 할당이 이루어 진다.

중요 

- 요소 접근
Array= Random Access를 지원
 element를 index로 접근 가능 따라서 접근 시간복잡도는 O(1)
LinkedList= Sequential Acess를 지원
 순차적으로 접근해서 찾아야되기때문에 시간복잡도는 O(N)

삽입과 삭제

Array= 인덱스 접근후 삽입 or 삭제 O(1) + 전체 배열 요소를 1씩 Shift O(N)
LinkedList =  삽입하려는 위치 접근 후 삽입 및 삭제 O(N) , 삽입 or 삭제 하는 행위 자체는 O(1)