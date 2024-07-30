#include <iostream>

class DM {
  private:
    int m;
    int cm;

  public:
    DM(int m, int cm) {
        this->m = m;
        this->cm = cm;
    }

    void display() {
      std::cout << "Meters: " << m << " Centimeters: " << cm << std::endl;
    }
};

class DB {
  private:
    int f;
    int in;

  public:
    DM(int f, int in) {
        this->f = f;
        this->in = in;
    }

    void display() {
      std::cout << "Feet: " << f << " Inches: " << in << std::endl;
    }
};


