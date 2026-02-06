package com.google.android.gms.internal.ads;

import java.util.List;
import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzul implements zzwv {
    public final zzfyc X;
    public long Y;

    public zzul(List list, List list2) {
        boolean z;
        int i = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxzVar.g(new zzuk((zzwv) list.get(i2), (List) list2.get(i2)));
        }
        this.X = zzfxzVar.j();
        this.Y = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzfyc zzfycVar = this.X;
                if (i >= zzfycVar.size()) {
                    break;
                }
                long c2 = ((zzuk) zzfycVar.get(i)).c();
                if (c2 != Long.MIN_VALUE && c2 <= zzkvVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 == c || z2) {
                    z |= ((zzuk) zzfycVar.get(i)).a(zzkvVar);
                }
                i++;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final long b() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzfyc zzfycVar = this.X;
            if (i >= zzfycVar.size()) {
                break;
            }
            zzuk zzukVar = (zzuk) zzfycVar.get(i);
            long b = zzukVar.b();
            if ((zzukVar.h().contains(1) || zzukVar.h().contains(2) || zzukVar.h().contains(4)) && b != Long.MIN_VALUE) {
                j = Math.min(j, b);
            }
            if (b != Long.MIN_VALUE) {
                j2 = Math.min(j2, b);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.Y = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.Y;
            if (j3 != C10323vs.b) {
                return j3;
            }
            return j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final long c() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzfyc zzfycVar = this.X;
            if (i >= zzfycVar.size()) {
                break;
            }
            long c = ((zzuk) zzfycVar.get(i)).c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        int i = 0;
        while (true) {
            zzfyc zzfycVar = this.X;
            if (i < zzfycVar.size()) {
                ((zzuk) zzfycVar.get(i)).d(j);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        int i = 0;
        while (true) {
            zzfyc zzfycVar = this.X;
            if (i >= zzfycVar.size()) {
                return false;
            }
            if (((zzuk) zzfycVar.get(i)).o()) {
                return true;
            }
            i++;
        }
    }
}
