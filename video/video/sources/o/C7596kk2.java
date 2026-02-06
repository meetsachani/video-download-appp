package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C8736pL2;
import o.RL2;

/* renamed from: o.kk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7596kk2 {
    public final View a;
    public final ArrayList<c> b = new ArrayList<>();
    public C9246rQ0 c;
    public C9246rQ0 d;
    public int e;

    /* renamed from: o.kk2$a */
    /* loaded from: classes.dex */
    public class a extends View {
        public final /* synthetic */ ViewGroup Y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.Y0 = viewGroup;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            int i;
            Drawable background = this.Y0.getBackground();
            if (background instanceof ColorDrawable) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            if (C7596kk2.this.e != i) {
                C7596kk2.this.e = i;
                for (int size = C7596kk2.this.b.size() - 1; size >= 0; size--) {
                    ((c) C7596kk2.this.b.get(size)).e(i);
                }
            }
        }
    }

    /* renamed from: o.kk2$b */
    /* loaded from: classes.dex */
    public class b extends C8736pL2.b {
        public final HashMap<C8736pL2, Integer> e;

        public b(int i) {
            super(i);
            this.e = new HashMap<>();
        }

        @Override // o.C8736pL2.b
        public void b(C8736pL2 c8736pL2) {
            if (f(c8736pL2)) {
                this.e.remove(c8736pL2);
                for (int size = C7596kk2.this.b.size() - 1; size >= 0; size--) {
                    ((c) C7596kk2.this.b.get(size)).a();
                }
            }
        }

        @Override // o.C8736pL2.b
        public void c(C8736pL2 c8736pL2) {
            if (f(c8736pL2)) {
                for (int size = C7596kk2.this.b.size() - 1; size >= 0; size--) {
                    ((c) C7596kk2.this.b.get(size)).d();
                }
            }
        }

        @Override // o.C8736pL2.b
        public RL2 d(RL2 rl2, List<C8736pL2> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                C8736pL2 c8736pL2 = list.get(size);
                Integer num = this.e.get(c8736pL2);
                if (num != null) {
                    int intValue = num.intValue();
                    float a = c8736pL2.a();
                    if ((intValue & 1) != 0) {
                        rectF.left = a;
                    }
                    if ((intValue & 2) != 0) {
                        rectF.top = a;
                    }
                    if ((intValue & 4) != 0) {
                        rectF.right = a;
                    }
                    if ((intValue & 8) != 0) {
                        rectF.bottom = a;
                    }
                    i |= intValue;
                }
            }
            C9246rQ0 i2 = C7596kk2.this.i(rl2);
            for (int size2 = C7596kk2.this.b.size() - 1; size2 >= 0; size2--) {
                ((c) C7596kk2.this.b.get(size2)).c(i, i2, rectF);
            }
            return rl2;
        }

        @Override // o.C8736pL2.b
        public C8736pL2.a e(C8736pL2 c8736pL2, C8736pL2.a aVar) {
            int i;
            if (!f(c8736pL2)) {
                return aVar;
            }
            C9246rQ0 b = aVar.b();
            C9246rQ0 a = aVar.a();
            if (b.a != a.a) {
                i = 1;
            } else {
                i = 0;
            }
            if (b.b != a.b) {
                i |= 2;
            }
            if (b.c != a.c) {
                i |= 4;
            }
            if (b.d != a.d) {
                i |= 8;
            }
            this.e.put(c8736pL2, Integer.valueOf(i));
            return aVar;
        }

        public final boolean f(C8736pL2 c8736pL2) {
            if ((c8736pL2.f() & RL2.p.i()) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.kk2$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02);

        void c(int i, C9246rQ0 c9246rQ0, RectF rectF);

        void d();

        void e(int i);
    }

    public C7596kk2(ViewGroup viewGroup) {
        int i;
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        this.c = c9246rQ0;
        this.d = c9246rQ0;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        this.e = i;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.a = aVar;
        aVar.setWillNotDraw(true);
        C6516gH2.l2(aVar, new InterfaceC10336vu1() { // from class: o.ik2
            @Override // o.InterfaceC10336vu1
            public final RL2 a(View view, RL2 rl2) {
                return C7596kk2.b(C7596kk2.this, view, rl2);
            }
        });
        C6516gH2.I2(aVar, new b(0));
        viewGroup.addView(aVar, 0);
    }

    public static /* synthetic */ void a(C7596kk2 c7596kk2) {
        ViewParent parent = c7596kk2.a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c7596kk2.a);
        }
    }

    public static /* synthetic */ RL2 b(C7596kk2 c7596kk2, View view, RL2 rl2) {
        C9246rQ0 i = c7596kk2.i(rl2);
        C9246rQ0 j = c7596kk2.j(rl2);
        if (!i.equals(c7596kk2.c) || !j.equals(c7596kk2.d)) {
            c7596kk2.c = i;
            c7596kk2.d = j;
            for (int size = c7596kk2.b.size() - 1; size >= 0; size--) {
                c7596kk2.b.get(size).b(i, j);
            }
        }
        return rl2;
    }

    public void g(c cVar) {
        if (this.b.contains(cVar)) {
            return;
        }
        this.b.add(cVar);
        cVar.b(this.c, this.d);
        cVar.e(this.e);
    }

    public void h() {
        this.a.post(new Runnable() { // from class: o.jk2
            @Override // java.lang.Runnable
            public final void run() {
                C7596kk2.a(C7596kk2.this);
            }
        });
    }

    public final C9246rQ0 i(RL2 rl2) {
        return C9246rQ0.c(rl2.f(RL2.p.i()), rl2.f(RL2.p.l()));
    }

    public final C9246rQ0 j(RL2 rl2) {
        return C9246rQ0.c(rl2.g(RL2.p.i()), rl2.g(RL2.p.l()));
    }

    public boolean k() {
        return !this.b.isEmpty();
    }

    public void l(c cVar) {
        this.b.remove(cVar);
    }
}
