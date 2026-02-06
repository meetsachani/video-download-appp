package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfkn implements Comparator {
    public final /* synthetic */ zzfkt X;

    public zzfkn(zzfkt zzfktVar) {
        this.X = zzfktVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfkl zzfklVar = (zzfkl) obj;
        zzfkl zzfklVar2 = (zzfkl) obj2;
        Object c = zzfklVar2.c();
        zzfkt zzfktVar = this.X;
        int compare = Double.compare(zzfkt.l(zzfktVar, zzfktVar.j(c)), zzfkt.l(zzfktVar, zzfktVar.j(zzfklVar.c())));
        if (compare == 0) {
            return Long.compare(zzfklVar.b(), zzfklVar2.b());
        }
        return compare;
    }
}
