package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class MediationAdConfiguration {
    public static final int j = 1;
    public static final int k = 0;
    public static final int l = -1;
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final Context d;
    public final boolean e;
    public final int f;
    public final int g;
    @InterfaceC11300zs1
    public final String h;
    public final String i;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 Bundle bundle2, boolean z, @InterfaceC11300zs1 Location location, int i, int i2, @InterfaceC11300zs1 String str2, @InterfaceC5670cr1 String str3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = context;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = str2;
        this.i = str3;
    }

    @InterfaceC5670cr1
    public String a() {
        return this.a;
    }

    @InterfaceC5670cr1
    public Context b() {
        return this.d;
    }

    @InterfaceC11300zs1
    public String c() {
        return this.h;
    }

    @InterfaceC5670cr1
    public Bundle d() {
        return this.c;
    }

    @InterfaceC5670cr1
    public Bundle e() {
        return this.b;
    }

    @InterfaceC5670cr1
    public String f() {
        return this.i;
    }

    public boolean g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }
}
