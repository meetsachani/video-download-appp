package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbv {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public zzcbv(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", zzbcv.Y);
        this.b = b(jSONObject, "byte_buffer_precache_limit", zzbcv.j);
        this.c = b(jSONObject, "exo_cache_buffer_size", zzbcv.t);
        this.d = b(jSONObject, "exo_connect_timeout_millis", zzbcv.f);
        zzbcm zzbcmVar = zzbcv.e;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.e = b(jSONObject, "exo_read_timeout_millis", zzbcv.g);
            this.f = b(jSONObject, "load_check_interval_bytes", zzbcv.h);
            this.g = b(jSONObject, "player_precache_limit", zzbcv.i);
            this.h = b(jSONObject, "socket_receive_buffer_size", zzbcv.k);
            this.i = a(jSONObject, "use_cache_data_source", zzbcv.z4);
            b(jSONObject, "min_retry_count", zzbcv.l);
            this.j = a(jSONObject, "treat_load_exception_as_non_fatal", zzbcv.n);
            this.k = a(jSONObject, "enable_multiple_video_playback", zzbcv.d2);
            this.l = a(jSONObject, "use_range_http_data_source", zzbcv.f2);
            this.m = c(jSONObject, "range_http_data_source_high_water_mark", zzbcv.g2);
            this.n = c(jSONObject, "range_http_data_source_low_water_mark", zzbcv.h2);
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar);
        this.e = b(jSONObject, "exo_read_timeout_millis", zzbcv.g);
        this.f = b(jSONObject, "load_check_interval_bytes", zzbcv.h);
        this.g = b(jSONObject, "player_precache_limit", zzbcv.i);
        this.h = b(jSONObject, "socket_receive_buffer_size", zzbcv.k);
        this.i = a(jSONObject, "use_cache_data_source", zzbcv.z4);
        b(jSONObject, "min_retry_count", zzbcv.l);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", zzbcv.n);
        this.k = a(jSONObject, "enable_multiple_video_playback", zzbcv.d2);
        this.l = a(jSONObject, "use_range_http_data_source", zzbcv.f2);
        this.m = c(jSONObject, "range_http_data_source_high_water_mark", zzbcv.g2);
        this.n = c(jSONObject, "range_http_data_source_low_water_mark", zzbcv.h2);
    }

    public static final boolean a(JSONObject jSONObject, String str, zzbcm zzbcmVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, zzbcm zzbcmVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue();
    }

    public static final long c(JSONObject jSONObject, String str, zzbcm zzbcmVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).longValue();
    }
}
