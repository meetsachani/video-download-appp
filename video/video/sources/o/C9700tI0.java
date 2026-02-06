package o;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: o.tI0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9700tI0 implements EI0 {
    public static final String b = "Content-Type";
    public final HttpClient a;

    /* renamed from: o.tI0$a */
    /* loaded from: classes.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {
        public static final String X = "PATCH";

        public a() {
        }

        public String getMethod() {
            return X;
        }

        public a(URI uri) {
            setURI(uri);
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }

    public C9700tI0(HttpClient httpClient) {
        this.a = httpClient;
    }

    public static HttpUriRequest b(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws C4118Rh {
        switch (abstractC5091aS1.v()) {
            case -1:
                byte[] y = abstractC5091aS1.y();
                if (y != null) {
                    HttpPost httpPost = new HttpPost(abstractC5091aS1.I());
                    httpPost.addHeader("Content-Type", abstractC5091aS1.z());
                    httpPost.setEntity(new ByteArrayEntity(y));
                    return httpPost;
                }
                return new HttpGet(abstractC5091aS1.I());
            case 0:
                return new HttpGet(abstractC5091aS1.I());
            case 1:
                HttpPost httpPost2 = new HttpPost(abstractC5091aS1.I());
                httpPost2.addHeader("Content-Type", abstractC5091aS1.q());
                e(httpPost2, abstractC5091aS1);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(abstractC5091aS1.I());
                httpPut.addHeader("Content-Type", abstractC5091aS1.q());
                e(httpPut, abstractC5091aS1);
                return httpPut;
            case 3:
                return new HttpDelete(abstractC5091aS1.I());
            case 4:
                return new HttpHead(abstractC5091aS1.I());
            case 5:
                return new HttpOptions(abstractC5091aS1.I());
            case 6:
                return new HttpTrace(abstractC5091aS1.I());
            case 7:
                a aVar = new a(abstractC5091aS1.I());
                aVar.addHeader("Content-Type", abstractC5091aS1.q());
                e(aVar, abstractC5091aS1);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    public static List<NameValuePair> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    public static void e(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, AbstractC5091aS1<?> abstractC5091aS1) throws C4118Rh {
        byte[] p = abstractC5091aS1.p();
        if (p != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(p));
        }
    }

    public static void f(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // o.EI0
    public HttpResponse a(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh {
        HttpUriRequest b2 = b(abstractC5091aS1, map);
        f(b2, map);
        f(b2, abstractC5091aS1.u());
        d(b2);
        HttpParams params = b2.getParams();
        int G = abstractC5091aS1.G();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, G);
        return this.a.execute(b2);
    }

    public void d(HttpUriRequest httpUriRequest) throws IOException {
    }
}
