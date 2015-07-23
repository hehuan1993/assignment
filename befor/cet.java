#include <stdio.h>
 main()
{
int grade;
printf("Please input grade:");
scanf("%d",&grade);
if (grade >=425)
{printf("恭喜您，通过四级考试");}
else {printf("很遗憾，未能通过四级考试，请继续努力");}
return 0;
}