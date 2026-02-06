package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import o.AK2;
import o.CK2;

/* loaded from: classes2.dex */
public final class zzame implements zzakl {
    public final zzek a = new zzek();
    public final zzalu b = new zzalu();

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        zzek zzekVar = this.a;
        zzekVar.j(bArr, i2 + i);
        zzekVar.l(i);
        ArrayList arrayList = new ArrayList();
        try {
            int w = zzekVar.w();
            Charset charset = StandardCharsets.UTF_8;
            String T = zzekVar.T(charset);
            if (T != null && T.startsWith(CK2.b)) {
                do {
                } while (!TextUtils.isEmpty(zzekVar.T(StandardCharsets.UTF_8)));
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    char c = 65535;
                    int i3 = 0;
                    while (c == 65535) {
                        i3 = zzekVar.w();
                        String T2 = zzekVar.T(StandardCharsets.UTF_8);
                        if (T2 == null) {
                            c = 0;
                        } else if (AK2.w.equals(T2)) {
                            c = 2;
                        } else if (T2.startsWith(AK2.v)) {
                            c = 1;
                        } else {
                            c = 3;
                        }
                    }
                    zzekVar.l(i3);
                    if (c != 0) {
                        if (c == 1) {
                            do {
                            } while (!TextUtils.isEmpty(zzekVar.T(StandardCharsets.UTF_8)));
                        } else if (c == 2) {
                            if (arrayList2.isEmpty()) {
                                zzekVar.T(StandardCharsets.UTF_8);
                                arrayList.addAll(this.b.b(zzekVar));
                            } else {
                                throw new IllegalArgumentException("A style block was found after the first cue.");
                            }
                        } else {
                            zzalw c2 = zzamd.c(zzekVar, arrayList);
                            if (c2 != null) {
                                arrayList2.add(c2);
                            }
                        }
                    } else {
                        zzakf.a(new zzamh(arrayList2), zzakkVar, zzdkVar);
                        return;
                    }
                }
            } else {
                zzekVar.l(w);
                throw zzaz.a("Expected WEBVTT. Got ".concat(String.valueOf(zzekVar.T(charset))), null);
            }
        } catch (zzaz e) {
            throw new IllegalArgumentException(e);
        }
    }
}
