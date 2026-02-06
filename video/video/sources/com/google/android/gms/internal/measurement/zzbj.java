package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[zzbv.values().length];
        a = iArr;
        try {
            iArr[zzbv.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[zzbv.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[zzbv.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
