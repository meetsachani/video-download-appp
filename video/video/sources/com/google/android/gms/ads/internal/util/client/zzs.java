package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzs {
    public static Context a(Context context) throws zzr {
        return c(context).b();
    }

    public static Object b(Context context, String str, zzq zzqVar) throws zzr {
        try {
            return zzqVar.b(c(context).d(str));
        } catch (Exception e) {
            throw new zzr(e);
        }
    }

    public static DynamiteModule c(Context context) throws zzr {
        try {
            return DynamiteModule.e(context, DynamiteModule.f, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzr(e);
        }
    }
}
