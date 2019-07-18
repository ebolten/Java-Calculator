import javafx.geometry.Insets;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//this application will be a calculator
/* 
 * 1. create grid pane /
 * 2. create buttons and add them to pane /
 * 3. add event handler for the buttons /
 * 4. render text to the application for buttons pressed /
 * 5. execute statement
 */
public class myCalculator extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextField input = new TextField("");
		
		//pane to hold all nodes
		GridPane pane = new GridPane();
		
		//numbered buttons
		Button btnOne = new Button("1");
		btnOne.setPadding(new Insets(10,10,10,10));
		btnOne.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "1");
			}
		});
		//number two button
		Button btnTwo = new Button("2");
		btnTwo.setPadding(new Insets(10,10,10,10));
		btnTwo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "2");
			}
		});
		//number three button
		Button btnThree = new Button("3");
		btnThree.setPadding(new Insets(10,10,10,10));
		btnThree.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "3");
			}
		});
		//number four button
		Button btnFour = new Button("4");
		btnFour.setPadding(new Insets(10,10,10,10));
		btnFour.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "4");
			}
		});
		//number five button
		Button btnFive = new Button("5");
		btnFive.setPadding(new Insets(10,10,10,10));
		btnFive.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "5");
			}
		});
		//number six button
		Button btnSix = new Button("6");
		btnSix.setPadding(new Insets(10,10,10,10));
		btnSix.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "6");
			}
		});
		//number seven button
		Button btnSeven = new Button("7");
		btnSeven.setPadding(new Insets(10,10,10,10));
		btnSeven.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "7");
			}
		});
		//number eight button
		Button btnEight = new Button("8");
		btnEight.setPadding(new Insets(10,10,10,10));
		btnEight.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "8");
			}
		});
		//number nine button
		Button btnNine = new Button("9");
		btnNine.setPadding(new Insets(10,10,10,10));
		btnNine.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "9");
			}
		});
		//number zero button
		Button btnZero = new Button("0");
		btnZero.setPadding(new Insets(10,10,10,10));
		btnZero.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + "0");
			}
		});
			
		//all math signs on calculator
		Button btnPlus = new Button("+");
		btnPlus.setPadding(new Insets(10,10,10,10));
		btnPlus.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + " + ");
			}
		});
		//minus button
		Button btnMinus = new Button("-");
		btnMinus.setPadding(new Insets(10,10,10,10));
		btnMinus.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + " - ");
			}
		});
		//divide button
		Button btnDivide = new Button("/");
		btnDivide.setPadding(new Insets(10,10,10,10));
		btnDivide.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + " / ");
			}
		});
		//multiply button
		Button btnMulti = new Button("*");
		btnMulti.setPadding(new Insets(10,10,10,10));
		btnMulti.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + " * ");
			}
		});
		//equal button
		Button btnEqual = new Button("=");
		btnEqual.setPadding(new Insets(10,10,10,10));
		btnEqual.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				
				String statement = input.getText();
				
				//some code will go here to evaluate expression
		        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

		        try {
		            // Evaluate the expression
		            Object result = engine.eval(statement); //engine evaluates expression
		 
		            input.setText(""+result+""); //output result as string
		        }
		        catch (ScriptException event) {
		            input.setText("error"); //if expression can't be evaluated, output error
		            event.printStackTrace();
		        }
			}
		});
		//clear button
		Button btnClear = new Button("C");
		btnClear.setPadding(new Insets(10,10,10,10));
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				input.setText("");
			}
		});
		//decimal button
		Button btnDec = new Button(".");
		btnDec.setPadding(new Insets(10,10,10,10));
		btnDec.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String old = input.getText();
				input.setText(old + ".");
			}
		});
		
		
		pane.setPadding(new Insets(10,10,10,10));
		
		//settings for grid pane
		GridPane.setConstraints(btnOne, 1, 3);
		GridPane.setConstraints(btnTwo, 2, 3);
		GridPane.setConstraints(btnThree, 3, 3);
		GridPane.setConstraints(btnFour, 4, 3);
		GridPane.setConstraints(btnFive, 1, 4); //end row one
		GridPane.setConstraints(btnSix, 2, 4); 
		GridPane.setConstraints(btnSeven, 3, 4);
		GridPane.setConstraints(btnEight, 4, 4);
		GridPane.setConstraints(btnNine, 1, 5);
		GridPane.setConstraints(btnZero, 2, 5); //end row two
		
		GridPane.setConstraints(btnClear,4,5); //mathmatical symbols row
		GridPane.setConstraints(btnDec,3,5);
		GridPane.setConstraints(btnPlus,1,6);
		GridPane.setConstraints(btnMinus,2,6);
		GridPane.setConstraints(btnDivide,3,6);
		GridPane.setConstraints(btnMulti,4,6);
		GridPane.setConstraints(btnEqual,0,3);

		//adding nodes to grid pane
		pane.getChildren().add(btnEqual);
		pane.getChildren().addAll(btnPlus,btnMinus,btnDivide,btnMulti,btnDec);
		pane.getChildren().add(btnClear);
		pane.getChildren().add(input);
		pane.getChildren().addAll(btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven);
		pane.getChildren().addAll(btnEight,btnNine,btnZero);

		Stage stage = new Stage();
		Scene scene = new Scene(pane,310,200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("My Calculator");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
