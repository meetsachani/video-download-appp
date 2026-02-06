package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import o.OL1;

/* renamed from: o.Zb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4883Zb {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public C4883Zb(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable a = ZI.a(this.a);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = D60.r(a).mutate();
                if (this.d) {
                    D60.o(mutate, this.b);
                }
                if (this.e) {
                    D60.p(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:16:0x0057, B:18:0x005f, B:19:0x0068, B:21:0x0070, B:11:0x003c, B:13:0x0044, B:15:0x004a), top: B:29:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:16:0x0057, B:18:0x005f, B:19:0x0068, B:21:0x0070, B:11:0x003c, B:13:0x0044, B:15:0x004a), top: B:29:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int u;
        int i2;
        int i3;
        int u2;
        Context context = this.a.getContext();
        int[] iArr = OL1.m.x3;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.a;
        C6516gH2.G1(compoundButton, compoundButton.getContext(), iArr, attributeSet, G.B(), i, 0);
        try {
            int i4 = OL1.m.z3;
            if (G.C(i4) && (u2 = G.u(i4, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(C3220Ic.b(compoundButton2.getContext(), u2));
                } catch (Resources.NotFoundException unused) {
                }
                i2 = OL1.m.A3;
                if (G.C(i2)) {
                    ZI.d(this.a, G.d(i2));
                }
                i3 = OL1.m.B3;
                if (G.C(i3)) {
                    ZI.e(this.a, X60.e(G.o(i3, -1), null));
                }
                G.I();
            }
            int i5 = OL1.m.y3;
            if (G.C(i5) && (u = G.u(i5, 0)) != 0) {
                CompoundButton compoundButton3 = this.a;
                compoundButton3.setButtonDrawable(C3220Ic.b(compoundButton3.getContext(), u));
            }
            i2 = OL1.m.A3;
            if (G.C(i2)) {
            }
            i3 = OL1.m.B3;
            if (G.C(i3)) {
            }
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    public void e() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
