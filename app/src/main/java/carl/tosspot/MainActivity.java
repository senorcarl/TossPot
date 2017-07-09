package carl.tosspot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    private ToggleButton toggleBlind;
    private ToggleButton toggle360;
    private ToggleButton toggleShoulder;
    private ToggleButton toggle540;
    private ToggleButton toggleB540;
    private ToggleButton toggleThunder;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  gestureObject = new GestureDetectorCompat(this, new LearnGesture());

        toggleBlind = (ToggleButton)findViewById(R.id.toggle_blind);
        toggle360 = (ToggleButton)findViewById(R.id.toggle_360);
        toggle540 = (ToggleButton)findViewById(R.id.toggle_540);
        toggleShoulder = (ToggleButton)findViewById(R.id.toggle_shoulder);
        toggleB540 = (ToggleButton)findViewById(R.id.toggle_b540);
        toggleThunder = (ToggleButton)findViewById(R.id.toggle_thunder);
    }


    //Team A Code started


    public void teamAOneScore(View view) {





                if(toggleBlind.isChecked()){


                    scoreTeamA = scoreTeamA + 2;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);
                }
                else if(toggle360.isChecked()){

                    scoreTeamA = scoreTeamA + 4;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);

                }
                else if(toggleShoulder.isChecked()){

                    scoreTeamA = scoreTeamA + 8;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);
                }
                else if(toggle540.isChecked()){

                    scoreTeamA = scoreTeamA + 16;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);
                }
                else if(toggleB540.isChecked()){

                    scoreTeamA = scoreTeamA + 24;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);
                }
                else{

                    scoreTeamA = scoreTeamA + 1;
                    displayForTeamA(scoreTeamA);
                    toggleReset(view);
                }






    }


    private void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.teamAScore);
        scoreView.setText("" + score);
    }

    /*
    Team A code finish
     */

    /*
    Team B code started
     */

    public void teamBOneScore(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }




    private void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.teamBSCore);
        scoreView.setText("" + score);
    }

    /*
    Team B code finished
     */

    //Reset button code

    public void resetButton(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        toggleReset(view);
    }

    public void thunderButton(View view){


    }

    public void toggleReset(View view){

        toggleBlind.setChecked(false);
        toggle360.setChecked(false);
        toggleB540.setChecked(false);
        toggleShoulder.setChecked(false);
        toggleThunder.setChecked(false);
        toggle540.setChecked(false);

       /* if(toggleBlind.isChecked()) {
            toggleBlind.toggle();
        }else if(toggle360.isChecked()) {
            toggle360.toggle();
        }else if(toggleShoulder.isChecked()) {
            toggleShoulder.toggle();
        }else if(toggle540.isChecked()) {
            toggle540.toggle();
        }else if(toggleB540.isChecked()) {
            toggleB540.toggle();
        }else if(toggleThunder.isChecked()) {
            toggleThunder.toggle();
        }
        */

    }
}
