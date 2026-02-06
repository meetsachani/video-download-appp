package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfvl extends zzfvp {
    public final /* synthetic */ zzfun a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvl(zzfvr zzfvrVar, CharSequence charSequence, zzfun zzfunVar) {
        super(zzfvrVar, charSequence);
        this.a1 = zzfunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int d(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int e(int i) {
        CharSequence charSequence = this.Z;
        int length = charSequence.length();
        zzfvc.b(i, length, "index");
        while (i < length) {
            if (this.a1.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
