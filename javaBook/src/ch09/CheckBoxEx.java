package ch09;

public class CheckBoxEx {

	public static void main(String[] args) {

		CheckBox checkbox = new CheckBox();
		checkbox.setOnSelectListener(new BackgroundChangeListener());
		checkbox.select();

	}

}
