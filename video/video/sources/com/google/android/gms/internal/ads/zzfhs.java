package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfhs implements zzgyw {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);
    
    public final int X;

    zzfhs(int i) {
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
