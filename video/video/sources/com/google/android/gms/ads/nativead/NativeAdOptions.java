package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class NativeAdOptions {
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f184o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 4;
    public static final int v = 8;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final VideoOptions e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    /* loaded from: classes2.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        public VideoOptions d;
        public boolean a = false;
        public int b = 0;
        public boolean c = false;
        public int e = 1;
        public boolean f = false;
        public boolean g = false;
        public int h = 0;
        public int i = 1;

        @InterfaceC5670cr1
        public NativeAdOptions a() {
            return new NativeAdOptions(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(@SwipeGestureDirection int i, boolean z) {
            this.g = z;
            this.h = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(@AdChoicesPlacement int i) {
            this.e = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(@NativeMediaAspectRatio int i) {
            this.b = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(boolean z) {
            this.f = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(boolean z) {
            this.c = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(boolean z) {
            this.a = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC5670cr1 VideoOptions videoOptions) {
            this.d = videoOptions;
            return this;
        }

        @InterfaceC5670cr1
        public final Builder q(int i) {
            this.i = i;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* loaded from: classes2.dex */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, zza zzaVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.e;
        this.e = builder.d;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    @InterfaceC11300zs1
    public VideoOptions c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.f;
    }

    public final int i() {
        return this.i;
    }
}
