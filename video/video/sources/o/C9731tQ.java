package o;

import o.ExecutorC9488sQ;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9731tQ {
    @InterfaceC8046mW0(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof ExecutorC9488sQ.c;
    }

    @InterfaceC8046mW0(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        if ((thread instanceof ExecutorC9488sQ.c) && ((ExecutorC9488sQ.c) thread).Z == ExecutorC9488sQ.d.X) {
            return true;
        }
        return false;
    }
}
