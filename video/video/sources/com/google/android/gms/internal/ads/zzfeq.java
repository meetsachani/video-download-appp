package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzfeq {
    public final HashMap a = new HashMap();

    public final zzfep a(zzfeg zzfegVar, Context context, zzfdy zzfdyVar, zzfew zzfewVar) {
        HashMap hashMap = this.a;
        zzfep zzfepVar = (zzfep) hashMap.get(zzfegVar);
        if (zzfepVar == null) {
            zzfed zzfedVar = new zzfed(zzfej.m0(zzfegVar, context));
            zzfep zzfepVar2 = new zzfep(zzfedVar, new zzfey(zzfedVar, zzfdyVar, zzfewVar));
            hashMap.put(zzfegVar, zzfepVar2);
            return zzfepVar2;
        }
        return zzfepVar;
    }
}
