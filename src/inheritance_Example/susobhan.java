package inheritance_Example;


class employee{
	long salary = 100920939;
}


class programmer extends employee{
	long bonus = 123332244;
}
public class susobhan {
public static void main(String args[]) {
	
	programmer e = new programmer();
	System.out.print("the salary of the programmer "+e.salary);
	System.out.print("the bonus"+e.bonus);
		
}

}
