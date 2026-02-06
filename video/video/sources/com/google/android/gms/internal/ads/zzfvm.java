package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes2.dex */
final class zzfvm extends zzfvp {
    public final /* synthetic */ zzfuo a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvm(zzfvr zzfvrVar, CharSequence charSequence, zzfuo zzfuoVar) {
        super(zzfvrVar, charSequence);
        this.a1 = zzfuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int d(int i) {
        return ((zzfus) this.a1).a.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int e(int i) {
        Matcher matcher = ((zzfus) this.a1).a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
