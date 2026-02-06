package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzama implements Comparable {
    public final int X;
    public final zzalv Y;

    public zzama(int i, zzalv zzalvVar) {
        this.X = i;
        this.Y = zzalvVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.X, ((zzama) obj).X);
    }
}
