package o;

import android.media.AudioAttributes;
import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.sg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9546sg implements InterfaceC8368nr {
    public static final C9546sg b1 = new e().a();
    public static final String c1 = TD2.R0(0);
    public static final String d1 = TD2.R0(1);
    public static final String e1 = TD2.R0(2);
    public static final String f1 = TD2.R0(3);
    public static final String g1 = TD2.R0(4);
    public static final InterfaceC8368nr.a<C9546sg> h1 = new InterfaceC8368nr.a() { // from class: o.rg
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C9546sg.a(bundle);
        }
    };
    public final int X;
    public final int Y;
    public final int Y0;
    public final int Z;
    public final int Z0;
    @InterfaceC11300zs1
    public d a1;

    @ES1(29)
    /* renamed from: o.sg$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static void a(AudioAttributes.Builder builder, int i) {
            C9789tg.a(builder, i);
        }
    }

    @ES1(32)
    /* renamed from: o.sg$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @K40
        public static void a(AudioAttributes.Builder builder, int i) {
            C10032ug.a(builder, i);
        }
    }

    @ES1(21)
    /* renamed from: o.sg$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final AudioAttributes a;

        public d(C9546sg c9546sg) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c9546sg.X).setFlags(c9546sg.Y).setUsage(c9546sg.Z);
            int i = TD2.a;
            if (i >= 29) {
                b.a(usage, c9546sg.Y0);
            }
            if (i >= 32) {
                c.a(usage, c9546sg.Z0);
            }
            this.a = usage.build();
        }
    }

    /* renamed from: o.sg$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public int a = 0;
        public int b = 0;
        public int c = 1;
        public int d = 1;
        public int e = 0;

        public C9546sg a() {
            return new C9546sg(this.a, this.b, this.c, this.d, this.e);
        }

        @InterfaceC6181ey
        public e b(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC6181ey
        public e c(int i) {
            this.a = i;
            return this;
        }

        @InterfaceC6181ey
        public e d(int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public e e(int i) {
            this.e = i;
            return this;
        }

        @InterfaceC6181ey
        public e f(int i) {
            this.c = i;
            return this;
        }
    }

    public static /* synthetic */ C9546sg a(Bundle bundle) {
        e eVar = new e();
        String str = c1;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = d1;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = e1;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = f1;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = g1;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    @ES1(21)
    public d b() {
        if (this.a1 == null) {
            this.a1 = new d();
        }
        return this.a1;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1, this.X);
        bundle.putInt(d1, this.Y);
        bundle.putInt(e1, this.Z);
        bundle.putInt(f1, this.Y0);
        bundle.putInt(g1, this.Z0);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9546sg.class == obj.getClass()) {
            C9546sg c9546sg = (C9546sg) obj;
            if (this.X == c9546sg.X && this.Y == c9546sg.Y && this.Z == c9546sg.Z && this.Y0 == c9546sg.Y0 && this.Z0 == c9546sg.Z0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.Y0) * 31) + this.Z0;
    }

    public C9546sg(int i, int i2, int i3, int i4, int i5) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = i4;
        this.Z0 = i5;
    }
}
