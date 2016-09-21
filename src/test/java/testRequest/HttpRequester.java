package testRequest;
/**
 * Created by lemon on 14-4-14.
 */
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class HttpRequester {

    private static HttpClient hc = new DefaultHttpClient();
    /**
     * Get请求
     * @param url
     * @param params
     * @return
     */
    public static Long get(String url, List<NameValuePair> params) {
        String body = null;
        Long end = 0L;
        try {
            HttpGet httpget = new HttpGet(url);
            if(params != null){
                String str = EntityUtils.toString( new UrlEncodedFormEntity(params, "UTF-8"));
                httpget.setURI(new URI(httpget.getURI().toString() + "?" + str));
            }
            else{
                httpget.setURI(new URI(httpget.getURI().toString()));
            }
//            httpget.setHeader("Authorization","Basic c2FubG9naWNfNzpzYW5sb2dpY183");


            Long start = System.currentTimeMillis();
//            System.out.println(start);
            HttpResponse httpresponse = hc.execute(httpget);
            end =  System.currentTimeMillis() - start;
            System.out.println(end);
            System.out.println(httpresponse.getStatusLine());


            HttpEntity entity = httpresponse.getEntity();

            body = EntityUtils.toString(entity,"UTF-8");
            if (entity != null) {
                entity.consumeContent();
            }

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return end;
    }

    /**
     * // Post请求
     * @param url
     * @param params
     * @return
     */
    public static String post(String url, List<NameValuePair> params) {
        String body = null;
        try {
            // Post请求
            HttpPost httppost = new HttpPost(url);
            // 设置参数
            if(params != null){
                httppost.setEntity(new UrlEncodedFormEntity(params));
            }
            // 发送请求
            HttpResponse httpresponse = hc.execute(httppost);
            // 获取返回数据
            HttpEntity entity = httpresponse.getEntity();
            body = EntityUtils.toString(entity);
            if (entity != null) {
                entity.consumeContent();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

}