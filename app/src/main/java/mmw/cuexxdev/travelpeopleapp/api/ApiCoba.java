package mmw.cuexxdev.travelpeopleapp.api;

import mmw.cuexxdev.travelpeopleapp.reponseAPi.ResponseGetUsers;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCoba {
    @GET("/users/all")
    Call<ResponseGetUsers> getAllUser();
}
