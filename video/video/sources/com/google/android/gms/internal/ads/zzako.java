package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzako implements zzaet {
    public final zzaet a;
    public final zzakj b;
    @InterfaceC11300zs1
    public zzakl g;
    public zzz h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = zzeu.b;
    public final zzek c = new zzek();

    public zzako(zzaet zzaetVar, zzakj zzakjVar) {
        this.a = zzaetVar;
        this.b = zzakjVar;
    }

    public static /* synthetic */ void h(zzako zzakoVar, long j, int i, zzakd zzakdVar) {
        boolean z;
        zzdc.b(zzakoVar.h);
        zzfyc<zzcu> zzfycVar = zzakdVar.a;
        long j2 = zzakdVar.c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfycVar.size());
        for (zzcu zzcuVar : zzfycVar) {
            arrayList.add(zzcuVar.a());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzek zzekVar = zzakoVar.c;
        int length = marshall.length;
        zzekVar.j(marshall, length);
        zzaet zzaetVar = zzakoVar.a;
        zzaetVar.d(zzekVar, length);
        long j3 = zzakdVar.b;
        if (j3 == C10323vs.b) {
            if (zzakoVar.h.t == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            zzdc.f(z);
        } else {
            long j4 = zzakoVar.h.t;
            if (j4 == Long.MAX_VALUE) {
                j += j3;
            } else {
                j = j3 + j4;
            }
        }
        zzaetVar.c(j, i | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void a(zzek zzekVar, int i, int i2) {
        if (this.g == null) {
            this.a.a(zzekVar, i, i2);
            return;
        }
        j(i);
        zzekVar.h(this.f, this.e, i);
        this.e += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ int b(zzl zzlVar, int i, boolean z) {
        return zzaer.a(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void c(final long j, final int i, int i2, int i3, @InterfaceC11300zs1 zzaes zzaesVar) {
        boolean z;
        if (this.g == null) {
            this.a.c(j, i, i2, i3, zzaesVar);
            return;
        }
        if (zzaesVar == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.e(z, "DRM on subtitles is not supported");
        int i4 = (this.e - i3) - i2;
        try {
            this.g.a(this.f, i4, i2, zzakk.a(), new zzdk() { // from class: com.google.android.gms.internal.ads.zzakn
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void b(Object obj) {
                    zzako.h(zzako.this, j, i, (zzakd) obj);
                }
            });
        } catch (RuntimeException e) {
            if (this.i) {
                zzdx.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void d(zzek zzekVar, int i) {
        zzaer.b(this, zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void e(zzz zzzVar) {
        boolean z;
        zzakl zzaklVar;
        String str = zzzVar.f301o;
        str.getClass();
        if (zzay.b(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (!zzzVar.equals(this.h)) {
            this.h = zzzVar;
            zzakj zzakjVar = this.b;
            if (zzakjVar.c(zzzVar)) {
                zzaklVar = zzakjVar.b(zzzVar);
            } else {
                zzaklVar = null;
            }
            this.g = zzaklVar;
        }
        if (this.g == null) {
            this.a.e(zzzVar);
            return;
        }
        zzaet zzaetVar = this.a;
        zzx b = zzzVar.b();
        b.E("application/x-media3-cues");
        b.c(str);
        b.I(Long.MAX_VALUE);
        b.g(this.b.a(zzzVar));
        zzaetVar.e(b.K());
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void f(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final int g(zzl zzlVar, int i, boolean z, int i2) throws IOException {
        if (this.g == null) {
            return this.a.g(zzlVar, i, z, 0);
        }
        j(i);
        int D = zzlVar.D(this.f, this.e, i);
        if (D == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += D;
        return D;
    }

    public final void i(boolean z) {
        this.i = true;
    }

    public final void j(int i) {
        byte[] bArr;
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr;
    }
}
