package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: o.pH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8720pH2 {

    /* renamed from: o.pH2$a */
    /* loaded from: classes.dex */
    public static final class a implements B02<View> {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // o.B02
        public Iterator<View> iterator() {
            return C8720pH2.k(this.a);
        }
    }

    /* renamed from: o.pH2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<View, Iterator<? extends View>> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final Iterator<View> invoke(View view) {
            ViewGroup viewGroup;
            B02<View> e;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null || (e = C8720pH2.e(viewGroup)) == null) {
                return null;
            }
            return e.iterator();
        }
    }

    /* renamed from: o.pH2$c */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<View>, JW0 {
        public int X;
        public final /* synthetic */ ViewGroup Y;

        public c(ViewGroup viewGroup) {
            this.Y = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.Y;
            int i = this.X;
            this.X = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.Y;
            int i = this.X - 1;
            this.X = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: o.pH2$d */
    /* loaded from: classes.dex */
    public static final class d implements B02<View> {
        public final /* synthetic */ ViewGroup a;

        public d(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // o.B02
        public Iterator<View> iterator() {
            return new C6909hu2(C8720pH2.e(this.a).iterator(), b.X);
        }
    }

    public static final boolean a(ViewGroup viewGroup, View view) {
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    public static final void b(ViewGroup viewGroup, HA0<? super View, C7458kA2> ha0) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ha0.invoke(viewGroup.getChildAt(i));
        }
    }

    public static final void c(ViewGroup viewGroup, VA0<? super Integer, ? super View, C7458kA2> va0) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            va0.i(Integer.valueOf(i), viewGroup.getChildAt(i));
        }
    }

    public static final View d(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final B02<View> e(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final B02<View> f(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final C11197zR0 g(ViewGroup viewGroup) {
        return C5075aO1.W1(0, viewGroup.getChildCount());
    }

    public static final int h(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean i(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean j(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<View> k(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final void l(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }

    public static final void m(ViewGroup viewGroup, View view) {
        viewGroup.addView(view);
    }

    public static final void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
