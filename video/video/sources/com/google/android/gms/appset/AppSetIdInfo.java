package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class AppSetIdInfo {
    public static final int c = 1;
    public static final int d = 2;
    @InterfaceC5670cr1
    public final String a;
    public final int b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Scope {
    }

    public AppSetIdInfo(@InterfaceC5670cr1 String str, int i) {
        this.a = str;
        this.b = i;
    }

    @InterfaceC5670cr1
    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}
