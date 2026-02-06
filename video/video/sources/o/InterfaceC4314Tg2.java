package o;

@Deprecated
/* renamed from: o.Tg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4314Tg2 {
    public static final InterfaceC4314Tg2 a = new a();

    /* renamed from: o.Tg2$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC4314Tg2 {
        @Override // o.InterfaceC4314Tg2
        public boolean a(C10833xx0 c10833xx0) {
            String str = c10833xx0.g1;
            if (!C4128Rj1.m0.equals(str) && !C4128Rj1.n0.equals(str) && !C4128Rj1.A0.equals(str) && !C4128Rj1.C0.equals(str) && !C4128Rj1.z0.equals(str) && !C4128Rj1.B0.equals(str) && !C4128Rj1.x0.equals(str) && !C4128Rj1.D0.equals(str) && !C4128Rj1.y0.equals(str) && !C4128Rj1.K0.equals(str) && !C4128Rj1.G0.equals(str) && !C4128Rj1.o0.equals(str)) {
                return false;
            }
            return true;
        }

        @Override // o.InterfaceC4314Tg2
        public InterfaceC4117Rg2 b(C10833xx0 c10833xx0) {
            String str = c10833xx0.g1;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals(C4128Rj1.K0)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals(C4128Rj1.G0)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals(C4128Rj1.C0)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals(C4128Rj1.m0)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals(C4128Rj1.B0)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals(C4128Rj1.n0)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals(C4128Rj1.D0)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals(C4128Rj1.o0)) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals(C4128Rj1.x0)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals(C4128Rj1.y0)) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals(C4128Rj1.z0)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals(C4128Rj1.A0)) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C9903u80(c10833xx0.i1);
                    case 1:
                        return new QC1();
                    case 2:
                        return new C2757Dl1();
                    case 3:
                        return new AK2();
                    case 4:
                        return new C7640kv2(c10833xx0.i1);
                    case 5:
                        return new C10015ub2(c10833xx0.i1);
                    case 6:
                    case '\b':
                        return new C3307Iz(str, c10833xx0.y1, C3307Iz.A);
                    case 7:
                        return new C7101ii0();
                    case '\t':
                        return new C3503Kz(c10833xx0.y1, c10833xx0.i1);
                    case '\n':
                        return new C11253zg2();
                    case 11:
                        return new C5202av2();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C10833xx0 c10833xx0);

    InterfaceC4117Rg2 b(C10833xx0 c10833xx0);
}
