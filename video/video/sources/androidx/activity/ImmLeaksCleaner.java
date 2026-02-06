package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import java.lang.reflect.Field;
import o.C6562gT0;
import o.C9516sY;
import o.EY0;
import o.FA0;
import o.KZ0;
import o.WY0;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements i {
    public static final b Y = new b(null);
    public static final EY0<a> Z = WY0.b(new FA0() { // from class: o.JN0
        @Override // o.FA0
        public final Object invoke() {
            ImmLeaksCleaner.a c2;
            c2 = ImmLeaksCleaner.c();
            return c2;
        }
    });
    public final Activity X;

    /* loaded from: classes.dex */
    public static abstract class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public final a a() {
            return (a) ImmLeaksCleaner.Z.getValue();
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        public static final c a = new c();

        public c() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {
        public final Field a;
        public final Field b;
        public final Field c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Field field, Field field2, Field field3) {
            super(null);
            C6562gT0.p(field, "hField");
            C6562gT0.p(field2, "servedViewField");
            C6562gT0.p(field3, "nextServedViewField");
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            try {
                this.c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            try {
                return this.a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            C6562gT0.p(inputMethodManager, "<this>");
            try {
                return (View) this.b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        this.X = activity;
    }

    public static final a c() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            C6562gT0.m(declaredField3);
            C6562gT0.m(declaredField);
            C6562gT0.m(declaredField2);
            return new d(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return c.a;
        }
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_DESTROY) {
            Object systemService = this.X.getSystemService("input_method");
            C6562gT0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            a a2 = Y.a();
            Object b2 = a2.b(inputMethodManager);
            if (b2 != null) {
                synchronized (b2) {
                    View c2 = a2.c(inputMethodManager);
                    if (c2 == null) {
                        return;
                    }
                    if (c2.isAttachedToWindow()) {
                        return;
                    }
                    boolean a3 = a2.a(inputMethodManager);
                    if (a3) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }
}
