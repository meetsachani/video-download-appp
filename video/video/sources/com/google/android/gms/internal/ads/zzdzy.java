package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdzy implements zzffx {
    public final Context a;
    public final String b;

    public zzdzy(Context context, String str, zzbvt zzbvtVar, int i) {
        this.a = context;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffx
    /* renamed from: a */
    public final zzdzx b(zzdzw zzdzwVar) throws zzdwf {
        return c(zzdzwVar.a, zzdzwVar.b, zzdzwVar.c, zzdzwVar.d, zzdzwVar.e, com.google.android.gms.ads.internal.zzv.d().b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
        r10.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020e, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.g("Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0235, code lost:
        throw new com.google.android.gms.internal.ads.zzdwf(1, "Received error HTTP response code: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0256, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzdzx c(String str, int i, Map map, byte[] bArr, String str2, long j) throws zzdwf {
        URL url;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        boolean z = true;
        try {
            zzdzx zzdzxVar = new zzdzx();
            String str3 = this.b;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("SDK version: " + str3);
            com.google.android.gms.ads.internal.util.client.zzo.b("AdRequestServiceImpl: Sending request: " + str);
            URL url2 = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                int i4 = zzfqp.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    com.google.android.gms.ads.internal.zzv.v().M(this.a, str3, false, httpURLConnection, false, i);
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        httpURLConnection.setRequestProperty("Content-Type", str2);
                    }
                    BufferedOutputStream bufferedOutputStream2 = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    try {
                        zzlVar.c(httpURLConnection, bArr);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.util.client.zzo.e("Network request logging failed.", th);
                        com.google.android.gms.ads.internal.zzv.t().w(th, "HttpRequestFunction.logAdRequest");
                    }
                    int length = bArr.length;
                    if (length > 0) {
                        httpURLConnection.setDoOutput(z);
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            bufferedOutputStream.write(bArr);
                            IOUtils.b(bufferedOutputStream);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream2 = bufferedOutputStream;
                            IOUtils.b(bufferedOutputStream2);
                            throw th;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        List<String> value = entry2.getValue();
                        if (hashMap.containsKey(key)) {
                            ((List) hashMap.get(key)).addAll(value);
                        } else {
                            hashMap.put(key, new ArrayList(value));
                        }
                    }
                    zzlVar.e(httpURLConnection, responseCode);
                    zzdzxVar.a = responseCode;
                    zzdzxVar.b = hashMap;
                    zzdzxVar.c = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                        } catch (Throwable th4) {
                            th = th4;
                            inputStreamReader = null;
                        }
                        try {
                            com.google.android.gms.ads.internal.zzv.v();
                            StringBuilder sb = new StringBuilder(8192);
                            char[] cArr = new char[2048];
                            while (true) {
                                int read = inputStreamReader2.read(cArr);
                                if (read == -1) {
                                    break;
                                }
                                sb.append(cArr, 0, read);
                            }
                            String sb2 = sb.toString();
                            IOUtils.b(inputStreamReader2);
                            zzlVar.g(sb2);
                            zzdzxVar.c = sb2;
                            if (TextUtils.isEmpty(sb2)) {
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M5)).booleanValue()) {
                                    throw new zzdwf(3);
                                }
                            }
                            zzdzxVar.d = com.google.android.gms.ads.internal.zzv.d().b() - j;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStreamReader = inputStreamReader2;
                            IOUtils.b(inputStreamReader);
                            throw th;
                        }
                    } else if (responseCode < 300 || responseCode >= 400) {
                        break;
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b8)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e) {
                                    throw new zzdwf(1, e.getMessage(), e);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i3++;
                            if (i3 <= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v5)).intValue()) {
                                httpURLConnection.disconnect();
                                url2 = url;
                                z = true;
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.g("Too many redirects.");
                                throw new zzdwf(1, "Too many redirects");
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.g("No location header to follow redirect.");
                            throw new zzdwf(1, "No location header to follow redirect");
                        }
                    }
                } catch (zzdwf e2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D8)).booleanValue()) {
                        zzdzxVar.d = com.google.android.gms.ads.internal.zzv.d().b() - j;
                    } else {
                        throw e2;
                    }
                }
            }
        } catch (IOException e3) {
            String valueOf = String.valueOf(e3.getMessage());
            int i5 = com.google.android.gms.ads.internal.util.zze.b;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            com.google.android.gms.ads.internal.util.client.zzo.g(concat);
            throw new zzdwf(1, concat, e3);
        }
    }
}
