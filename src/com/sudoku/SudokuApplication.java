package com.sudoku;

import com.sudoku.userInterface.IUserInterfaceContract;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImlp(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }


    public static void main(String [] args)
    {Launch(args);}


}
