package com.facebook;

import android.os.Handler;
import com.facebook.internal.H;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class h0 extends OutputStream implements l0 {
    @Nullable
    public final Handler X;
    @NotNull
    public final Map<S, n0> Y = new HashMap();
    @Nullable
    public n0 Y0;
    @Nullable
    public S Z;
    public int Z0;

    public h0(@Nullable Handler handler) {
        this.X = handler;
    }

    @Override // com.facebook.l0
    public void a(@Nullable S s) {
        n0 n0Var;
        this.Z = s;
        if (s != null) {
            n0Var = this.Y.get(s);
        } else {
            n0Var = null;
        }
        this.Y0 = n0Var;
    }

    public final void d(long j) {
        S s = this.Z;
        if (s == null) {
            return;
        }
        if (this.Y0 == null) {
            n0 n0Var = new n0(this.X, s);
            this.Y0 = n0Var;
            this.Y.put(s, n0Var);
        }
        n0 n0Var2 = this.Y0;
        if (n0Var2 != null) {
            n0Var2.c(j);
        }
        this.Z0 += (int) j;
    }

    public final int f() {
        return this.Z0;
    }

    @NotNull
    public final Map<S, n0> h() {
        return this.Y;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, H.a.b);
        d(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, H.a.b);
        d(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        d(1L);
    }
}
