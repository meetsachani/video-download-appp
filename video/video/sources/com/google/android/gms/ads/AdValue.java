package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class AdValue {
    public final int a;
    public final String b;
    public final long c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PrecisionType {
        public static final int p = 0;
        public static final int q = 1;
        public static final int r = 2;
        public static final int s = 3;
    }

    public AdValue(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @InterfaceC5670cr1
    public static AdValue d(int i, @InterfaceC5670cr1 String str, long j) {
        return new AdValue(i, str, j);
    }

    @InterfaceC5670cr1
    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }
}
