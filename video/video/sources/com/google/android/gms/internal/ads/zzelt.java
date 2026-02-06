package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzelt implements zzetv {
    public final zzgdj a;
    public final Context b;
    public final zzfcp c;
    @InterfaceC11300zs1
    public final View d;

    public zzelt(zzgdj zzgdjVar, Context context, zzfcp zzfcpVar, @InterfaceC11300zs1 ViewGroup viewGroup) {
        this.a = zzgdjVar;
        this.b = context;
        this.c = zzfcpVar;
        this.d = viewGroup;
    }

    public static /* synthetic */ zzelu c(zzelt zzeltVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        View view = zzeltVar.d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzelu(zzeltVar.b, zzeltVar.c.e, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzbcv.a(this.b);
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzelt.c(zzelt.this);
            }
        });
    }
}
