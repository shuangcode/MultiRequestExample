package http.xsh.com.httprequestexample.net;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by daniel.xiao on 2016/12/22.
 */

public class VolleyRequestManager implements IRequestManager {

    public static VolleyRequestManager getInstance(){
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder{
        private static VolleyRequestManager mInstance = new VolleyRequestManager();
    }


    @Override
    public void get(String url, IRequestCallback requestCallback) {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }

    @Override
    public void post(String url, String requestBodyJson, IRequestCallback requestCallback) {

    }

    @Override
    public void put(String url, String requestBodyJson, IRequestCallback requestCallback) {

    }

    @Override
    public void delete(String url, String requestBodyJson, IRequestCallback requestCallback) {

    }
}
