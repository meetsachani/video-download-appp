package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class HttpGetRequest {
    public static final String d = "GET";
    public static final int e = 10000;
    public static final int f = 8192;
    public final String a;
    public final Map<String, String> b;
    public final Map<String, String> c = new HashMap();

    public HttpGetRequest(String str, Map<String, String> map) {
        this.a = str;
        this.b = map;
    }

    public final String a(Map<String, String> map) throws UnsupportedEncodingException {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        if (next.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode(next.getValue(), "UTF-8");
        }
        sb.append(str);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            if (next2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode(next2.getValue(), "UTF-8");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public final String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String a = a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a = "&" + a;
            }
            return str + a;
        }
        return str + "?" + a;
    }

    public HttpResponse c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String f2 = null;
        inputStream = null;
        try {
            String b = b(this.a, this.b);
            Logger.f().k("GET Request URL: " + b);
            httpsURLConnection = (HttpsURLConnection) new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        f2 = f(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, f2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }

    public HttpGetRequest e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }

    public final String f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }
}
