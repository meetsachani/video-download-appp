package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: o.qz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9137qz extends androidx.recyclerview.widget.y {
    public static final float g = 100.0f;
    public static final float h = 50.0f;
    public final boolean e;
    public RecyclerView f;

    /* renamed from: o.qz$a */
    /* loaded from: classes3.dex */
    public class a extends androidx.recyclerview.widget.o {
        public final /* synthetic */ RecyclerView.p x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, RecyclerView.p pVar) {
            super(context);
            this.x = pVar;
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.C
        public void p(View view, RecyclerView.D d, RecyclerView.C.a aVar) {
            if (C9137qz.this.f != null) {
                C9137qz c9137qz = C9137qz.this;
                int[] o2 = c9137qz.o(c9137qz.f.getLayoutManager(), view, true);
                int i = o2[0];
                int i2 = o2[1];
                int x = x(Math.max(Math.abs(i), Math.abs(i2)));
                if (x > 0) {
                    aVar.l(i, i2, x, this.j);
                }
            }
        }

        @Override // androidx.recyclerview.widget.o
        public float w(DisplayMetrics displayMetrics) {
            float f;
            float f2;
            if (this.x.t()) {
                f = displayMetrics.densityDpi;
                f2 = 50.0f;
            } else {
                f = displayMetrics.densityDpi;
                f2 = 100.0f;
            }
            return f2 / f;
        }
    }

    public C9137qz() {
        this(true);
    }

    private boolean r(RecyclerView.p pVar, int i, int i2) {
        if (pVar.s()) {
            if (i <= 0) {
                return false;
            }
            return true;
        } else if (i2 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean s(RecyclerView.p pVar) {
        PointF c;
        int f = pVar.f();
        if (!(pVar instanceof RecyclerView.C.b) || (c = ((RecyclerView.C.b) pVar).c(f - 1)) == null) {
            return false;
        }
        if (c.x >= 0.0f && c.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    public void b(@InterfaceC11300zs1 RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.y
    @InterfaceC11300zs1
    public int[] c(@InterfaceC5670cr1 RecyclerView.p pVar, @InterfaceC5670cr1 View view) {
        return o(pVar, view, false);
    }

    @Override // androidx.recyclerview.widget.y
    @InterfaceC11300zs1
    public RecyclerView.C e(@InterfaceC5670cr1 RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.C.b) {
            return new a(this.f.getContext(), pVar);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    @InterfaceC11300zs1
    public View h(RecyclerView.p pVar) {
        return q(pVar);
    }

    @Override // androidx.recyclerview.widget.y
    public int i(RecyclerView.p pVar, int i, int i2) {
        int f;
        int i3;
        if (!this.e || (f = pVar.f()) == 0) {
            return -1;
        }
        int V = pVar.V();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < V; i6++) {
            View U = pVar.U(i6);
            if (U != null) {
                int p = p(U, (CarouselLayoutManager) pVar, false);
                if (p <= 0 && p > i5) {
                    view2 = U;
                    i5 = p;
                }
                if (p >= 0 && p < i4) {
                    view = U;
                    i4 = p;
                }
            }
        }
        boolean r = r(pVar, i, i2);
        if (r && view != null) {
            return pVar.w0(view);
        }
        if (!r && view2 != null) {
            return pVar.w0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int w0 = pVar.w0(view);
        if (s(pVar) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = w0 + i3;
        if (i7 < 0 || i7 >= f) {
            return -1;
        }
        return i7;
    }

    public final int[] o(@InterfaceC5670cr1 RecyclerView.p pVar, @InterfaceC5670cr1 View view, boolean z) {
        if (!(pVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int p = p(view, (CarouselLayoutManager) pVar, z);
        if (pVar.s()) {
            return new int[]{p, 0};
        }
        if (pVar.t()) {
            return new int[]{0, p};
        }
        return new int[]{0, 0};
    }

    public final int p(@InterfaceC5670cr1 View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.T2(carouselLayoutManager.w0(view), z);
    }

    @InterfaceC11300zs1
    public final View q(RecyclerView.p pVar) {
        int V = pVar.V();
        View view = null;
        if (V != 0 && (pVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) pVar;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < V; i2++) {
                View U = pVar.U(i2);
                int abs = Math.abs(carouselLayoutManager.T2(pVar.w0(U), false));
                if (abs < i) {
                    view = U;
                    i = abs;
                }
            }
        }
        return view;
    }

    public C9137qz(boolean z) {
        this.e = z;
    }
}
