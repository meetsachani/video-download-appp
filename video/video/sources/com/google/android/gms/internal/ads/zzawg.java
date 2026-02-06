package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzawg {
    public List a = Collections.EMPTY_LIST;

    public final List a() {
        List list = this.a;
        this.a = Collections.EMPTY_LIST;
        return list;
    }

    public final void b(List list) {
        this.a = new ArrayList(list);
    }
}
