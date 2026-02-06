package com.google.android.gms.ads.rewarded;

import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class ServerSideVerificationOptions {
    public final String a;
    public final String b;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public String a = "";
        public String b = "";

        @InterfaceC5670cr1
        public ServerSideVerificationOptions a() {
            return new ServerSideVerificationOptions(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(@InterfaceC5670cr1 String str) {
            this.b = str;
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(@InterfaceC5670cr1 String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @InterfaceC5670cr1
    public String a() {
        return this.b;
    }

    @InterfaceC5670cr1
    public String b() {
        return this.a;
    }
}
