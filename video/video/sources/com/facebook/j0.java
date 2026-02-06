package com.facebook;

import android.os.Handler;
import com.facebook.X;
import com.facebook.internal.H;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class j0 extends FilterOutputStream implements l0 {
    @NotNull
    public final X X;
    @NotNull
    public final Map<S, n0> Y;
    public final long Y0;
    public final long Z;
    public long Z0;
    public long a1;
    @Nullable
    public n0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull OutputStream outputStream, @NotNull X x, @NotNull Map<S, n0> map, long j) {
        super(outputStream);
        C6562gT0.p(outputStream, "out");
        C6562gT0.p(x, "requests");
        C6562gT0.p(map, "progressMap");
        this.X = x;
        this.Y = map;
        this.Z = j;
        M m = M.a;
        this.Y0 = M.H();
    }

    private final void f(long j) {
        n0 n0Var = this.b1;
        if (n0Var != null) {
            n0Var.b(j);
        }
        long j2 = this.Z0 + j;
        this.Z0 = j2;
        if (j2 < this.a1 + this.Y0 && j2 < this.Z) {
            return;
        }
        j();
    }

    public static final void k(X.a aVar, j0 j0Var) {
        C6562gT0.p(aVar, "$callback");
        C6562gT0.p(j0Var, "this$0");
        ((X.c) aVar).b(j0Var.X, j0Var.h(), j0Var.i());
    }

    @Override // com.facebook.l0
    public void a(@Nullable S s) {
        n0 n0Var;
        if (s != null) {
            n0Var = this.Y.get(s);
        } else {
            n0Var = null;
        }
        this.b1 = n0Var;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        for (n0 n0Var : this.Y.values()) {
            n0Var.f();
        }
        j();
    }

    public final long h() {
        return this.Z0;
    }

    public final long i() {
        return this.Z;
    }

    public final void j() {
        Boolean valueOf;
        if (this.Z0 > this.a1) {
            for (final X.a aVar : this.X.B()) {
                if (aVar instanceof X.c) {
                    Handler w = this.X.w();
                    if (w == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(w.post(new Runnable() { // from class: com.facebook.i0
                            @Override // java.lang.Runnable
                            public final void run() {
                                j0.k(X.a.this, this);
                            }
                        }));
                    }
                    if (valueOf == null) {
                        ((X.c) aVar).b(this.X, this.Z0, this.Z);
                    }
                }
            }
            this.a1 = this.Z0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] bArr) throws IOException {
        C6562gT0.p(bArr, H.a.b);
        ((FilterOutputStream) this).out.write(bArr);
        f(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] bArr, int i, int i2) throws IOException {
        C6562gT0.p(bArr, H.a.b);
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        f(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        f(1L);
    }
}
