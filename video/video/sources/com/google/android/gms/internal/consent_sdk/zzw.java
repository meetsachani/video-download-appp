package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import o.C5445bv2;
import o.C5475c30;
import o.C6525gK;
import o.C7252jK;
import o.C9698tH2;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC7011iK;
import o.Q32;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzw {
    public final Application a;
    public final Handler b;
    public final Executor c;
    public final zzaq d;
    public final zzbo e;
    public final zzn f;
    public final zzz g;
    public final zze h;

    public zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbo zzboVar, zzn zznVar, zzz zzzVar, zze zzeVar) {
        this.a = application;
        this.b = handler;
        this.c = executor;
        this.d = zzaqVar;
        this.e = zzboVar;
        this.f = zznVar;
        this.g = zzzVar;
        this.h = zzeVar;
    }

    public static /* synthetic */ void a(final zzw zzwVar, Activity activity, C7252jK c7252jK, final InterfaceC7011iK.c cVar, final InterfaceC7011iK.b bVar) {
        try {
            C6525gK a = c7252jK.a();
            if (a != null) {
                if (!a.b()) {
                }
                final zzab a2 = new zzy(zzwVar.g, zzwVar.d(zzwVar.f.c(activity, c7252jK))).a();
                zzaq zzaqVar = zzwVar.d;
                zzaqVar.g(a2.a);
                zzaqVar.i(a2.b);
                zzwVar.e.d(a2.c);
                zzwVar.h.a().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzw.b(zzw.this, cVar, a2);
                    }
                });
            }
            String a3 = zzcm.a(zzwVar.a);
            Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + a3 + "\") to set this as a debug device.");
            final zzab a22 = new zzy(zzwVar.g, zzwVar.d(zzwVar.f.c(activity, c7252jK))).a();
            zzaq zzaqVar2 = zzwVar.d;
            zzaqVar2.g(a22.a);
            zzaqVar2.i(a22.b);
            zzwVar.e.d(a22.c);
            zzwVar.h.a().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzw.b(zzw.this, cVar, a22);
                }
            });
        } catch (zzg e) {
            zzwVar.b.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7011iK.b.this.a(e.a());
                }
            });
        } catch (RuntimeException e2) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            zzwVar.b.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7011iK.b.this.a(zzgVar.a());
                }
            });
        }
    }

    public static /* synthetic */ void b(zzw zzwVar, final InterfaceC7011iK.c cVar, zzab zzabVar) {
        Objects.requireNonNull(cVar);
        zzwVar.b.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7011iK.c.this.a();
            }
        });
        if (zzabVar.b != InterfaceC7011iK.d.NOT_REQUIRED) {
            zzwVar.e.c();
        }
    }

    public final void c(@InterfaceC11300zs1 final Activity activity, final C7252jK c7252jK, final InterfaceC7011iK.c cVar, final InterfaceC7011iK.b bVar) {
        this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzw.a(zzw.this, activity, c7252jK, cVar, bVar);
            }
        });
    }

    @InterfaceC10697xN2
    public final zzcl d(zzcj zzcjVar) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(Q32.j);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            String str = zzcjVar.a;
            if (str != null) {
                jsonWriter.name("admob_app_id");
                jsonWriter.value(str);
            }
            zzcf zzcfVar = zzcjVar.b;
            if (zzcfVar != null) {
                jsonWriter.name(C5475c30.c);
                jsonWriter.beginObject();
                int i = zzcfVar.c;
                if (i != 1) {
                    jsonWriter.name("os_type");
                    int i2 = i - 1;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            jsonWriter.value("ANDROID");
                        }
                    } else {
                        jsonWriter.value("UNKNOWN");
                    }
                }
                String str2 = zzcfVar.a;
                if (str2 != null) {
                    jsonWriter.name("model");
                    jsonWriter.value(str2);
                }
                Integer num = zzcfVar.b;
                if (num != null) {
                    jsonWriter.name("android_api_level");
                    jsonWriter.value(num);
                }
                jsonWriter.endObject();
            }
            String str3 = zzcjVar.c;
            if (str3 != null) {
                jsonWriter.name("language_code");
                jsonWriter.value(str3);
            }
            Boolean bool = zzcjVar.d;
            if (bool != null) {
                jsonWriter.name("tag_for_under_age_of_consent");
                jsonWriter.value(bool.booleanValue());
            }
            Map map = zzcjVar.e;
            if (!map.isEmpty()) {
                jsonWriter.name("stored_infos_map");
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    jsonWriter.value((String) entry.getValue());
                }
                jsonWriter.endObject();
            }
            zzch zzchVar = zzcjVar.f;
            if (zzchVar != null) {
                jsonWriter.name("screen_info");
                jsonWriter.beginObject();
                Integer num2 = zzchVar.a;
                if (num2 != null) {
                    jsonWriter.name("width");
                    jsonWriter.value(num2);
                }
                Integer num3 = zzchVar.b;
                if (num3 != null) {
                    jsonWriter.name("height");
                    jsonWriter.value(num3);
                }
                Double d = zzchVar.c;
                if (d != null) {
                    jsonWriter.name("density");
                    jsonWriter.value(d);
                }
                List<zzcg> list = zzchVar.d;
                if (!list.isEmpty()) {
                    jsonWriter.name("screen_insets");
                    jsonWriter.beginArray();
                    for (zzcg zzcgVar : list) {
                        jsonWriter.beginObject();
                        Integer num4 = zzcgVar.a;
                        if (num4 != null) {
                            jsonWriter.name(C9698tH2.l);
                            jsonWriter.value(num4);
                        }
                        Integer num5 = zzcgVar.b;
                        if (num5 != null) {
                            jsonWriter.name("left");
                            jsonWriter.value(num5);
                        }
                        Integer num6 = zzcgVar.c;
                        if (num6 != null) {
                            jsonWriter.name(C5445bv2.n0);
                            jsonWriter.value(num6);
                        }
                        Integer num7 = zzcgVar.d;
                        if (num7 != null) {
                            jsonWriter.name("bottom");
                            jsonWriter.value(num7);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            zzcd zzcdVar = zzcjVar.g;
            if (zzcdVar != null) {
                jsonWriter.name("app_info");
                jsonWriter.beginObject();
                String str4 = zzcdVar.a;
                if (str4 != null) {
                    jsonWriter.name("package_name");
                    jsonWriter.value(str4);
                }
                String str5 = zzcdVar.b;
                if (str5 != null) {
                    jsonWriter.name("publisher_display_name");
                    jsonWriter.value(str5);
                }
                String str6 = zzcdVar.c;
                if (str6 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str6);
                }
                jsonWriter.endObject();
            }
            zzci zzciVar = zzcjVar.h;
            if (zzciVar != null) {
                jsonWriter.name("sdk_info");
                jsonWriter.beginObject();
                String str7 = zzciVar.a;
                if (str7 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str7);
                }
                jsonWriter.endObject();
            }
            List<zzce> list2 = zzcjVar.i;
            if (!list2.isEmpty()) {
                jsonWriter.name("debug_params");
                jsonWriter.beginArray();
                for (zzce zzceVar : list2) {
                    switch (zzceVar.ordinal()) {
                        case 0:
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            break;
                        case 1:
                            jsonWriter.value("ALWAYS_SHOW");
                            break;
                        case 2:
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                            break;
                        case 3:
                            jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                            break;
                        case 4:
                            jsonWriter.value("GEO_OVERRIDE_OTHER");
                            break;
                        case 5:
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            break;
                        case 6:
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            break;
                    }
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            outputStreamWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                if (headerField != null) {
                    zzcl a = zzcl.a(new JsonReader(new StringReader(headerField)));
                    a.a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                    return a;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                bufferedReader.readLine();
                JsonReader jsonReader = new JsonReader(bufferedReader);
                zzcl a2 = zzcl.a(jsonReader);
                jsonReader.close();
                bufferedReader.close();
                return a2;
            }
            throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzg(2, "Error making request.", e2);
        }
    }
}
