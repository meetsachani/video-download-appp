package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public final class NativeAdOptions {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f178o = 4;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final VideoOptions f;
    public final boolean g;

    /* loaded from: classes2.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        public VideoOptions e;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public boolean d = false;
        public int f = 1;
        public boolean g = false;

        @InterfaceC5670cr1
        public NativeAdOptions a() {
            return new NativeAdOptions(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(@AdChoicesPlacement int i) {
            this.f = i;
            return this;
        }

        @InterfaceC5670cr1
        @Deprecated
        public Builder c(int i) {
            this.b = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(@NativeMediaAspectRatio int i) {
            this.c = i;
            return this;
        }

        @InterfaceC5670cr1
        public Builder e(boolean z) {
            this.g = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder f(boolean z) {
            this.d = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder g(boolean z) {
            this.a = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC5670cr1 VideoOptions videoOptions) {
            this.e = videoOptions;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, zzd zzdVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.f;
        this.f = builder.e;
        this.g = builder.g;
    }

    public int a() {
        return this.e;
    }

    @Deprecated
    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    @InterfaceC11300zs1
    public VideoOptions d() {
        return this.f;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }
}
