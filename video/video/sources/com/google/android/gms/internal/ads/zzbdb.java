package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdb {
    public static final void a(zzbda zzbdaVar, @InterfaceC11300zs1 zzbcy zzbcyVar) {
        if (zzbcyVar.a() != null) {
            if (!TextUtils.isEmpty(zzbcyVar.b())) {
                zzbdaVar.d(zzbcyVar.a(), zzbcyVar.b(), zzbcyVar.c(), zzbcyVar.d());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
