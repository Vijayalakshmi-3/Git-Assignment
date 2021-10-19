package Assignment_2;

public class _7_Candy extends _7_DessertItem {

	@Override
	float getCost(int number) {
		tax=1;
		float rs=(10*number)+(tax*number);
		return rs;
	}

	@Override
	void addLoad(int candies) {
	super.candies=super.candies+candies;
	}

}
