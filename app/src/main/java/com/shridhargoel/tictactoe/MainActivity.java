package com.shridhargoel.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int activePlayer=0; //0 is for circle

    int[] gameState={2,2,2,2,2,2,2,2,2};
    public void dropDown(View view) {

        ImageView counter = (ImageView) view;
        int tag = Integer.parseInt(counter.getTag().toString());

        if (gameState[tag] == 2) {

            counter.setTranslationY(-1000f);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.circle);
                activePlayer = 1;
                gameState[tag]=0;
            } else {
                counter.setImageResource(R.drawable.cross);
                activePlayer = 0;
                gameState[tag]=1;
            }


            counter.animate().translationYBy(1000f).rotationBy(360f).setDuration(300);
        }
        if(gameState[0]==gameState[1] && gameState[1]==gameState[2] && gameState[0]!=2)
        {
            if(gameState[0]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }

        }

        if(gameState[3]==gameState[4] && gameState[4]==gameState[5] && gameState[3]!=2)
        {
            if(gameState[3]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }        }

        if(gameState[6]==gameState[7] && gameState[7]==gameState[8] && gameState[6]!=2)
        {
            if(gameState[6]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }      }

        if(gameState[0]==gameState[3] && gameState[3]==gameState[6] && gameState[0]!=2)
        {
            if(gameState[0]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }        }

        if(gameState[1]==gameState[4] && gameState[4]==gameState[7] && gameState[1]!=2)
        {
            if(gameState[1]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }       }

        if(gameState[2]==gameState[5] && gameState[5]==gameState[8] && gameState[2]!=2)
        {
            if(gameState[2]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }    }

        if(gameState[0]==gameState[4] && gameState[4]==gameState[8] && gameState[0]!=2)
        {
            if(gameState[0]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }     }

        if(gameState[2]==gameState[4] && gameState[4]==gameState[6] && gameState[2]!=2)
        {
            if(gameState[2]==0)
            {

                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Circle has won");

            }

            else
            {
                LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                linearLayout.setVisibility(View.VISIBLE);
                TextView display=(TextView) findViewById(R.id.won);
                display.setText("Cross has won");
            }
        }

        if(gameState[0]!=2 && gameState[1]!=2 && gameState[2]!=2 &&gameState[3]!=2 &&gameState[4]!=2 &&gameState[5]!=2 && gameState[6]!=2 &&gameState[7]!=2 &&gameState[8]!=2 )
        {
            if(gameState[0]==gameState[1] && gameState[1]==gameState[2] && gameState[0]!=2)
            {
                if(gameState[0]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }
            }

            else if(gameState[3]==gameState[4] && gameState[4]==gameState[5] && gameState[3]!=2)
            {
                if(gameState[3]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }      }

            else if(gameState[6]==gameState[7] && gameState[7]==gameState[8] && gameState[6]!=2)
            {
                if(gameState[6]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }       }

            else if(gameState[0]==gameState[3] && gameState[3]==gameState[6] && gameState[0]!=2)
            {
                if(gameState[0]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }        }

            else if(gameState[1]==gameState[4] && gameState[4]==gameState[7] && gameState[1]!=2)
            {
                if(gameState[1]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }       }

            else if(gameState[2]==gameState[5] && gameState[5]==gameState[8] && gameState[2]!=2)
            {
                if(gameState[2]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }    }

            else if(gameState[0]==gameState[4] && gameState[4]==gameState[8] && gameState[0]!=2)
            {
                if(gameState[0]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }   }

            else if(gameState[2]==gameState[4] && gameState[4]==gameState[6] && gameState[2]!=2)
            {
                if(gameState[2]==0)
                {

                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Circle has won");

                }

                else
                {
                    LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
                    linearLayout.setVisibility(View.VISIBLE);
                    TextView display=(TextView) findViewById(R.id.won);
                    display.setText("Cross has won");
                }
            }

            else
            {
                Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
                Button button= (Button) findViewById(R.id.playAgain2);
                button.setVisibility(View.VISIBLE);
            }
        }


    }

    public void playAgain(View view)
    {
        LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
        linearLayout.setVisibility(View.INVISIBLE);

        Button button= (Button) findViewById(R.id.playAgain2);
        button.setVisibility(View.INVISIBLE);

        activePlayer=0;

        for(int i=0; i<gameState.length; i++)
        {
            gameState[i]=2;
        }

        GridLayout grid= (GridLayout) findViewById(R.id.gridLayout);

        for(int i=0; i<grid.getChildCount();i++)
        {
            ((ImageView) grid.getChildAt(i)).setImageResource(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
