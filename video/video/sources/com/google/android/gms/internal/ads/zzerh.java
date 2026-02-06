package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzerh implements zzetv {
    public final zzgdj a;
    @InterfaceC11300zs1
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public zzerh(zzgdj zzgdjVar, @InterfaceC11300zs1 ViewGroup viewGroup, Context context, Set set) {
        this.a = zzgdjVar;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    public static /* synthetic */ zzeri c(zzerh zzerhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d6)).booleanValue() && zzerhVar.b != null && zzerhVar.d.contains("banner")) {
            return new zzeri(Boolean.valueOf(zzerhVar.b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e6)).booleanValue() && zzerhVar.d.contains("native")) {
            Context context = zzerhVar.c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzeri(bool);
            }
        }
        return new zzeri(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzerg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerh.c(zzerh.this);
            }
        });
    }
}
