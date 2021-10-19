package Assignment_2;

public class _7_Cookie extends _7_DessertItem {

	@Override
	float getCost(int number) {
		tax=2;
		float rs=(50*number)+(tax*number);
		return rs;
	}

	@Override
	void addLoad(int cookies) {
		super.cookies=super.cookies+cookies;
	}

}
