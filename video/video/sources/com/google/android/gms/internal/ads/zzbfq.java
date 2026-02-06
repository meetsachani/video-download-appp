package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import o.C10997yd1;

/* loaded from: classes2.dex */
public final class zzbfq extends zzbfy {
    public static final int d1;
    public static final int e1;
    public static final int f1;
    public final String X;
    public final int Y0;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final int c1;
    public final List Y = new ArrayList();
    public final List Z = new ArrayList();

    static {
        int rgb = Color.rgb(12, (int) C10997yd1.y1, 206);
        d1 = rgb;
        e1 = Color.rgb(204, 204, 204);
        f1 = rgb;
    }

    public zzbfq(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        this.X = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzbft zzbftVar = (zzbft) list.get(i6);
            this.Y.add(zzbftVar);
            this.Z.add(zzbftVar);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = e1;
        }
        this.Y0 = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = f1;
        }
        this.Z0 = i4;
        if (num3 != null) {
            i5 = num3.intValue();
        } else {
            i5 = 12;
        }
        this.a1 = i5;
        this.b1 = i;
        this.c1 = i2;
    }

    public final int X7() {
        return this.a1;
    }

    public final List Y7() {
        return this.Y;
    }

    public final int b() {
        return this.b1;
    }

    public final int c() {
        return this.c1;
    }

    public final int d() {
        return this.Z0;
    }

    public final int f() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final String g() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final List h() {
        return this.Z;
    }
}
