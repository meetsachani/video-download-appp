package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import o.InterfaceC5670cr1;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfoi {
    public final Context a;
    public final Looper b;

    public zzfoi(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(@InterfaceC5670cr1 String str) {
        zzfot s2 = zzfow.s2();
        Context context = this.a;
        s2.Y1(context.getPackageName());
        s2.a2(2);
        zzfoq s22 = zzfos.s2();
        s22.Y1(str);
        s22.Z1(2);
        s2.Z1(s22);
        new zzfoj(context, this.b, (zzfow) s2.V1()).a();
    }
}
