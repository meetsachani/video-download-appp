package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzalt implements zzakl {
    public final zzek a = new zzek();

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        boolean z;
        zzcu p;
        boolean z2;
        zzek zzekVar = this.a;
        zzekVar.j(bArr, i2 + i);
        zzekVar.l(i);
        ArrayList arrayList = new ArrayList();
        while (zzekVar.u() > 0) {
            if (zzekVar.u() >= 8) {
                z = true;
            } else {
                z = false;
            }
            zzdc.e(z, "Incomplete Mp4Webvtt Top Level box header found.");
            int A = zzekVar.A() - 8;
            if (zzekVar.A() == 1987343459) {
                CharSequence charSequence = null;
                zzcs zzcsVar = null;
                while (A > 0) {
                    if (A >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzdc.e(z2, "Incomplete vtt cue box header found.");
                    int A2 = zzekVar.A();
                    int A3 = zzekVar.A();
                    int i3 = A - 8;
                    int i4 = A2 - 8;
                    String c = zzeu.c(zzekVar.n(), zzekVar.w(), i4);
                    zzekVar.m(i4);
                    if (A3 == 1937011815) {
                        zzcsVar = zzamd.b(c);
                    } else if (A3 == 1885436268) {
                        charSequence = zzamd.a(null, c.trim(), Collections.EMPTY_LIST);
                    }
                    A = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcsVar != null) {
                    zzcsVar.l(charSequence);
                    p = zzcsVar.p();
                } else {
                    Pattern pattern = zzamd.a;
                    zzamb zzambVar = new zzamb();
                    zzambVar.c = charSequence;
                    p = zzambVar.a().p();
                }
                arrayList.add(p);
            } else {
                zzekVar.m(A);
            }
        }
        zzdkVar.b(new zzakd(arrayList, C10323vs.b, C10323vs.b));
    }
}
