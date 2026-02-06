package com.facebook;

import android.os.Handler;
import com.facebook.S;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class n0 {
    @Nullable
    public final Handler a;
    @NotNull
    public final S b;
    public final long c;
    public long d;
    public long e;
    public long f;

    public n0(@Nullable Handler handler, @NotNull S s) {
        C6562gT0.p(s, "request");
        this.a = handler;
        this.b = s;
        M m = M.a;
        this.c = M.H();
    }

    public static final void g(S.b bVar, long j, long j2) {
        ((S.g) bVar).b(j, j2);
    }

    public final void b(long j) {
        long j2 = this.d + j;
        this.d = j2;
        if (j2 < this.e + this.c && j2 < this.f) {
            return;
        }
        f();
    }

    public final void c(long j) {
        this.f += j;
    }

    public final long d() {
        return this.f;
    }

    public final long e() {
        return this.d;
    }

    public final void f() {
        Boolean valueOf;
        if (this.d > this.e) {
            final S.b D = this.b.D();
            final long j = this.f;
            if (j > 0 && (D instanceof S.g)) {
                final long j2 = this.d;
                Handler handler = this.a;
                if (handler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(handler.post(new Runnable() { // from class: com.facebook.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            n0.g(S.b.this, j2, j);
                        }
                    }));
                }
                if (valueOf == null) {
                    ((S.g) D).b(j2, j);
                }
                this.e = this.d;
            }
        }
    }
}
