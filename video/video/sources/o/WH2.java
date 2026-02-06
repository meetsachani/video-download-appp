package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Arrays;
import o.C6196f11;

/* loaded from: classes.dex */
public class WH2<T> implements C6196f11.b<T>, U82 {
    public int[] a;
    public a b;

    public WH2() {
    }

    @Override // o.C6196f11.b
    public int[] a(T t, int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(View view) {
        if (this.a == null && this.b == null) {
            a aVar = new a(view);
            this.b = aVar;
            aVar.h(this);
        }
    }

    @Override // o.U82
    public void d(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = null;
    }

    public WH2(View view) {
        a aVar = new a(view);
        this.b = aVar;
        aVar.h(this);
    }

    /* loaded from: classes.dex */
    public static final class a extends OT<View, Object> {
        public a(View view) {
            super(view);
        }

        @Override // o.OT
        public void g(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void m(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void o(Object obj, InterfaceC8136mt2<? super Object> interfaceC8136mt2) {
        }
    }
}
