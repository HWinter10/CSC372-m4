module CSC372_m4 {
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.controls;
	
	// Gets program to run
	opens application to javafx.graphics, javafx.fxml;
}