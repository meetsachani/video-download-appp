package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzfdt {
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static Task a;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static AppSetIdClient b;
    public static final Object c = new Object();

    @InterfaceC11300zs1
    public static Task a(Context context) {
        Task task;
        b(context, false);
        synchronized (c) {
            task = a;
        }
        return task;
    }

    public static void b(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = AppSet.a(context);
                }
                Task task = a;
                if (task == null || ((task.u() && !a.v()) || (z && a.u()))) {
                    a = ((AppSetIdClient) Preconditions.s(b, "the appSetIdClient shouldn't be null")).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
