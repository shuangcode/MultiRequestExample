package http.xsh.com.httprequestexample.net;

/**
 * Created by daniel.xiao on 2016/12/22.
 */

public interface IRequestCallback {

    void onSuccess(String response);
    void onFailure(Throwable throwable);
}
