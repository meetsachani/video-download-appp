package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import o.AbstractServiceConnectionC10961yT;
import o.C9743tT;
import o.CT;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbdw {
    @InterfaceC11300zs1
    public CT a;
    @InterfaceC11300zs1
    public C9743tT b;
    @InterfaceC11300zs1
    public AbstractServiceConnectionC10961yT c;
    @InterfaceC11300zs1
    public zzbdv d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhgl.a(context));
                    }
                }
            }
        }
        return false;
    }

    @InterfaceC11300zs1
    public final CT a() {
        C9743tT c9743tT = this.b;
        if (c9743tT == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = c9743tT.k(null);
        }
        return this.a;
    }

    public final void b(Activity activity) {
        String a;
        if (this.b == null && (a = zzhgl.a(activity)) != null) {
            zzhgm zzhgmVar = new zzhgm(this);
            this.c = zzhgmVar;
            C9743tT.b(activity, a, zzhgmVar);
        }
    }

    public final void c(C9743tT c9743tT) {
        this.b = c9743tT;
        c9743tT.n(0L);
        zzbdv zzbdvVar = this.d;
        if (zzbdvVar != null) {
            zzbdvVar.a();
        }
    }

    public final void d() {
        this.b = null;
        this.a = null;
    }

    public final void e(zzbdv zzbdvVar) {
        this.d = zzbdvVar;
    }

    public final void f(Activity activity) {
        AbstractServiceConnectionC10961yT abstractServiceConnectionC10961yT = this.c;
        if (abstractServiceConnectionC10961yT == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC10961yT);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
