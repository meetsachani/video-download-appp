package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbfj {
    public static final zzbef a = zzbef.d("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbef b;

    static {
        zzbef.d("gads:invalidate_token_at_refresh_start", true);
        zzbef.d("gms:expose_token_for_gma:enabled", true);
        zzbef.d("gads:referesh_rate_limit", false);
        b = zzbef.b("gads:timeout_for_trustless_token:millis", 2000L);
        zzbef.d("gads:token_anonymization:enabled", true);
        zzbef.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
