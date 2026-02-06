package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.C9998uW1;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfbx {
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final String i;
    @InterfaceC11300zs1
    public final zzfbw j;
    public final Bundle k;
    public final String l;
    public final String m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final JSONObject f278o;
    public final JSONObject p;
    public final String q;
    public final int r;
    public long s;
    public long t;

    public zzfbx(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        zzfbw zzfbwVar = null;
        long j = -1;
        long j2 = -1;
        long j3 = 0;
        int i3 = -1;
        int i4 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = com.google.android.gms.ads.internal.util.zzbs.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j3 = jsonReader.nextLong();
            } else {
                String str8 = str3;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C8)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfbwVar = new zzfbw(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V6)).booleanValue()) {
                            try {
                                try {
                                    Bundle a = com.google.android.gms.ads.internal.util.zzbs.a(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                                    if (a != null) {
                                        bundle = a;
                                    }
                                } catch (IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (IOException | JSONException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C9)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C9)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbcm zzbcmVar = zzbcv.D9;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i4 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K9)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
                            } else {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle a2 = com.google.android.gms.ads.internal.util.zzbs.a(com.google.android.gms.ads.internal.util.zzbs.i(jsonReader));
                                        if (a2 != null) {
                                            j2 = a(a2.getDouble("start_time"));
                                            j = a(a2.getDouble(C9998uW1.t0));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str3 = str8;
            }
        }
        String str9 = str3;
        jsonReader.endObject();
        this.a = list;
        this.c = i;
        if (((Boolean) zzbfb.c.e()).booleanValue()) {
            this.d = -1;
        } else {
            zzbef zzbefVar = zzbej.a;
            if (((Long) zzbefVar.e()).longValue() > -1) {
                this.d = ((Long) zzbefVar.e()).intValue();
            } else {
                this.d = i3;
            }
        }
        this.b = str;
        this.e = str6;
        this.f = i2;
        this.g = j3;
        this.j = zzfbwVar;
        this.h = z;
        this.i = str7;
        this.k = bundle;
        this.l = str4;
        this.m = str5;
        this.n = str2;
        this.f278o = jSONObject;
        this.p = jSONObject2;
        this.q = str9;
        zzbef zzbefVar2 = zzbez.a;
        this.r = ((Long) zzbefVar2.e()).longValue() > 0 ? ((Long) zzbefVar2.e()).intValue() : i4;
        this.s = j2;
        this.t = j;
    }

    public static final long a(double d) {
        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d;
    }
}
