package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import o.OL1;

/* loaded from: classes.dex */
public abstract class I extends ViewGroup {
    public static final int g1 = 200;
    public final b Y0;
    public final Context Z0;
    public ActionMenuView a1;
    public androidx.appcompat.widget.a b1;
    public int c1;
    public ZH2 d1;
    public boolean e1;
    public boolean f1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I.this.o();
        }
    }

    /* loaded from: classes.dex */
    public class b implements InterfaceC5295bI2 {
        public boolean a = false;
        public int b;

        public b() {
        }

        @Override // o.InterfaceC5295bI2
        public void a(View view) {
            this.a = true;
        }

        @Override // o.InterfaceC5295bI2
        public void b(View view) {
            if (this.a) {
                return;
            }
            I i = I.this;
            i.d1 = null;
            I.super.setVisibility(this.b);
        }

        @Override // o.InterfaceC5295bI2
        public void c(View view) {
            I.super.setVisibility(0);
            this.a = false;
        }

        public b d(ZH2 zh2, int i) {
            I.this.d1 = zh2;
            this.b = i;
            return this;
        }
    }

    public I(Context context) {
        this(context, null);
    }

    public static int k(int i, int i2, boolean z) {
        if (z) {
            return i - i2;
        }
        return i + i2;
    }

    public void c(int i) {
        n(i, 200L).x();
    }

    public boolean d() {
        if (i() && getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void e() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            aVar.B();
        }
    }

    public boolean f() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.E();
        }
        return false;
    }

    public boolean g() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        if (this.d1 != null) {
            return this.Y0.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.c1;
    }

    public boolean h() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.H();
        }
        return false;
    }

    public boolean i() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null && aVar.I()) {
            return true;
        }
        return false;
    }

    public int j(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int l(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public void m() {
        post(new a());
    }

    public ZH2 n(int i, long j) {
        ZH2 zh2 = this.d1;
        if (zh2 != null) {
            zh2.d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ZH2 b2 = C6516gH2.h(this).b(1.0f);
            b2.r(j);
            b2.t(this.Y0.d(b2, i));
            return b2;
        }
        ZH2 b3 = C6516gH2.h(this).b(0.0f);
        b3.r(j);
        b3.t(this.Y0.d(b3, i));
        return b3;
    }

    public boolean o() {
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            return aVar.Q();
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, OL1.m.a, OL1.b.f, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(OL1.m.f572o, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.b1;
        if (aVar != null) {
            aVar.J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1 = false;
        }
        if (!this.f1) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e1 = false;
        }
        if (!this.e1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.e1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.e1 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.c1 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ZH2 zh2 = this.d1;
            if (zh2 != null) {
                zh2.d();
            }
            super.setVisibility(i);
        }
    }

    public I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(OL1.b.c, typedValue, true) && typedValue.resourceId != 0) {
            this.Z0 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.Z0 = context;
        }
    }
}
