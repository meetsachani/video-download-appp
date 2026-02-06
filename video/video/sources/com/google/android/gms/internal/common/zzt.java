package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzt extends zzw {
    public final /* synthetic */ zzu c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.c1 = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int d(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int e(int i) {
        CharSequence charSequence = this.Z;
        int length = charSequence.length();
        zzs.b(i, length, "index");
        while (i < length) {
            zzu zzuVar = this.c1;
            if (zzuVar.a.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
