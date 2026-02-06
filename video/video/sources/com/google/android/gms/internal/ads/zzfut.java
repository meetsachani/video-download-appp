package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfut extends zzfup implements Serializable {
    public final Pattern X;

    public zzfut(Pattern pattern) {
        pattern.getClass();
        this.X = pattern;
    }

    @Override // com.google.android.gms.internal.ads.zzfup
    public final zzfuo a(CharSequence charSequence) {
        return new zzfus(this.X.matcher(charSequence));
    }

    public final String toString() {
        return this.X.toString();
    }
}
