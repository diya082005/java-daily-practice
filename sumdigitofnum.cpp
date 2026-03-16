#include <iostream>
using namespace std;

int main(){
    int n =10829;
    int digitsum=0;
    while(n>0){

        int lastdigit = n%10;
        if (lastdigit % 2!=0){
            digitsum+=lastdigit;

        }
        n = n/10;
    }
    cout<< "sum = "<< digitsum<<endl;

    return 0; 
}