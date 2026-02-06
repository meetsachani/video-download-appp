package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzbaf implements Comparator {
    public zzbaf(zzbag zzbagVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazu zzazuVar = (zzazu) obj;
        zzazu zzazuVar2 = (zzazu) obj2;
        if (zzazuVar.d() < zzazuVar2.d()) {
            return -1;
        }
        if (zzazuVar.d() > zzazuVar2.d()) {
            return 1;
        }
        if (zzazuVar.b() < zzazuVar2.b()) {
            return -1;
        }
        if (zzazuVar.b() > zzazuVar2.b()) {
            return 1;
        }
        float a = (zzazuVar.a() - zzazuVar.d()) * (zzazuVar.c() - zzazuVar.b());
        float a2 = (zzazuVar2.a() - zzazuVar2.d()) * (zzazuVar2.c() - zzazuVar2.b());
        if (a > a2) {
            return -1;
        }
        if (a < a2) {
            return 1;
        }
        return 0;
    }
}
