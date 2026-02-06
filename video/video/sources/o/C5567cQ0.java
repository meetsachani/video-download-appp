package o;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: o.cQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5567cQ0 {
    public final d a;

    /* renamed from: o.cQ0$b */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }

        @Override // o.C5567cQ0.a, o.C5567cQ0.d
        public boolean b() {
            return ((InputConfiguration) a()).isMultiResolution();
        }

        public b(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    /* renamed from: o.cQ0$c */
    /* loaded from: classes.dex */
    public static final class c implements d {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // o.C5567cQ0.d
        public Object a() {
            return null;
        }

        @Override // o.C5567cQ0.d
        public boolean b() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.getWidth() != this.a || cVar.getHeight() != this.b || cVar.getFormat() != this.c) {
                return false;
            }
            return true;
        }

        @Override // o.C5567cQ0.d
        public int getFormat() {
            return this.c;
        }

        @Override // o.C5567cQ0.d
        public int getHeight() {
            return this.b;
        }

        @Override // o.C5567cQ0.d
        public int getWidth() {
            return this.a;
        }

        public int hashCode() {
            int i = 31 ^ this.a;
            int i2 = this.b ^ ((i << 5) - i);
            return this.c ^ ((i2 << 5) - i2);
        }

        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }
    }

    /* renamed from: o.cQ0$d */
    /* loaded from: classes.dex */
    public interface d {
        Object a();

        boolean b();

        int getFormat();

        int getHeight();

        int getWidth();
    }

    public C5567cQ0(int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.a = new b(i, i2, i3);
        } else {
            this.a = new a(i, i2, i3);
        }
    }

    public static C5567cQ0 f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new C5567cQ0(new b(obj));
        }
        return new C5567cQ0(new a(obj));
    }

    public int a() {
        return this.a.getFormat();
    }

    public int b() {
        return this.a.getHeight();
    }

    public int c() {
        return this.a.getWidth();
    }

    public boolean d() {
        return this.a.b();
    }

    public Object e() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5567cQ0)) {
            return false;
        }
        return this.a.equals(((C5567cQ0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    /* renamed from: o.cQ0$a */
    /* loaded from: classes.dex */
    public static class a implements d {
        public final InputConfiguration a;

        public a(Object obj) {
            this.a = (InputConfiguration) obj;
        }

        @Override // o.C5567cQ0.d
        public Object a() {
            return this.a;
        }

        @Override // o.C5567cQ0.d
        public boolean b() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            return Objects.equals(this.a, ((d) obj).a());
        }

        @Override // o.C5567cQ0.d
        public int getFormat() {
            return this.a.getFormat();
        }

        @Override // o.C5567cQ0.d
        public int getHeight() {
            return this.a.getHeight();
        }

        @Override // o.C5567cQ0.d
        public int getWidth() {
            return this.a.getWidth();
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a.toString();
        }

        public a(int i, int i2, int i3) {
            this(new InputConfiguration(i, i2, i3));
        }
    }

    public C5567cQ0(d dVar) {
        this.a = dVar;
    }
}
