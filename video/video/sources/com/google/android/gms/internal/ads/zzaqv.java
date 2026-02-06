package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import o.InterfaceC5056aJ2;
import o.Q32;

/* loaded from: classes2.dex */
public final class zzaqv extends zzaqi {
    public zzaqv() {
        throw null;
    }

    @InterfaceC5056aJ2
    public static List b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzapm((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqi
    public final zzaqs a(zzapu zzapuVar, Map map) throws IOException, zzapc {
        String p = zzapuVar.p();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzapuVar.q());
        URL url = new URL(p);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int e = zzapuVar.e();
        httpURLConnection.setConnectTimeout(e);
        httpURLConnection.setReadTimeout(e);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzapuVar.a() != 0) {
                httpURLConnection.setRequestMethod(Q32.j);
                byte[] C = zzapuVar.C();
                if (C != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(C);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                zzapuVar.a();
                if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                    try {
                        return new zzaqs(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqt(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                zzaqs zzaqsVar = new zzaqs(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaqsVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public zzaqv(zzaqu zzaquVar, SSLSocketFactory sSLSocketFactory) {
    }
}
