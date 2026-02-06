package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import o.C7025iN1;
import o.OL1;

/* renamed from: o.Dl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2755Dl {
    @PK1
    public int a;
    @PK1
    public int b;
    public float c;
    public boolean d;
    @InterfaceC5670cr1
    public int[] e = new int[0];
    @JF
    public int f;
    public int g;
    public int h;
    @PK1
    public int i;
    @PK1
    public int j;
    @PK1
    public int k;
    @PK1
    public int l;
    @PK1
    public int m;
    @InterfaceC2501Av0(from = 0.10000000149011612d, to = SettingsJsonConstants.v)
    public float n;

    public AbstractC2755Dl(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_progress_track_thickness);
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.W, i, i2, new int[0]);
        this.a = C4297Tc1.d(context, k, C7025iN1.o.h0, dimensionPixelSize);
        TypedValue peekValue = k.peekValue(C7025iN1.o.g0);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, k.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = k.getInt(C7025iN1.o.d0, 0);
        this.h = k.getInt(C7025iN1.o.Y, 0);
        this.i = k.getDimensionPixelSize(C7025iN1.o.b0, 0);
        int abs = Math.abs(k.getDimensionPixelSize(C7025iN1.o.k0, 0));
        this.j = Math.abs(k.getDimensionPixelSize(C7025iN1.o.l0, abs));
        this.k = Math.abs(k.getDimensionPixelSize(C7025iN1.o.m0, abs));
        this.l = Math.abs(k.getDimensionPixelSize(C7025iN1.o.i0, 0));
        this.m = k.getDimensionPixelSize(C7025iN1.o.j0, 0);
        this.n = k.getFloat(C7025iN1.o.Z, 1.0f);
        e(context, k);
        f(context, k);
        k.recycle();
    }

    public int a() {
        if (this.d) {
            return (int) (this.a * this.c);
        }
        return this.b;
    }

    public boolean b(boolean z) {
        if (this.l > 0) {
            if (z || this.k <= 0) {
                if (z && this.j > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.g != 0) {
            return true;
        }
        return false;
    }

    public final void e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray) {
        int i = C7025iN1.o.a0;
        if (!typedArray.hasValue(i)) {
            this.e = new int[]{C9179r91.b(context, OL1.b.J0, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.e = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.e = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void f(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray) {
        int i = C7025iN1.o.f0;
        if (typedArray.hasValue(i)) {
            this.f = typedArray.getColor(i, -1);
            return;
        }
        this.f = this.e[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f = C9179r91.a(this.f, (int) (f * 255.0f));
    }

    public boolean g() {
        if (this.d && this.c == 0.5f) {
            return true;
        }
        return false;
    }

    @InterfaceC2591Bt
    public void h() {
        if (this.i >= 0) {
            return;
        }
        throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
    }
}
