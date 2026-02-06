package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzbcd {
    public final Context a;

    public zzbcd(Context context) {
        Preconditions.s(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a(Intent intent) {
        Preconditions.s(intent, "Intent can not be null");
        if (this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzbcc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        };
        Context context = this.a;
        if (((Boolean) com.google.android.gms.ads.internal.util.zzcd.a(context, callable)).booleanValue() && Wrappers.a(context).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }
}
