package mmw.cuexxdev.travelpeopleapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static ApiCoba CLIENT;
    static {
        generateRetrofit();
    }

    private static void generateRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.100.5/File/tutorial-zico/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CLIENT = retrofit.create(ApiCoba.class);
    }

    public static ApiCoba getCLIENT() {
        return CLIENT;
    }
}
