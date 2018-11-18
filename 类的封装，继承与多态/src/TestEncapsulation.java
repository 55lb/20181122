
 class MyCat6{
	private float weight;
	private float height;
	public MyCat6(float height,float weight){
		SetHeight(height);
		SetWeight(weight);
	}
	private void SetWeight(float wt){
		if(wt>0)
		{
			weight =wt;
		}else
		{
			System.out.println("weight设置非法（应该大于零）。\n 采用默认值10");
			weight =10.0f;
		}
	}
		private void SetHeight(float ht){
			if(ht>0){
				height =ht;
			}else{
				System.out.println("height设置非法（应该大于）.\n 采用默认值20");
				float height =20.0f;
			}
		}
		public float GetWeight(){
			return weight;
		}
		public float GetHeight(){
			return height;
		}
}
		public class TestEncapsulation{
			public static void main(String[] args){
				MyCat6 aCat = new MyCat6(12,-5);
				float ht = aCat.GetHeight();
				float wt =aCat.GetWeight();
				System.out.println("The height of cat is"+ht);
				System.out.println("The weight of cat is"+wt);
			}
		}

