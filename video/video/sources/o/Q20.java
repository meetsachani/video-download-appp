package o;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public final class Q20 implements InterfaceC8368nr {
    public static final int Z0 = 0;
    public static final int a1 = 1;
    public static final Q20 b1 = new b(0).e();
    public static final String c1 = TD2.R0(0);
    public static final String d1 = TD2.R0(1);
    public static final String e1 = TD2.R0(2);
    public static final String f1 = TD2.R0(3);
    public static final InterfaceC8368nr.a<Q20> g1 = new InterfaceC8368nr.a() { // from class: o.P20
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return Q20.a(bundle);
        }
    };
    public final int X;
    @BR0(from = 0)
    public final int Y;
    @InterfaceC11300zs1
    public final String Y0;
    @BR0(from = 0)
    public final int Z;

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public int b;
        public int c;
        @InterfaceC11300zs1
        public String d;

        public b(int i) {
            this.a = i;
        }

        public Q20 e() {
            boolean z;
            if (this.b <= this.c) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            return new Q20(this);
        }

        @InterfaceC6181ey
        public b f(@BR0(from = 0) int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public b g(@BR0(from = 0) int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public b h(@InterfaceC11300zs1 String str) {
            boolean z;
            if (this.a == 0 && str != null) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.a(z);
            this.d = str;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    public static /* synthetic */ Q20 a(Bundle bundle) {
        int i = bundle.getInt(c1, 0);
        int i2 = bundle.getInt(d1, 0);
        int i3 = bundle.getInt(e1, 0);
        return new b(i).g(i2).f(i3).h(bundle.getString(f1)).e();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        int i = this.X;
        if (i != 0) {
            bundle.putInt(c1, i);
        }
        int i2 = this.Y;
        if (i2 != 0) {
            bundle.putInt(d1, i2);
        }
        int i3 = this.Z;
        if (i3 != 0) {
            bundle.putInt(e1, i3);
        }
        String str = this.Y0;
        if (str != null) {
            bundle.putString(f1, str);
        }
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q20)) {
            return false;
        }
        Q20 q20 = (Q20) obj;
        if (this.X == q20.X && this.Y == q20.Y && this.Z == q20.Z && TD2.g(this.Y0, q20.Y0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (((((527 + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
        String str = this.Y0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    @Deprecated
    public Q20(int i, @BR0(from = 0) int i2, @BR0(from = 0) int i3) {
        this(new b(i).g(i2).f(i3));
    }

    public Q20(b bVar) {
        this.X = bVar.a;
        this.Y = bVar.b;
        this.Z = bVar.c;
        this.Y0 = bVar.d;
    }
}
