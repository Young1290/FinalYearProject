package com.example.finalyearproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Bpm extends AppCompatActivity {

    private GraphView graphView;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseAuth firebaseAuth;
    private double temp1, temp2, temp3, temp4, temp5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpm);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference(firebaseAuth.getUid()).child("pet").child("condition").
                child("bpm");

        graphView = findViewById(R.id.idGraphView);

        if (firebaseAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(getApplicationContext(), Register.class));
        }
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                        // on below line we are adding
                        // each point on our x and y axis.d
                        new DataPoint(1, 91),
                        new DataPoint(2, 92),
                        new DataPoint(3, 95),
                        new DataPoint(4, 93),
                        new DataPoint(5, 96),
                });

                // after adding data to our line graph series.
                // on below line we are setting
                // title for our graph view.
                graphView.setTitle("BPM Graph View");

                // on below line we are setting
                // text color to our graph view.
                graphView.setTitleColor(R.color.purple_200);

                // on below line we are setting
                // our title text size.
                graphView.setTitleTextSize(18);

                // on below line we are adding
                // data series to our graph view.
                graphView.addSeries(series);
                graphView.getViewport().setMinX(0);
                graphView.getViewport().setMaxX(6);
                graphView.getViewport().setMinY(80);
                graphView.getViewport().setMaxY(120);

                graphView.getViewport().setYAxisBoundsManual(true);
                graphView.getViewport().setXAxisBoundsManual(true);
                StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
                staticLabelsFormatter.setHorizontalLabels(new String[] {"0", "1", "2", "3", "4", "5"});
                staticLabelsFormatter.setVerticalLabels(new String[] {"80", "90", "100", "110", "120"});
                graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Bpm.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), HomeFragment.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_track:
                        startActivity(new Intent(getApplicationContext(), TrackFragment.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_person:
                        startActivity(new Intent(getApplicationContext(), PersonFragment.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }

}
