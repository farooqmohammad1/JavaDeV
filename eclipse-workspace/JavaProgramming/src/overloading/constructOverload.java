package overloading;

public class constructOverload {
	double width,height,depth;
	constructOverload(){
		width=height=depth=0;
		
	}
	constructOverload(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
		
	}
	constructOverload(double len){
		width=height=depth=len;}
		

	void volume() {
		System.out.println(width*height*depth);
	}

}
