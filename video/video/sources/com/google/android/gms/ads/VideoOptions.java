package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfw;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class VideoOptions {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public boolean a = true;
        public boolean b = false;
        public boolean c = false;

        @InterfaceC5670cr1
        public VideoOptions a() {
            return new VideoOptions(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(boolean z) {
            this.c = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder c(boolean z) {
            this.b = z;
            return this;
        }

        @InterfaceC5670cr1
        public Builder d(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzj zzjVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public VideoOptions(zzfw zzfwVar) {
        this.a = zzfwVar.X;
        this.b = zzfwVar.Y;
        this.c = zzfwVar.Z;
    }
}
