package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzaly {
    public static final Comparator c = new Comparator() { // from class: com.google.android.gms.internal.ads.zzalx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zzaly.b((zzaly) obj, (zzaly) obj2);
        }
    };
    public final zzalz a;
    public final int b;

    public /* synthetic */ zzaly(zzalz zzalzVar, int i, zzamc zzamcVar) {
        this.a = zzalzVar;
        this.b = i;
    }

    public static /* synthetic */ int b(zzaly zzalyVar, zzaly zzalyVar2) {
        return Integer.compare(zzalyVar.a.b, zzalyVar2.a.b);
    }
}
