#include<stdio.h>

int main(void){
	int a;
	int *pa;
	printf("%d\n",pa);
	printf("%d\n",a);
//	printf("���������� a�� ���: %d\n",a);
	
	pa = &a;
	*pa = 10;
	
	printf("%d\n",pa);
	printf("%d\n",a);
	
	printf("�����ͷ� a�� ���: %d\n",*pa);
	printf("���������� a�� ���: %d\n",a);
	printf("������ pa �ּ�: %d\n",&pa);
	printf("������ a���ּ�: %d\n",&a);
	return 0;	
	
}
