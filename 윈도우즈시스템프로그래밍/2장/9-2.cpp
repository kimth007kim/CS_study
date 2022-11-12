#include<stdio.h>

int main(void){
	int a;
	int *pa;
	printf("%d\n",pa);
	printf("%d\n",a);
//	printf("변수명으로 a값 출력: %d\n",a);
	
	pa = &a;
	*pa = 10;
	
	printf("%d\n",pa);
	printf("%d\n",a);
	
	printf("포인터로 a값 출력: %d\n",*pa);
	printf("변수명으로 a값 출력: %d\n",a);
	printf("포인터 pa 주소: %d\n",&pa);
	printf("변수명 a값주소: %d\n",&a);
	return 0;	
	
}
