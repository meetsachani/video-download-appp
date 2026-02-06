package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
final class zzfrr {
    public static zzfrr c;
    public final String a;
    public final SharedPreferences b;

    public zzfrr(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfrr b(Context context) {
        if (c == null) {
            c = new zzfrr(context);
        }
        return c;
    }

    public final long a(String str, long j) {
        return this.b.getLong(str, -1L);
    }

    @InterfaceC10571ws1
    public final String c(String str, String str2) {
        return this.b.getString(str, null);
    }

    public final void d(String str, Object obj) throws IOException {
        boolean commit;
        if (obj instanceof String) {
            commit = this.b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else if (obj instanceof Integer) {
            commit = this.b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        } else {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.a;
            Log.e("GpidLifecycleSPHandler", "Unexpected object class " + valueOf + " for app " + str2);
            String str3 = this.a;
            throw new IOException("Failed to store " + str + " for app " + str3);
        }
        if (commit) {
            return;
        }
        String str32 = this.a;
        throw new IOException("Failed to store " + str + " for app " + str32);
    }

    public final void e(String str) throws IOException {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.a;
        throw new IOException("Failed to remove " + str + " for app " + str2);
    }

    public final boolean f(String str, boolean z) {
        return this.b.getBoolean(str, true);
    }

    public final boolean g(String str) {
        return this.b.contains(str);
    }
}
