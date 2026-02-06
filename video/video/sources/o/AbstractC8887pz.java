package o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: o.pz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8887pz {
    public final int a;

    /* renamed from: o.pz$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8887pz {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // o.AbstractC8887pz
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.top;
            float f2 = rectF3.top;
            if (f < f2 && rectF2.bottom > f2) {
                float f3 = f2 - f;
                rectF.top += f3;
                rectF3.top += f3;
            }
            float f4 = rectF2.bottom;
            float f5 = rectF3.bottom;
            if (f4 > f5 && rectF2.top < f5) {
                float f6 = f4 - f5;
                rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
            }
        }

        @Override // o.AbstractC8887pz
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.b.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // o.AbstractC8887pz
        public float f(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // o.AbstractC8887pz
        public RectF g(float f, float f2, float f3, float f4) {
            return new RectF(0.0f, f3, f2, f - f3);
        }

        @Override // o.AbstractC8887pz
        public int h() {
            return this.b.j0();
        }

        @Override // o.AbstractC8887pz
        public int i() {
            return h();
        }

        @Override // o.AbstractC8887pz
        public int j() {
            return this.b.s0();
        }

        @Override // o.AbstractC8887pz
        public int k() {
            return this.b.D0() - this.b.t0();
        }

        @Override // o.AbstractC8887pz
        public int l() {
            return m();
        }

        @Override // o.AbstractC8887pz
        public int m() {
            return 0;
        }

        @Override // o.AbstractC8887pz
        public void n(View view, int i, int i2) {
            int j = j();
            this.b.T0(view, j, i, j + e(view), i2);
        }

        @Override // o.AbstractC8887pz
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = floor;
                rectF.top = Math.min(rectF.top, floor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = ceil;
                rectF.bottom = Math.max(ceil, rectF.bottom);
            }
        }

        @Override // o.AbstractC8887pz
        public void p(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }
    }

    /* renamed from: o.pz$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC8887pz {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // o.AbstractC8887pz
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.left;
            float f2 = rectF3.left;
            if (f < f2 && rectF2.right > f2) {
                float f3 = f2 - f;
                rectF.left += f3;
                rectF2.left += f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF3.right;
            if (f4 > f5 && rectF2.left < f5) {
                float f6 = f4 - f5;
                rectF.right = Math.max(rectF.right - f6, rectF.left);
                rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
            }
        }

        @Override // o.AbstractC8887pz
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.b.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // o.AbstractC8887pz
        public float f(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // o.AbstractC8887pz
        public RectF g(float f, float f2, float f3, float f4) {
            return new RectF(f4, 0.0f, f2 - f4, f);
        }

        @Override // o.AbstractC8887pz
        public int h() {
            return this.b.j0() - this.b.q0();
        }

        @Override // o.AbstractC8887pz
        public int i() {
            if (this.b.e3()) {
                return j();
            }
            return k();
        }

        @Override // o.AbstractC8887pz
        public int j() {
            return 0;
        }

        @Override // o.AbstractC8887pz
        public int k() {
            return this.b.D0();
        }

        @Override // o.AbstractC8887pz
        public int l() {
            if (this.b.e3()) {
                return k();
            }
            return j();
        }

        @Override // o.AbstractC8887pz
        public int m() {
            return this.b.v0();
        }

        @Override // o.AbstractC8887pz
        public void n(View view, int i, int i2) {
            int m = m();
            this.b.T0(view, i, m, i2, m + e(view));
        }

        @Override // o.AbstractC8887pz
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float floor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = floor;
                rectF.left = Math.min(rectF.left, floor);
            }
            if (rectF2.left >= rectF3.right) {
                float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = ceil;
                rectF.right = Math.max(ceil, rectF.right);
            }
        }

        @Override // o.AbstractC8887pz
        public void p(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }
    }

    public /* synthetic */ AbstractC8887pz(int i, a aVar) {
        this(i);
    }

    public static AbstractC8887pz b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static AbstractC8887pz c(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i != 0) {
            if (i == 1) {
                return d(carouselLayoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return b(carouselLayoutManager);
    }

    public static AbstractC8887pz d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int e(View view);

    public abstract float f(RecyclerView.q qVar);

    public abstract RectF g(float f, float f2, float f3, float f4);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract void n(View view, int i, int i2);

    public abstract void o(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void p(View view, Rect rect, float f, float f2);

    public AbstractC8887pz(int i) {
        this.a = i;
    }
}
