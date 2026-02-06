package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqh extends Exception {
    public final int X;
    public final boolean Y;
    public final zzz Z;

    public zzqh(int i, zzz zzzVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.Y = z;
        this.X = i;
        this.Z = zzzVar;
    }
}
