package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import o.S92;

/* loaded from: classes2.dex */
public final class zzfvr {
    public final zzfvq a;

    public zzfvr(zzfvq zzfvqVar) {
        int i = zzfum.Z;
        this.a = zzfvqVar;
    }

    public static zzfvr a(int i) {
        return new zzfvr(new zzfvq(S92.y) { // from class: com.google.android.gms.internal.ads.zzfvi
            @Override // com.google.android.gms.internal.ads.zzfvq
            public final Iterator a(zzfvr zzfvrVar, CharSequence charSequence) {
                return new zzfvn(zzfvrVar, charSequence, S92.y);
            }
        });
    }

    public static zzfvr b(final zzfun zzfunVar) {
        return new zzfvr(new zzfvq() { // from class: com.google.android.gms.internal.ads.zzfvj
            @Override // com.google.android.gms.internal.ads.zzfvq
            public final Iterator a(zzfvr zzfvrVar, CharSequence charSequence) {
                return new zzfvl(zzfvrVar, charSequence, zzfunVar);
            }
        });
    }

    public static zzfvr c(Pattern pattern) {
        final zzfut zzfutVar = new zzfut(pattern);
        zzfvc.i(!((zzfus) zzfutVar.a("")).a.matches(), "The pattern may not match the empty string: %s", zzfutVar);
        return new zzfvr(new zzfvq() { // from class: com.google.android.gms.internal.ads.zzfvk
            @Override // com.google.android.gms.internal.ads.zzfvq
            public final Iterator a(zzfvr zzfvrVar, CharSequence charSequence) {
                return new zzfvm(zzfvrVar, charSequence, zzfutVar.a(charSequence));
            }
        });
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfvo(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.a.a(this, charSequence);
    }
}
