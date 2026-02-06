package o;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import o.RC;

/* loaded from: classes3.dex */
public interface UC extends RC.a {

    /* loaded from: classes3.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        public final e a = new e();

        @Override // android.animation.TypeEvaluator
        @InterfaceC5670cr1
        /* renamed from: a */
        public e evaluate(float f, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 e eVar2) {
            this.a.b(C8801pd1.g(eVar.a, eVar2.a, f), C8801pd1.g(eVar.b, eVar2.b, f), C8801pd1.g(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends Property<UC, e> {
        public static final Property<UC, e> a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @InterfaceC11300zs1
        /* renamed from: a */
        public e get(@InterfaceC5670cr1 UC uc) {
            return uc.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 UC uc, @InterfaceC11300zs1 e eVar) {
            uc.setRevealInfo(eVar);
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends Property<UC, Integer> {
        public static final Property<UC, Integer> a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @InterfaceC5670cr1
        /* renamed from: a */
        public Integer get(@InterfaceC5670cr1 UC uc) {
            return Integer.valueOf(uc.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 UC uc, @InterfaceC5670cr1 Integer num) {
            uc.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        public static final float d = Float.MAX_VALUE;
        public float a;
        public float b;
        public float c;

        public boolean a() {
            if (this.c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public void c(@InterfaceC5670cr1 e eVar) {
            b(eVar.a, eVar.b, eVar.c);
        }

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public e(@InterfaceC5670cr1 e eVar) {
            this(eVar.a, eVar.b, eVar.c);
        }
    }

    void a();

    void b();

    void draw(Canvas canvas);

    @InterfaceC11300zs1
    Drawable getCircularRevealOverlayDrawable();

    @JF
    int getCircularRevealScrimColor();

    @InterfaceC11300zs1
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@InterfaceC11300zs1 Drawable drawable);

    void setCircularRevealScrimColor(@JF int i);

    void setRevealInfo(@InterfaceC11300zs1 e eVar);
}
