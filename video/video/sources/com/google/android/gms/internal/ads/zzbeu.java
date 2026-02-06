package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbeu {
    public static final zzbef a = new zzbef("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbef b = new zzbef("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbef c = zzbef.b("gads:gma_attestation:click:timeout", 2000);
    public static final zzbef d = zzbef.d("gads:gma_attestation:click:enable", false);
    public static final zzbef e = zzbef.b("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbef f = zzbef.d("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbef g = zzbef.d("gads:gma_attestation:image_hash", false);
    public static final zzbef h = zzbef.d("gads:gma_attestation:impression:enable", true);
    public static final zzbef i;

    static {
        zzbef.d("gads:gma_attestation:request:enable_javascript", false);
        zzbef.d("gads:gma_attestation:request:enable", true);
        i = zzbef.d("gads:gma_attestation:click:report_error", true);
    }
}
