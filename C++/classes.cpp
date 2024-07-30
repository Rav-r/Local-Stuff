#include<iostream>
using namespace std;

// implementation of classes and objects using a simple program
class calcarea {
    public:
        int width, height, side, length;
        int area(int width, int length) {
            return width * length;
        }
        int area(int side) {
          return side*side;
        }
        int area(int length, int width, int height){
          return 2*(length*width + width*height + height*length);
        }
};
int main(){
  calcarea obj;
  int ch;
  do{
    cout<<"1. Area of Rectangle"<<endl;
    cout<<"2. Area of Square"<<endl;
    cout<<"3. Area of a cuboid"<<endl;
    cout<<"4. Exit"<<endl;
    cout<<"Enter your choice: ";
    cin>>ch;
    if(ch>4 || ch<1){
    cout<<"Invalid choice"<<endl;
    continue;
    }
    switch(ch){
      case 1:
        cout<<"Enter the length and width of the rectangle: ";
        cin>>obj.length;
        cin>>obj.width;
        cout<<"Area of the rectangle is "<<obj.area(obj.length, obj.width)<<endl;
        break;
        
      case 2:
        cout<<"Enter the side of the square: ";
        cin>>obj.side;
        cout<<"Area of the square is "<<obj.area(obj.side)<<endl;
        break;

      case 3:
        cout<<"Enter the length,height and width of the cuboid: ";
        cin>>obj.length;
        cin>>obj.width;
        cin>>obj.height;
        cout<<"Surface area of cuboid is "<<obj.area(obj.length, obj.width,obj.height)<<endl;
        break;
      case 4:
        cout<<"Exiting..."<<endl;
        exit(0);
    }
  }while(ch!=4);
  return 0;
}
