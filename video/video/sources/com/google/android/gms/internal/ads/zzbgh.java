package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbgh extends NativeAd.Image {
    public final zzbgg a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.e("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.e("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.e("", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbgh(zzbgg zzbggVar) {
        Drawable drawable;
        IObjectWrapper e;
        this.a = zzbggVar;
        Uri uri = null;
        try {
            e = zzbggVar.e();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
        }
        if (e != null) {
            drawable = (Drawable) ObjectWrapper.o1(e);
            this.b = drawable;
            uri = this.a.d();
            this.c = uri;
            double d = this.a.b();
            this.d = d;
            int i = -1;
            int i2 = this.a.f();
            this.e = i2;
            i = this.a.c();
            this.f = i;
        }
        drawable = null;
        this.b = drawable;
        uri = this.a.d();
        this.c = uri;
        double d2 = this.a.b();
        this.d = d2;
        int i3 = -1;
        int i22 = this.a.f();
        this.e = i22;
        i3 = this.a.c();
        this.f = i3;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable a() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double b() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri c() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int d() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int e() {
        return this.e;
    }
}
