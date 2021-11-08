package primary;

class Main {

	public static void main(String[] args) {
		Elementary box= new Elementary();
		Elementary box2=new Elementary();
		int calc;
		box.setParameters(20, 30);
		box2.setParameters(50, 50);
		
		calc=box.volume();
		System.out.println(calc);
		
		calc=box2.volume();
		System.out.println(calc);
			
		}

	}


