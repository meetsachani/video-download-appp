package o;

import android.graphics.Rect;
import android.util.Size;
import o.C8093mj;

/* loaded from: classes.dex */
public class TS1 {
    public final a a;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: o.TS1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0229a {
            public abstract a a();

            public abstract AbstractC0229a b(Rect rect);

            public abstract AbstractC0229a c(Size size);

            public abstract AbstractC0229a d(int i);
        }

        public abstract Rect a();

        public abstract Size b();

        public abstract int c();
    }

    public TS1(Size size, Rect rect, int i) {
        this.a = new C8093mj.b().c(size).b(rect).d(i).a();
    }

    public Rect a() {
        return this.a.a();
    }

    public Size b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
