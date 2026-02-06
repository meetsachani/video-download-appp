package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.JF;

/* loaded from: classes2.dex */
public final class zzalv {
    @JF
    public int f;
    public int h;
    public float n;
    public String a = "";
    public String b = "";
    public Set c = Collections.EMPTY_SET;
    public String d = "";
    @InterfaceC11300zs1
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f211o = -1;
    public boolean p = false;

    public static int a(int i, String str, @InterfaceC11300zs1 String str2, int i2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }

    public final boolean A() {
        return this.j == 1;
    }

    public final float b() {
        return this.n;
    }

    public final int c() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int d() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int e() {
        return this.m;
    }

    public final int f() {
        return this.f211o;
    }

    public final int g(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, Set set, @InterfaceC11300zs1 String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            if (!TextUtils.isEmpty(str2)) {
                return 0;
            }
            return 1;
        }
        int a = a(a(a(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (a == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return a + (this.c.size() * 4);
    }

    public final int h() {
        int i = this.k;
        if (i == -1 && this.l == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.l == 1 ? 2 : 0);
    }

    public final zzalv i(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public final zzalv j(boolean z) {
        this.k = 1;
        return this;
    }

    public final zzalv k(boolean z) {
        this.p = z;
        return this;
    }

    public final zzalv l(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public final zzalv m(@InterfaceC11300zs1 String str) {
        this.e = zzfui.a(str);
        return this;
    }

    public final zzalv n(float f) {
        this.n = f;
        return this;
    }

    public final zzalv o(int i) {
        this.m = i;
        return this;
    }

    public final zzalv p(boolean z) {
        this.l = 1;
        return this;
    }

    public final zzalv q(int i) {
        this.f211o = i;
        return this;
    }

    public final zzalv r(boolean z) {
        this.j = 1;
        return this;
    }

    @InterfaceC11300zs1
    public final String s() {
        return this.e;
    }

    public final void t(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    public final void u(String str) {
        this.a = str;
    }

    public final void v(String str) {
        this.b = str;
    }

    public final void w(String str) {
        this.d = str;
    }

    public final boolean x() {
        return this.p;
    }

    public final boolean y() {
        return this.i;
    }

    public final boolean z() {
        return this.g;
    }
}
