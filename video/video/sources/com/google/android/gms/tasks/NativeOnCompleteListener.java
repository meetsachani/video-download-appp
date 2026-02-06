package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    public final long a;

    @KeepForSdk
    public NativeOnCompleteListener(long j) {
        this.a = j;
    }

    @KeepForSdk
    public static void b(@InterfaceC5670cr1 Task<Object> task, long j) {
        task.e(new NativeOnCompleteListener(j));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void a(@InterfaceC5670cr1 Task<Object> task) {
        Object obj;
        String str;
        Exception q;
        if (task.v()) {
            obj = task.r();
            str = null;
        } else if (!task.t() && (q = task.q()) != null) {
            str = q.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(this.a, obj, task.v(), task.t(), str);
    }

    @KeepForSdk
    public native void nativeOnComplete(long j, @InterfaceC11300zs1 Object obj, boolean z, boolean z2, @InterfaceC11300zs1 String str);
}
