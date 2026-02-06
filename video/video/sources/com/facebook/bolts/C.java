package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class C<TResult> {
    @NotNull
    public final B<TResult> a = new B<>();

    @NotNull
    public final B<TResult> a() {
        return this.a;
    }

    public final void b() {
        if (e()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }

    public final void c(@Nullable Exception exc) {
        if (f(exc)) {
            return;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    public final void d(@Nullable TResult tresult) {
        if (g(tresult)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public final boolean e() {
        return this.a.h0();
    }

    public final boolean f(@Nullable Exception exc) {
        return this.a.i0(exc);
    }

    public final boolean g(@Nullable TResult tresult) {
        return this.a.j0(tresult);
    }
}
