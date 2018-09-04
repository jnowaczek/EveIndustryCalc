package industryCalc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sde.DataLoader;

public class KrabKompanion extends Application {
	private static DataLoader loader = new DataLoader();

	public static void main(String args[]) {
		Sde sde = loader.loadData();
		System.out.println(sde.ores);
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("Krab Kompanion");
		primaryStage.show();
	}
}
