package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzazw implements Comparator {
    public zzazw(zzazy zzazyVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbac zzbacVar = (zzbac) obj;
        zzbac zzbacVar2 = (zzbac) obj2;
        int i = zzbacVar.c - zzbacVar2.c;
        if (i != 0) {
            return i;
        }
        return Long.compare(zzbacVar.a, zzbacVar2.a);
    }
}
