#include<iostream>
using namespace std;
int main()
{
	int h = 1;
	int g = 1;
	int m = 1;
	
	for (; g <= 8; g++) {

		for (int i = 1; i <= 16; i++)
		{
			if (i <= 8)
			{

				int j = 0;
				while (j < i - 1)
				{
					cout << " ";
					j++;

				}
				cout << "Student NO." << h << " is here" << endl;
				h++;
			}
			else
			{
				int j = 0;
				while (16 - i > j)
				{
					cout << " ";
					j++;
				}
				cout << "Student NO." << h << " is here" << endl;
				h++;
			}

		}

	}
	return 0;
}
