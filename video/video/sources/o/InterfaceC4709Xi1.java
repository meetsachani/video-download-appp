package o;

@Deprecated
/* renamed from: o.Xi1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4709Xi1 {
    public static final InterfaceC4709Xi1 a = new a();

    /* renamed from: o.Xi1$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC4709Xi1 {
        @Override // o.InterfaceC4709Xi1
        public boolean a(C10833xx0 c10833xx0) {
            String str = c10833xx0.g1;
            if (!C4128Rj1.w0.equals(str) && !C4128Rj1.J0.equals(str) && !C4128Rj1.H0.equals(str) && !C4128Rj1.M0.equals(str) && !C4128Rj1.N0.equals(str)) {
                return false;
            }
            return true;
        }

        @Override // o.InterfaceC4709Xi1
        public InterfaceC4612Wi1 b(C10833xx0 c10833xx0) {
            String str = c10833xx0.g1;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals(C4128Rj1.N0)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals(C4128Rj1.M0)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals(C4128Rj1.w0)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals(C4128Rj1.J0)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals(C4128Rj1.H0)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C8069md();
                    case 1:
                        return new GL0();
                    case 2:
                        return new KL0();
                    case 3:
                        return new C3913Pe0();
                    case 4:
                        return new C4290Ta2();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C10833xx0 c10833xx0);

    InterfaceC4612Wi1 b(C10833xx0 c10833xx0);
}
