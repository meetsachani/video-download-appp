package o;

import java.io.IOException;

/* renamed from: o.Js1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3384Js1 extends AbstractC8387nv2<Number> {
    public static final InterfaceC8631ov2 b = k(EnumC3862Op2.Y);
    public final InterfaceC3959Pp2 a;

    /* renamed from: o.Js1$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        public a() {
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() == Number.class) {
                return C3384Js1.this;
            }
            return null;
        }
    }

    /* renamed from: o.Js1$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[XV0.values().length];
            a = iArr;
            try {
                iArr[XV0.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[XV0.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[XV0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3384Js1(InterfaceC3959Pp2 interfaceC3959Pp2) {
        this.a = interfaceC3959Pp2;
    }

    public static InterfaceC8631ov2 j(InterfaceC3959Pp2 interfaceC3959Pp2) {
        if (interfaceC3959Pp2 == EnumC3862Op2.Y) {
            return b;
        }
        return k(interfaceC3959Pp2);
    }

    public static InterfaceC8631ov2 k(InterfaceC3959Pp2 interfaceC3959Pp2) {
        return new a();
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: l */
    public Number e(OV0 ov0) throws IOException {
        XV0 I = ov0.I();
        int i = b.a[I.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new WV0("Expecting number, got: " + I + "; at path " + ov0.Y());
            }
            return this.a.e(ov0);
        }
        ov0.E();
        return null;
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: m */
    public void i(C5589cW0 c5589cW0, Number number) throws IOException {
        c5589cW0.Q(number);
    }
}
