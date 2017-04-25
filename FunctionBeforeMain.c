#include<stdio.h>
void func() __attribute__ ((constructor));
void func()
{
    printf("Inside function\n");
}
int main()
{
    printf("Inside main function\n");
    return 0;
}
