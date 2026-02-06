package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C7025iN1;

/* renamed from: o.z91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11126z91 extends RecyclerView.o {
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = C7025iN1.n.Widget_MaterialComponents_MaterialDivider;
    @InterfaceC5670cr1
    public Drawable a;
    public int b;
    @JF
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final Rect h;

    public C11126z91(@InterfaceC5670cr1 Context context, int i2) {
        this(context, null, i2);
    }

    public void A(@InterfaceC5670cr1 Context context, @InterfaceC9154r30 int i2) {
        z(context.getResources().getDimensionPixelSize(i2));
    }

    public void B(boolean z) {
        this.g = z;
    }

    public void C(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i2 + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.d = i2;
    }

    public boolean D(int i2, @InterfaceC11300zs1 RecyclerView.AbstractC0370h<?> abstractC0370h) {
        return true;
    }

    public final boolean E(@InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 View view) {
        boolean z;
        int s0 = recyclerView.s0(view);
        RecyclerView.AbstractC0370h adapter = recyclerView.getAdapter();
        if (adapter != null && s0 == adapter.g() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (s0 == -1 || ((z && !this.g) || !D(s0, adapter))) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 RecyclerView.D d) {
        rect.set(0, 0, 0, 0);
        if (E(recyclerView, view)) {
            if (this.d == 1) {
                rect.bottom = this.b;
            } else if (C10920yI2.s(recyclerView)) {
                rect.left = this.b;
            } else {
                rect.right = this.b;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 RecyclerView.D d) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.d == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    public final void l(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RecyclerView recyclerView) {
        int height;
        int i2;
        int i3;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i2 = 0;
        }
        int i5 = i2 + this.e;
        int i6 = height - this.f;
        boolean s = C10920yI2.s(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (E(recyclerView, childAt)) {
                recyclerView.getLayoutManager().c0(childAt, this.h);
                int round = Math.round(childAt.getTranslationX());
                if (s) {
                    i4 = this.h.left + round;
                    i3 = this.b + i4;
                } else {
                    i3 = round + this.h.right;
                    i4 = i3 - this.b;
                }
                this.a.setBounds(i4, i5, i3, i6);
                this.a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.a.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void m(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RecyclerView recyclerView) {
        int width;
        int i2;
        int i3;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i2 = 0;
        }
        boolean s = C10920yI2.s(recyclerView);
        if (s) {
            i3 = this.f;
        } else {
            i3 = this.e;
        }
        int i5 = i2 + i3;
        if (s) {
            i4 = this.e;
        } else {
            i4 = this.f;
        }
        int i6 = width - i4;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (E(recyclerView, childAt)) {
                recyclerView.getLayoutManager().c0(childAt, this.h);
                int round = this.h.bottom + Math.round(childAt.getTranslationY());
                this.a.setBounds(i5, round - this.b, i6, round);
                this.a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.a.draw(canvas);
            }
        }
        canvas.restore();
    }

    @JF
    public int n() {
        return this.c;
    }

    @PK1
    public int o() {
        return this.f;
    }

    @PK1
    public int p() {
        return this.e;
    }

    @PK1
    public int q() {
        return this.b;
    }

    public int r() {
        return this.d;
    }

    public boolean s() {
        return this.g;
    }

    public void t(@JF int i2) {
        this.c = i2;
        Drawable r = D60.r(this.a);
        this.a = r;
        r.setTint(i2);
    }

    public void u(@InterfaceC5670cr1 Context context, @InterfaceC6509gG int i2) {
        t(C10201vM.g(context, i2));
    }

    public void v(@PK1 int i2) {
        this.f = i2;
    }

    public void w(@InterfaceC5670cr1 Context context, @InterfaceC9154r30 int i2) {
        v(context.getResources().getDimensionPixelOffset(i2));
    }

    public void x(@PK1 int i2) {
        this.e = i2;
    }

    public void y(@InterfaceC5670cr1 Context context, @InterfaceC9154r30 int i2) {
        x(context.getResources().getDimensionPixelOffset(i2));
    }

    public void z(@PK1 int i2) {
        this.b = i2;
    }

    public C11126z91(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i2) {
        this(context, attributeSet, C7025iN1.c.materialDividerStyle, i2);
    }

    public C11126z91(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i2, int i3) {
        this.h = new Rect();
        TypedArray k2 = C7608kn2.k(context, attributeSet, C7025iN1.o.W6, i2, k, new int[0]);
        this.c = C4297Tc1.a(context, k2, C7025iN1.o.X6).getDefaultColor();
        this.b = k2.getDimensionPixelSize(C7025iN1.o.a7, context.getResources().getDimensionPixelSize(C7025iN1.f.material_divider_thickness));
        this.e = k2.getDimensionPixelOffset(C7025iN1.o.Z6, 0);
        this.f = k2.getDimensionPixelOffset(C7025iN1.o.Y6, 0);
        this.g = k2.getBoolean(C7025iN1.o.b7, true);
        k2.recycle();
        this.a = new ShapeDrawable();
        t(this.c);
        C(i3);
    }
}
