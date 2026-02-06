package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzc {
    @InterfaceC11300zs1
    public Object a;
    public boolean b = false;
    public final /* synthetic */ BaseGmsClient c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.c = baseGmsClient;
        this.a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.m1;
        synchronized (arrayList) {
            arrayList2 = this.c.m1;
            arrayList2.remove(this);
        }
    }
}
