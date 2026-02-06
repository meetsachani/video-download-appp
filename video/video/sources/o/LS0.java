package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* loaded from: classes3.dex */
public class LS0 {
    public View a;
    public C4394Uc1 b;
    public ScrollView c;
    public final int[] d = new int[2];
    public final int[] e = new int[2];
    public final ViewTreeObserver.OnScrollChangedListener f = new a();

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            LS0.this.e();
        }
    }

    public LS0(View view, C4394Uc1 c4394Uc1, ScrollView scrollView) {
        this.a = view;
        this.b = c4394Uc1;
        this.c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.c = scrollView;
    }

    public void b(C4394Uc1 c4394Uc1) {
        this.b = c4394Uc1;
    }

    public void c(@InterfaceC5670cr1 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f);
    }

    public void d(@InterfaceC5670cr1 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f);
    }

    public void e() {
        ScrollView scrollView = this.c;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.c.getLocationInWindow(this.d);
                this.c.getChildAt(0).getLocationInWindow(this.e);
                int top = (this.a.getTop() - this.d[1]) + this.e[1];
                int height = this.a.getHeight();
                int height2 = this.c.getHeight();
                if (top < 0) {
                    this.b.z0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                    this.a.invalidate();
                    return;
                }
                int i = top + height;
                if (i > height2) {
                    this.b.z0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                    this.a.invalidate();
                    return;
                } else if (this.b.H() != 1.0f) {
                    this.b.z0(1.0f);
                    this.a.invalidate();
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}
