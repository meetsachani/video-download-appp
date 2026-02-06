package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class zzgml {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[zzgtk.values().length];
        b = iArr;
        try {
            iArr[zzgtk.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[zzgtk.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzguq.values().length];
        a = iArr2;
        try {
            iArr2[zzguq.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[zzguq.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[zzguq.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[zzguq.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
