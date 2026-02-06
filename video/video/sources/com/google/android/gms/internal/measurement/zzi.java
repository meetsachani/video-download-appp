package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[zzfp.zzd.zzb.values().length];
        a = iArr;
        try {
            iArr[zzfp.zzd.zzb.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[zzfp.zzd.zzb.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[zzfp.zzd.zzb.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[zzfp.zzd.zzb.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[zzfp.zzd.zzb.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
