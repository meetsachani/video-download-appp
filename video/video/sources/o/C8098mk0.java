package o;

/* renamed from: o.mk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8098mk0 {
    public static final InterfaceC7837lk0 a = new a();
    public static final InterfaceC7837lk0 b = new b();
    public static final InterfaceC7837lk0 c = new c();
    public static final InterfaceC7837lk0 d = new d();

    /* renamed from: o.mk0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC7837lk0 {
        @Override // o.InterfaceC7837lk0
        public C8828pk0 a(float f, float f2, float f3, float f4) {
            return C8828pk0.a(255, C3095Gt2.o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: o.mk0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC7837lk0 {
        @Override // o.InterfaceC7837lk0
        public C8828pk0 a(float f, float f2, float f3, float f4) {
            return C8828pk0.b(C3095Gt2.o(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: o.mk0$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC7837lk0 {
        @Override // o.InterfaceC7837lk0
        public C8828pk0 a(float f, float f2, float f3, float f4) {
            return C8828pk0.b(C3095Gt2.o(255, 0, f2, f3, f), C3095Gt2.o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: o.mk0$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC7837lk0 {
        @Override // o.InterfaceC7837lk0
        public C8828pk0 a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C8828pk0.b(C3095Gt2.o(255, 0, f2, f5, f), C3095Gt2.o(0, 255, f5, f3, f));
        }
    }

    public static InterfaceC7837lk0 a(int i, boolean z) {
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
