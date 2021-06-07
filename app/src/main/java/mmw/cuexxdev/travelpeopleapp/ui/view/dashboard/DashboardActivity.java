package mmw.cuexxdev.travelpeopleapp.ui.view.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import mmw.cuexxdev.travelpeopleapp.R;

public class DashboardActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.layout_toolbar);
        setSupportActionBar(toolbar);
    }
}