package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class PreloadConfiguration {
    public final String a;
    public final AdFormat b;
    public final AdRequest c;
    public final int d;

    /* loaded from: classes2.dex */
    public static class Builder {
        public final String a;
        public final AdFormat b;
        public AdRequest c = new AdRequest.Builder().p();
        public int d;

        public Builder(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 AdFormat adFormat) {
            this.a = str;
            this.b = adFormat;
        }

        @InterfaceC5670cr1
        public PreloadConfiguration a() {
            return new PreloadConfiguration(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(@InterfaceC5670cr1 AdRequest adRequest) {
            this.c = adRequest;
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(int i) {
            this.d = i;
            return this;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder, zza zzaVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    @InterfaceC5670cr1
    public AdFormat a() {
        return this.b;
    }

    @InterfaceC5670cr1
    public AdRequest b() {
        return this.c;
    }

    @InterfaceC5670cr1
    public String c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }
}
