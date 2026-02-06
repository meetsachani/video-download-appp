package com.facebook.bolts;

import java.io.Closeable;
import o.C6562gT0;
import o.C7458kA2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class i implements Closeable {
    @Nullable
    public Runnable X;
    public boolean Y;
    @Nullable
    public k Z;

    public i(@NotNull k kVar, @Nullable Runnable runnable) {
        C6562gT0.p(kVar, "tokenSource");
        this.X = runnable;
        this.Z = kVar;
    }

    public final void a() {
        synchronized (this) {
            d();
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
            }
            close();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.Y) {
                return;
            }
            this.Y = true;
            k kVar = this.Z;
            if (kVar != null) {
                kVar.p(this);
            }
            this.Z = null;
            this.X = null;
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final void d() {
        if (!this.Y) {
            return;
        }
        throw new IllegalStateException("Object already closed");
    }
}
