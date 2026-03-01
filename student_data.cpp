#include <iostream>
#include <vector>
using namespace std;

struct Student {
    string name;
    string studentClass;
    string achievement;
};

int main() {
    vector<Student> students = {
        {"Rohan Kumar", "10th", "Topper in Math"},
        {"Anjali Singh", "9th", "Debate Champion"}
    };

    cout << "Student List:\n";
    for(auto s : students){
        cout << s.name << " | " << s.studentClass << " | " << s.achievement << endl;
    }

    return 0;
}
