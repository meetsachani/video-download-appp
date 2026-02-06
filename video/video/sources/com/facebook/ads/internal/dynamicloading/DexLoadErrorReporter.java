package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.S;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.firebase.messaging.GmsRpc;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AI0;
import o.C8947qD2;
import o.C9755tW1;
import o.InterfaceC2992Fs1;
import o.Q32;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.LOCAL)
/* loaded from: classes2.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;
    public static final String a = "https://www.facebook.com/adnw_logging/";
    public static final AtomicBoolean b = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public class a extends Thread {
        public final /* synthetic */ Context X;
        public final /* synthetic */ String Y;

        public a(Context context, String str) {
            this.X = context;
            this.Y = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            DataOutputStream dataOutputStream;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            String uuid;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            StringBuilder sb;
            String jSONObject4;
            DataOutputStream dataOutputStream2;
            super.run();
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(DexLoadErrorReporter.a).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(Q32.j);
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                    httpURLConnection2.setRequestProperty("Accept", "application/json");
                    httpURLConnection2.setRequestProperty(AI0.i, "UTF-8");
                    httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.connect();
                    uuid = UUID.randomUUID().toString();
                    jSONObject = new JSONObject();
                    jSONObject.put("attempt", "0");
                    DexLoadErrorReporter.b(this.X, jSONObject, uuid);
                    jSONObject2 = new JSONObject();
                    jSONObject2.put(GmsRpc.r, "generic");
                    jSONObject2.put("subtype_code", "1320");
                    jSONObject2.put("caught_exception", "1");
                    jSONObject2.put("stacktrace", this.Y);
                    jSONObject3 = new JSONObject();
                    jSONObject3.put("id", UUID.randomUUID().toString());
                    jSONObject3.put("type", S.Q);
                    sb = new StringBuilder();
                    sb.append("");
                    httpURLConnection = httpURLConnection2;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            }
            try {
                sb.append(System.currentTimeMillis() / 1000);
                jSONObject3.put("session_time", sb.toString());
                jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                jSONObject3.put(C9755tW1.p, uuid);
                jSONObject3.put("data", jSONObject2);
                jSONObject3.put("attempt", "0");
                DexLoadErrorReporter.b(this.X, jSONObject2, uuid);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("data", jSONObject);
                jSONObject5.put("events", jSONArray);
                jSONObject4 = jSONObject5.toString();
                dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
                inputStream = null;
                try {
                    Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                    if (dataOutputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection == null) {
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th4) {
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception e) {
                            Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e);
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e2);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th4;
                }
            }
            try {
                dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(jSONObject4, "UTF-8"));
                dataOutputStream2.flush();
                byte[] bArr = new byte[16384];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                InputStream inputStream2 = httpURLConnection.getInputStream();
                while (true) {
                    try {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = inputStream2;
                        dataOutputStream = dataOutputStream2;
                        Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                        if (dataOutputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection == null) {
                        }
                        httpURLConnection.disconnect();
                    }
                }
                byteArrayOutputStream.flush();
                try {
                    dataOutputStream2.close();
                } catch (Exception e3) {
                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e3);
                }
                try {
                    inputStream2.close();
                } catch (Exception e4) {
                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e4);
                }
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
                inputStream = null;
                Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (Exception e5) {
                        Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e5);
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e6) {
                        Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e6);
                    }
                }
                if (httpURLConnection == null) {
                    return;
                }
                httpURLConnection.disconnect();
            }
            httpURLConnection.disconnect();
        }
    }

    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put(C8947qD2.g, Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get() && Math.random() < d) {
            atomicBoolean.set(true);
            new a(context, str).start();
        }
    }
}
