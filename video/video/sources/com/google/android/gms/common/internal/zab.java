package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zab {
    public final Set<Scope> a;

    public zab(Set<Scope> set) {
        Preconditions.r(set);
        this.a = Collections.unmodifiableSet(set);
    }
}
