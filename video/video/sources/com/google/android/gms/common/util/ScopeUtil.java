package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String[] a(@InterfaceC5670cr1 Set<Scope> set) {
        Preconditions.s(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        Preconditions.s(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].m0();
        }
        return strArr;
    }
}
