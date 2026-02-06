package com.google.android.gms.tasks;

import com.facebook.login.C;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, @InterfaceC11300zs1 Throwable th) {
        super(str, th);
    }

    @InterfaceC5670cr1
    public static IllegalStateException a(@InterfaceC5670cr1 Task<?> task) {
        String str;
        if (!task.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception q = task.q();
        if (q != null) {
            str = C.L;
        } else if (task.v()) {
            str = "result ".concat(String.valueOf(task.r()));
        } else if (task.t()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), q);
    }
}
