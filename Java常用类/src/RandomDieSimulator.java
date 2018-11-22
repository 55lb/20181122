import java.util.Random;

	
	class RandomDie{
		private int sides;
		private Random generator;
		public RandomDie(int s){
			sides =s;
			generator = new Random();
		}
		public int cast(){
			return 1+generator.nextInt(sides);
		}
	}
	public  class RandomDieSimulator{
		public static void main(String[] args){
			int Num;
			RandomDie die= new RandomDie(6);
			final int TRIES =15;
			for(int i=0;i<TRIES;i++){
				Num =die.cast();
				System.out.print(Num+"");
			}
			System.out.println();
			
		}
	}

