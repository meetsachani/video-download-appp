package com.google.android.gms.internal.ads;

import android.text.Layout;
import o.C10928yK2;

/* loaded from: classes2.dex */
final class zzamb {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
        if (r6 == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcs a() {
        Layout.Alignment alignment;
        int i;
        CharSequence charSequence;
        float f = this.h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i2 = this.d;
            if (i2 != 4) {
                if (i2 != 5) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
            } else {
                f = 0.0f;
            }
        }
        int i3 = this.i;
        if (i3 == Integer.MIN_VALUE) {
            int i4 = this.d;
            if (i4 != 1) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            i3 = 1;
                        }
                    }
                }
                i3 = 2;
            }
            i3 = 0;
        }
        zzcs zzcsVar = new zzcs();
        int i5 = this.d;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            zzdx.f(C10928yK2.C, "Unknown textAlignment: " + i5);
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            zzcsVar.m(alignment);
            float f3 = this.e;
            int i6 = this.f;
            i = (f3 > (-3.4028235E38f) ? 1 : (f3 == (-3.4028235E38f) ? 0 : -1));
            if (i != 0 || i6 != 0 || (f3 >= 0.0f && f3 <= 1.0f)) {
                if (i == 0) {
                    f2 = f3;
                }
                zzcsVar.e(f2, i6);
                zzcsVar.f(this.g);
                zzcsVar.h(f);
                zzcsVar.i(i3);
                float f4 = this.j;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException(String.valueOf(i3));
                        }
                    } else if (f <= 0.5f) {
                        f += f;
                    } else {
                        float f5 = 1.0f - f;
                        f = f5 + f5;
                    }
                } else {
                    f = 1.0f - f;
                }
                zzcsVar.k(Math.min(f4, f));
                zzcsVar.o(this.k);
                charSequence = this.c;
                if (charSequence != null) {
                    zzcsVar.l(charSequence);
                }
                return zzcsVar;
            }
            f2 = 1.0f;
            zzcsVar.e(f2, i6);
            zzcsVar.f(this.g);
            zzcsVar.h(f);
            zzcsVar.i(i3);
            float f42 = this.j;
            if (i3 != 0) {
            }
            zzcsVar.k(Math.min(f42, f));
            zzcsVar.o(this.k);
            charSequence = this.c;
            if (charSequence != null) {
            }
            return zzcsVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        zzcsVar.m(alignment);
        float f32 = this.e;
        int i62 = this.f;
        i = (f32 > (-3.4028235E38f) ? 1 : (f32 == (-3.4028235E38f) ? 0 : -1));
        if (i != 0) {
        }
        if (i == 0) {
        }
        zzcsVar.e(f2, i62);
        zzcsVar.f(this.g);
        zzcsVar.h(f);
        zzcsVar.i(i3);
        float f422 = this.j;
        if (i3 != 0) {
        }
        zzcsVar.k(Math.min(f422, f));
        zzcsVar.o(this.k);
        charSequence = this.c;
        if (charSequence != null) {
        }
        return zzcsVar;
    }
}
