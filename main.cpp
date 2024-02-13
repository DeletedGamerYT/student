#include <locale>
#include <iostream>

int Algorythm(int a, int b, int c) {
	for (int x = 1; x < c; x++) {
		if (((c - a * x) % b) == 0) {    //(4 - 1*1) % 1 ->
			int y = (c - a * x) / b; // y = (4 - 1*1) / 1 = 3
			if (y > 0) { // 3 > 0
				std::cout << "x = " << x << "y = " << y << std::endl;//correct
				return 1;
			}
		}
	}
	return 0;
}

int main(int argc, char* argv[]) {
	setlocale(LC_ALL, "Russian");
	std::cout << "090304-РПИа-о23 Коваленко Н. М." << std::endl;
	while (true) {
		int a, b, c;
		std::cout << "Enter a, b and c (for ex.: 12 3 5)" << std::endl;
		std::cin >> a >> b >> c;
		if ((a > 0) || (b > 0) || (c > 0)) {
			if (Algorythm(a, b, c) == 0) std::cout << "Incorrect" << std::endl;
		}
	}
	return 1;
}