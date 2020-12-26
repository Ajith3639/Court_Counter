package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int n=0;
int m=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(n);
        displayForTeamB(m);
    }
    public void ft(View view){
        n+=1;
       displayForTeamA(n);

    }

    public void points2(View view){
        n+=2;
        displayForTeamA(n);
    }
    public void points3(View view){
        n+=3;
        displayForTeamA(n);
    }
    /**
     *
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));}

    public void ftB(View view){
        m+=1;
        displayForTeamB(m);

    }

    public void points2B(View view){
        m+=2;
        displayForTeamB(m);
    }
    public void points3B(View view){
        m+=3;
        displayForTeamB(m);
    }
public void reset(View view){
        displayForTeamA(n=0);
        displayForTeamB(m=0);
}



}
