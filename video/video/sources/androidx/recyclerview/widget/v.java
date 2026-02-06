package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import o.C10861y4;
import o.C6516gH2;
import o.D4;
import o.Q3;

/* loaded from: classes.dex */
public class v extends Q3 {
    public final RecyclerView d;
    public final a e;

    /* loaded from: classes.dex */
    public static class a extends Q3 {
        public final v d;
        public Map<View, Q3> e = new WeakHashMap();

        public a(v vVar) {
            this.d = vVar;
        }

        @Override // o.Q3
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                return q3.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // o.Q3
        public D4 b(View view) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                return q3.b(view);
            }
            return super.b(view);
        }

        @Override // o.Q3
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                q3.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // o.Q3
        public void g(View view, C10861y4 c10861y4) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().j1(view, c10861y4);
                Q3 q3 = this.e.get(view);
                if (q3 != null) {
                    q3.g(view, c10861y4);
                    return;
                } else {
                    super.g(view, c10861y4);
                    return;
                }
            }
            super.g(view, c10861y4);
        }

        @Override // o.Q3
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                q3.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // o.Q3
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            Q3 q3 = this.e.get(viewGroup);
            if (q3 != null) {
                return q3.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                Q3 q3 = this.e.get(view);
                if (q3 != null) {
                    if (q3.j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().D1(view, i, bundle);
            }
            return super.j(view, i, bundle);
        }

        @Override // o.Q3
        public void l(View view, int i) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                q3.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // o.Q3
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            Q3 q3 = this.e.get(view);
            if (q3 != null) {
                q3.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public Q3 n(View view) {
            return this.e.remove(view);
        }

        public void o(View view) {
            Q3 G = C6516gH2.G(view);
            if (G != null && G != this) {
                this.e.put(view, G);
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.d = recyclerView;
        Q3 n = n();
        if (n != null && (n instanceof a)) {
            this.e = (a) n;
        } else {
            this.e = new a(this);
        }
    }

    @Override // o.Q3
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().f1(accessibilityEvent);
            }
        }
    }

    @Override // o.Q3
    public void g(View view, C10861y4 c10861y4) {
        super.g(view, c10861y4);
        if (!o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().i1(c10861y4);
        }
    }

    @Override // o.Q3
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (!o() && this.d.getLayoutManager() != null) {
            return this.d.getLayoutManager().B1(i, bundle);
        }
        return false;
    }

    public Q3 n() {
        return this.e;
    }

    public boolean o() {
        return this.d.H0();
    }
}
