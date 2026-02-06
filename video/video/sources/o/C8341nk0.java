package o;

@ES1(21)
/* renamed from: o.nk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8341nk0 {
    public static final InterfaceC7594kk0 a = new a();
    public static final InterfaceC7594kk0 b = new b();
    public static final InterfaceC7594kk0 c = new c();
    public static final InterfaceC7594kk0 d = new d();

    /* renamed from: o.nk0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC7594kk0 {
        @Override // o.InterfaceC7594kk0
        public C8585ok0 a(float f, float f2, float f3, float f4) {
            return C8585ok0.a(255, C2997Ft2.o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: o.nk0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC7594kk0 {
        @Override // o.InterfaceC7594kk0
        public C8585ok0 a(float f, float f2, float f3, float f4) {
            return C8585ok0.b(C2997Ft2.o(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: o.nk0$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC7594kk0 {
        @Override // o.InterfaceC7594kk0
        public C8585ok0 a(float f, float f2, float f3, float f4) {
            return C8585ok0.b(C2997Ft2.o(255, 0, f2, f3, f), C2997Ft2.o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: o.nk0$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC7594kk0 {
        @Override // o.InterfaceC7594kk0
        public C8585ok0 a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C8585ok0.b(C2997Ft2.o(255, 0, f2, f5, f), C2997Ft2.o(0, 255, f5, f3, f));
        }
    }

    public static InterfaceC7594kk0 a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return c;
            } else if (z) {
                return b;
            } else {
                return a;
            }
        } else if (z) {
            return a;
        } else {
            return b;
        }
    }
}
