package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgtk implements zzgyw {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    public final int X;

    zzgtk(int i) {
        this.X = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.X;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.X);
    }
}
