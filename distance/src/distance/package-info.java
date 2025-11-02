package distance;


// code is in c++.......do not excecute it in ecllipse...it is just for keeping all codes together purpose

#include <iostream>
using namespace std;

class feet_inch;

class meter_centimeter
{
	public :
		int m,cm;
		meter_centimeter(int,int);
		void display();
		friend meter_centimeter add(meter_centimeter, feet_inch);
		friend feet_inch add( feet_inch, meter_centimeter);
		friend meter_centimeter sub(meter_centimeter, feet_inch);
		friend feet_inch sub( feet_inch, meter_centimeter);
		
};

meter_centimeter :: meter_centimeter(int m, int cm)
{
	this->m = m;
	this->cm = cm;
}

void meter_centimeter :: display()
{
	cout<<"\n Meter: "<<m; 
	 cout<<"\n CenƟmeter: "<<cm;
}

class feet_inch
{
	public:
		int feet, inch;
		feet_inch(int, int);
		void output();
		friend meter_centimeter add(meter_centimeter, feet_inch);
		friend feet_inch add( feet_inch, meter_centimeter);
		friend meter_centimeter sub(meter_centimeter, feet_inch);
		friend feet_inch sub( feet_inch, meter_centimeter);
		
};

feet_inch::feet_inch(int feet, int inch)
{
	this->feet = feet;
	this->inch = inch;
}

void feet_inch :: output()
{
	cout<<"\n Feet: "<<feet; 
	 cout<<"\n Inch: "<<inch; 

}

meter_centimeter add(meter_centimeter mc , feet_inch fi)
{
	meter_centimeter temp(0,0);
	float cal;
	int result;
	
	cal = mc.m*100 + mc.cm + fi.feet*30.2 + fi.inch*2.54;
	result = cal;
	
	temp.m = result/100;
	temp.cm = result%100;
	
	return temp;
}

feet_inch add(feet_inch fti, meter_centimeter mcm)
{
	feet_inch temp(0,0);
	float cal;
	int result;
	
	cal = mcm.m*39.37 + mcm.cm/2.54 + fti.feet*12 + fti.inch;
	result = cal;
	temp.feet = result/100;
	temp.inch = result%100;
	
	return temp;
	
}

meter_centimeter sub(meter_centimeter mc, feet_inch fi)
{
	meter_centimeter temp(0,0);
	float cal;
	int result;
	
	cal = mc.m*100 - mc.cm - fi.feet*30.2 - fi.inch*2.54;
	result = cal;
	
	temp.m = result/100;
	temp.cm = result%100;
	
	return temp;
}

feet_inch sub(feet_inch fti, meter_centimeter mcm)
{
	feet_inch temp(0,0);
	float cal;
	int result;
	
	cal = mcm.m*39.37 - mcm.cm/2.54 - fti.feet*12 - fti.inch;
	result = cal;
	temp.feet = result/100;
	temp.inch = result%100;
	
	return temp;
	
}

int main()
{
	int meter,centimeter,feet,inch;
	int ch = 0;
	
	cout<<"Enter the meter value: ";
	cin>>meter;
	cout<<"Enter the centimeter value: ";
	cin>>centimeter;
	cout<<"\n Enter feet value: "; 
	cin>>feet; 
	cout<<"\n Enter inch value: "; 
	cin>>inch;
	
	meter_centimeter m1(meter, centimeter), m2(0,0);
	feet_inch f1(feet, inch), f2(0,0);
	
	m1.display();
	f1.output();
	
	do
	{
		 cout<<"\n 1.Addition in meter and centimeter";
		 cout<<"\n 2.Addition in feet and inches";
		 cout<<"\n 3.Subtraction of meter and centimeter";
		 cout<<"\n 4.Subtraction of feet and inches";
		 
		 cout<<"Enter choice: ";
		 cin>>ch;
		 
		 switch(ch)
		 {
		 	case 1:
		 		cout<<"\nAddition of centimeter values in meter and centimeter: ";
		 		m2=add(m1,f1);
		 		m2.display();
		 		break;
		 		
		 	case 2:
		 		cout<<"\\nAddition of inches values in feet and inches:";
		 		f2=add(f1,m1);
		 		f2.output();
		 		break;
		 	
		 	case 3:
		 		cout<<"\nSubtraction of centimeter values in meter and centimeter:";
		 		m2=sub(m1,f1);
		 		m2.display();
		 		break;
		 		
		 	case 4:
		 		cout<<"\nSubtraction of inches values in feet and inches:";
		 		f2=sub(f1,m1);
		 		f2.output();
		 		break;
		 		
		 	case 5: 
		 		cout<<"\nExit";
		 		
			 
		 }
	}
	 while(ch != 5);
}