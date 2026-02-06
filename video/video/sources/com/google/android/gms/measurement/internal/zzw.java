package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;

/* loaded from: classes3.dex */
final /* synthetic */ class zzw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[zzew.zzd.zzb.values().length];
        b = iArr;
        try {
            iArr[zzew.zzd.zzb.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[zzew.zzd.zzb.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[zzew.zzd.zzb.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[zzew.zzd.zzb.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzew.zzf.zza.values().length];
        a = iArr2;
        try {
            iArr2[zzew.zzf.zza.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[zzew.zzf.zza.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[zzew.zzf.zza.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[zzew.zzf.zza.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[zzew.zzf.zza.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[zzew.zzf.zza.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
