package IntermediateOopsAssignment;

public class _7_IceCream extends _7_DessertItem {

	@Override
	float getCost(int number) {
		tax=3;
		float rs=(100*number)+(tax*number);
		return rs;
	}

	@Override
	void addLoad(int iceCreams) {
		super.iceCreams=super.iceCreams+iceCreams;
	}

}
