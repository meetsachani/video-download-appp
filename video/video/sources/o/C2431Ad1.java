package o;

import android.util.Size;
import o.AbstractC4609Wh2;

/* renamed from: o.Ad1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2431Ad1 {
    public final C3738Nj0 a;

    public C2431Ad1() {
        this((C3738Nj0) X20.a(C3738Nj0.class));
    }

    public Size a(Size size) {
        Size d;
        C3738Nj0 c3738Nj0 = this.a;
        if (c3738Nj0 == null || (d = c3738Nj0.d(AbstractC4609Wh2.b.PRIV)) == null) {
            return size;
        }
        if (d.getWidth() * d.getHeight() > size.getWidth() * size.getHeight()) {
            return d;
        }
        return size;
    }

    public C2431Ad1(C3738Nj0 c3738Nj0) {
        this.a = c3738Nj0;
    }
}
