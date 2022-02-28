#include<iostream>
using namespace std;
int main()
{
	int h=1;
	int g = 1;
	for (; g <= 8; g++) {
		for (int i = 1; i <= 8; i++)
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

	}
	return 0;
}
