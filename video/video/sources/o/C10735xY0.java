package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: o.xY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10735xY0 {
    public static final String a = "LayoutInflaterCompatHC";
    public static Field b;
    public static boolean c;

    /* renamed from: o.xY0$a */
    /* loaded from: classes.dex */
    public static class a implements LayoutInflater.Factory2 {
        public final InterfaceC10978yY0 X;

        public a(InterfaceC10978yY0 interfaceC10978yY0) {
            this.X = interfaceC10978yY0;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.X.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.X + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.X.onCreateView(view, str, context, attributeSet);
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    public static InterfaceC10978yY0 b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).X;
        }
        return null;
    }

    @Deprecated
    public static void c(LayoutInflater layoutInflater, InterfaceC10978yY0 interfaceC10978yY0) {
        layoutInflater.setFactory2(new a(interfaceC10978yY0));
    }

    public static void d(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
