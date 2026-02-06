package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfc;

/* loaded from: classes3.dex */
final /* synthetic */ class zzgw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[zzfc.zza.zze.values().length];
        b = iArr;
        try {
            iArr[zzfc.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[zzfc.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[zzfc.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[zzfc.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[com.google.android.gms.internal.measurement.zzs.values().length];
        a = iArr2;
        try {
            iArr2[com.google.android.gms.internal.measurement.zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[com.google.android.gms.internal.measurement.zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[com.google.android.gms.internal.measurement.zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[com.google.android.gms.internal.measurement.zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
