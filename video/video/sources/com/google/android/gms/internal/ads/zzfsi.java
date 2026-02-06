package com.google.android.gms.internal.ads;

import android.os.IBinder;
import o.C8077mf;

/* loaded from: classes2.dex */
final class zzfsi extends zzftm {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm a(String str) {
        this.f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm b(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm c(int i) {
        this.g = (byte) (this.g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm d(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm e(float f) {
        this.d = f;
        this.g = (byte) (this.g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm f(int i) {
        this.g = (byte) (this.g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm g(IBinder iBinder) {
        if (iBinder != null) {
            this.a = iBinder;
            return this;
        }
        throw new NullPointerException("Null windowToken");
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftm h(int i) {
        this.e = i;
        this.g = (byte) (this.g | C8077mf.r);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final zzftn i() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new zzfsk(iBinder, this.b, this.c, this.d, 0, 0, null, this.e, null, this.f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.g & C8077mf.r) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
