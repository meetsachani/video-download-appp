package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacz extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zada a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(zada zadaVar, Looper looper) {
        super(looper);
        this.a = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        String str;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i);
                Log.e("TransformedResultImpl", sb.toString());
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                str = "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                str = new String("Runtime exception on the transformation worker thread: ");
            }
            Log.e("TransformedResultImpl", str);
            throw runtimeException;
        }
        PendingResult<?> pendingResult = (PendingResult) message.obj;
        obj = this.a.e;
        synchronized (obj) {
            try {
                zadaVar = this.a.b;
                zada zadaVar2 = (zada) Preconditions.r(zadaVar);
                if (pendingResult == null) {
                    zadaVar2.m(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zadaVar2.m(((zacp) pendingResult).k());
                } else {
                    zadaVar2.l(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
