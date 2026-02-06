package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzfyg extends zzfxv {
    public Object[] d;
    public int e;

    public zzfyg() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, com.google.android.gms.internal.ads.zzfxw
    public final /* bridge */ /* synthetic */ zzfxw a(Object obj) {
        g(obj);
        return this;
    }

    public final zzfyg g(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int l = zzfyh.l(this.b);
            Object[] objArr = this.d;
            if (l <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a = zzfxu.a(hashCode);
                while (true) {
                    int i = a & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.c(obj);
                        return this;
                    } else if (!obj2.equals(obj)) {
                        a = i + 1;
                    } else {
                        return this;
                    }
                }
            }
        }
        this.d = null;
        super.c(obj);
        return this;
    }

    public final zzfyg h(Object... objArr) {
        if (this.d != null) {
            for (int i = 0; i < 2; i++) {
                g(objArr[i]);
            }
            return this;
        }
        e(objArr, 2);
        return this;
    }

    public final zzfyg i(Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            for (Object obj : iterable) {
                g(obj);
            }
            return this;
        }
        super.d(iterable);
        return this;
    }

    public final zzfyh j() {
        zzfyh U;
        boolean V;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (this.d == null || zzfyh.l(i) != this.d.length) {
                    U = zzfyh.U(this.b, this.a);
                    this.b = U.size();
                } else {
                    int i2 = this.b;
                    Object[] objArr = this.a;
                    V = zzfyh.V(i2, objArr.length);
                    if (V) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    int i3 = this.e;
                    Object[] objArr2 = this.d;
                    U = new zzfzu(objArr, i3, objArr2, objArr2.length - 1, this.b);
                }
                this.c = true;
                this.d = null;
                return U;
            }
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            return new zzgaf(obj);
        }
        return zzfzu.d1;
    }

    public zzfyg(int i, boolean z) {
        super(i);
        this.d = new Object[zzfyh.l(i)];
    }
}
