package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import o.HT1;
import o.InterfaceC2501Av0;
import o.InterfaceC5670cr1;
import o.InterfaceC8157mz;

/* loaded from: classes3.dex */
public abstract class a {
    public float a;
    public float b;

    /* renamed from: com.google.android.material.carousel.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0121a {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    public EnumC0121a e() {
        return EnumC0121a.CONTAINED;
    }

    public void f(Context context) {
        float f = this.a;
        if (f <= 0.0f) {
            f = b.h(context);
        }
        this.a = f;
        float f2 = this.b;
        if (f2 <= 0.0f) {
            f2 = b.g(context);
        }
        this.b = f2;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public abstract c g(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, @InterfaceC5670cr1 View view);

    public void h(float f) {
        this.b = f;
    }

    public void i(float f) {
        this.a = f;
    }

    @HT1({HT1.a.Y})
    public boolean j(@InterfaceC5670cr1 InterfaceC8157mz interfaceC8157mz, int i) {
        return false;
    }
}
