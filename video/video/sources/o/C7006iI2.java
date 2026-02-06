package o;

import android.view.ViewStructure;

/* renamed from: o.iI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7006iI2 {
    public final Object a;

    /* renamed from: o.iI2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        public static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public C7006iI2(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public static C7006iI2 f(ViewStructure viewStructure) {
        return new C7006iI2(viewStructure);
    }

    public void a(String str) {
        a.a((ViewStructure) this.a, str);
    }

    public void b(CharSequence charSequence) {
        a.b((ViewStructure) this.a, charSequence);
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        a.c((ViewStructure) this.a, i, i2, i3, i4, i5, i6);
    }

    public void d(CharSequence charSequence) {
        a.d((ViewStructure) this.a, charSequence);
    }

    public ViewStructure e() {
        return (ViewStructure) this.a;
    }
}
