package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzez extends zzfc {
    public final long b;
    public final List c;
    public final List d;

    public zzez(int i, long j) {
        super(i, null);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    @InterfaceC11300zs1
    public final zzez b(int i) {
        List list = this.d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzez zzezVar = (zzez) list.get(i2);
            if (zzezVar.a == i) {
                return zzezVar;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public final zzfa c(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfa zzfaVar = (zzfa) list.get(i2);
            if (zzfaVar.a == i) {
                return zzfaVar;
            }
        }
        return null;
    }

    public final void d(zzez zzezVar) {
        this.d.add(zzezVar);
    }

    public final void e(zzfa zzfaVar) {
        this.c.add(zzfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfc
    public final String toString() {
        List list = this.c;
        String a = zzfc.a(this.a);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.d.toArray());
        return a + " leaves: " + arrays + " containers: " + arrays2;
    }
}
