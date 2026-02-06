package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.C10977yY;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzgn implements zzgg {
    public final Context a;
    public final List b = new ArrayList();
    public final zzgg c;
    @InterfaceC11300zs1
    public zzgg d;
    @InterfaceC11300zs1
    public zzgg e;
    @InterfaceC11300zs1
    public zzgg f;
    @InterfaceC11300zs1
    public zzgg g;
    @InterfaceC11300zs1
    public zzgg h;
    @InterfaceC11300zs1
    public zzgg i;
    @InterfaceC11300zs1
    public zzgg j;
    @InterfaceC11300zs1
    public zzgg k;

    public zzgn(Context context, zzgg zzggVar) {
        this.a = context.getApplicationContext();
        this.c = zzggVar;
    }

    public static final void i(@InterfaceC11300zs1 zzgg zzggVar, zzhg zzhgVar) {
        if (zzggVar != null) {
            zzggVar.b(zzhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        zzgg zzggVar = this.k;
        zzggVar.getClass();
        return zzggVar.D(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long a(zzgl zzglVar) throws IOException {
        boolean z;
        zzgg zzggVar;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        Uri uri = zzglVar.a;
        String scheme = uri.getScheme();
        String str = zzeu.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !Objects.equals(scheme2, "file")) {
            if (C10977yY.n.equals(scheme)) {
                this.k = g();
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    zzgd zzgdVar = new zzgd(this.a);
                    this.f = zzgdVar;
                    h(zzgdVar);
                }
                this.k = this.f;
            } else if (C10977yY.p.equals(scheme)) {
                if (this.g == null) {
                    try {
                        zzgg zzggVar2 = (zzgg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = zzggVar2;
                        h(zzggVar2);
                    } catch (ClassNotFoundException unused) {
                        zzdx.f(C10977yY.m, "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = this.c;
                    }
                }
                this.k = this.g;
            } else if (C10977yY.q.equals(scheme)) {
                if (this.h == null) {
                    zzhi zzhiVar = new zzhi(2000);
                    this.h = zzhiVar;
                    h(zzhiVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    zzge zzgeVar = new zzge();
                    this.i = zzgeVar;
                    h(zzgeVar);
                }
                this.k = this.i;
            } else {
                if (!"rawresource".equals(scheme) && !C10977yY.t.equals(scheme)) {
                    zzggVar = this.c;
                } else {
                    if (this.j == null) {
                        zzhe zzheVar = new zzhe(this.a);
                        this.j = zzheVar;
                        h(zzheVar);
                    }
                    zzggVar = this.j;
                }
                this.k = zzggVar;
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                if (this.d == null) {
                    zzgv zzgvVar = new zzgv();
                    this.d = zzgvVar;
                    h(zzgvVar);
                }
                this.k = this.d;
            }
        }
        return this.k.a(zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void b(zzhg zzhgVar) {
        zzhgVar.getClass();
        this.c.b(zzhgVar);
        this.b.add(zzhgVar);
        i(this.d, zzhgVar);
        i(this.e, zzhgVar);
        i(this.f, zzhgVar);
        i(this.g, zzhgVar);
        i(this.h, zzhgVar);
        i(this.i, zzhgVar);
        i(this.j, zzhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @InterfaceC11300zs1
    public final Uri c() {
        zzgg zzggVar = this.k;
        if (zzggVar == null) {
            return null;
        }
        return zzggVar.c();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final Map d() {
        zzgg zzggVar = this.k;
        if (zzggVar == null) {
            return Collections.EMPTY_MAP;
        }
        return zzggVar.d();
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void f() throws IOException {
        zzgg zzggVar = this.k;
        if (zzggVar != null) {
            try {
                zzggVar.f();
            } finally {
                this.k = null;
            }
        }
    }

    public final zzgg g() {
        if (this.e == null) {
            zzfy zzfyVar = new zzfy(this.a);
            this.e = zzfyVar;
            h(zzfyVar);
        }
        return this.e;
    }

    public final void h(zzgg zzggVar) {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i < list.size()) {
                zzggVar.b((zzhg) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }
}
