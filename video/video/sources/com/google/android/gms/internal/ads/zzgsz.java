package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgsz implements zzgyw {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    public final int X;

    zzgsz(int i) {
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
