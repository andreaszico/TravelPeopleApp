package mmw.cuexxdev.travelpeopleapp.reponseAPi;

import java.util.ArrayList;
import java.util.List;

import mmw.cuexxdev.travelpeopleapp.model.Users;


public class ResponseGetUsers {
    private String msg;
    private List<Users> data =  new ArrayList<>();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Users> getData() {
        return data;
    }

    public void setData(List<Users> data) {
        this.data = data;
    }
}
