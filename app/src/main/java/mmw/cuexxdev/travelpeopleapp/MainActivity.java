package mmw.cuexxdev.travelpeopleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import mmw.cuexxdev.travelpeopleapp.api.ApiCoba;
import mmw.cuexxdev.travelpeopleapp.api.RestClient;
import mmw.cuexxdev.travelpeopleapp.model.Users;
import mmw.cuexxdev.travelpeopleapp.reponseAPi.ResponseGetUsers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;
    TextView tvSubTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiCoba client = RestClient.getCLIENT();
        Call<ResponseGetUsers> call = client.getAllUser();
        tvSubTitle = findViewById(R.id.tvSubTitle);
        call.enqueue(new Callback<ResponseGetUsers>() {
            @Override
            public void onResponse(Call<ResponseGetUsers> call, Response<ResponseGetUsers> response) {
                if(response.isSuccessful()){
                    List<Users> usersList = response.body().getData();
                    tvSubTitle.setText(String.valueOf(usersList.size()));
                    Toast.makeText(getApplicationContext(), String.valueOf(usersList.size()), Toast.LENGTH_SHORT)
                            .show();
                }else if(response.code() == 404){
                    tvSubTitle.setText(String.valueOf(response));
                    Toast.makeText(getApplicationContext(), "ELSE IF " + response, Toast.LENGTH_LONG)
                            .show();
                } else {
                    Toast.makeText(getApplicationContext(), "ELSE", Toast.LENGTH_SHORT)
                            .show();
                }
            }

            @Override
            public void onFailure(Call<ResponseGetUsers> call, Throwable t) {

            }
        });
    }
}