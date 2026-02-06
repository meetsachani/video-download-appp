package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import o.EC1;
import o.InterfaceC10571ws1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgg implements zzgb {
    @InterfaceC8710pF0("GservicesLoader.class")
    public static zzgg c;
    @InterfaceC10571ws1
    public final Context a;
    @InterfaceC10571ws1
    public final ContentObserver b;

    private zzgg() {
        this.a = null;
        this.b = null;
    }

    public static zzgg a(Context context) {
        zzgg zzggVar;
        zzgg zzggVar2;
        synchronized (zzgg.class) {
            try {
                if (c == null) {
                    if (EC1.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        zzggVar2 = new zzgg(context);
                    } else {
                        zzggVar2 = new zzgg();
                    }
                    c = zzggVar2;
                }
                zzggVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzggVar;
    }

    public static synchronized void b() {
        Context context;
        synchronized (zzgg.class) {
            try {
                zzgg zzggVar = c;
                if (zzggVar != null && (context = zzggVar.a) != null && zzggVar.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String c(String str) {
        return zzfr.a(this.a.getContentResolver(), str, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    @InterfaceC10571ws1
    /* renamed from: d */
    public final String w(final String str) {
        Context context = this.a;
        if (context != null && !zzfw.b(context)) {
            try {
                return (String) zzge.a(new zzgd() { // from class: com.google.android.gms.internal.measurement.zzgf
                    {
                        zzgg.this = this;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzgd
                    public final Object a() {
                        return zzgg.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    public zzgg(Context context) {
        this.a = context;
        zzgi zzgiVar = new zzgi(this, null);
        this.b = zzgiVar;
        context.getContentResolver().registerContentObserver(zzfr.a, true, zzgiVar);
    }
}
