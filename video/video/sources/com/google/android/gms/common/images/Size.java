package com.google.android.gms.common.images;

import o.AbstractC4253Sp2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class Size {
    public final int a;
    public final int b;

    public Size(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @InterfaceC5670cr1
    public static Size c(@InterfaceC5670cr1 String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw d(str);
                }
            }
            throw d(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    public static NumberFormatException d(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append(AbstractC4253Sp2.b.x1);
        throw new NumberFormatException(sb.toString());
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.a == size.a && this.b == size.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @InterfaceC5670cr1
    public String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
