package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzx {
    public final zzo a;
    public final boolean b;
    public final zzu c;

    public zzx(zzu zzuVar, boolean z, zzo zzoVar, int i) {
        this.c = zzuVar;
        this.b = z;
        this.a = zzoVar;
    }

    public static zzx c(zzo zzoVar) {
        return new zzx(new zzu(zzoVar), false, zzn.b, Integer.MAX_VALUE);
    }

    public final zzx b() {
        return new zzx(this.c, true, this.a, Integer.MAX_VALUE);
    }

    public final Iterable d(CharSequence charSequence) {
        return new zzv(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator h(CharSequence charSequence) {
        return new zzt(this.c, this, charSequence);
    }
}
