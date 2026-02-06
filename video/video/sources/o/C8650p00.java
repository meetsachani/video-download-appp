package o;

import o.PV1;

/* renamed from: o.p00  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8650p00 implements PV1.a {
    @Override // o.PV1.a
    @InterfaceC11300zs1
    public PV1 a(OV1 ov1) {
        String str = (String) C9542sf.g(ov1.c.g1);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(C4128Rj1.i)) {
                    c = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(C4128Rj1.k)) {
                    c = 1;
                    break;
                }
                break;
            case -1606874997:
                if (str.equals(C4128Rj1.d0)) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(C4128Rj1.Q)) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(C4128Rj1.N)) {
                    c = 5;
                    break;
                }
                break;
            case 1187890754:
                if (str.equals(C4128Rj1.p)) {
                    c = 6;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 7;
                    break;
                }
                break;
            case 1503095341:
                if (str.equals(C4128Rj1.c0)) {
                    c = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals(C4128Rj1.a0)) {
                    c = '\t';
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = '\n';
                    break;
                }
                break;
            case 1599127257:
                if (str.equals(C4128Rj1.m)) {
                    c = 11;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(C4128Rj1.O)) {
                    c = '\f';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(C4128Rj1.P)) {
                    c = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new FV1(ov1);
            case 1:
                return new HV1(ov1);
            case 2:
            case '\b':
                return new CV1(ov1);
            case 3:
                if (ov1.e.equals(OV1.j)) {
                    return new IV1(ov1);
                }
                return new AV1(ov1);
            case 4:
                return new BV1(ov1);
            case 5:
            case '\f':
            case '\r':
                return new QV1(ov1);
            case 6:
                return new JV1(ov1);
            case 7:
                return new GV1(ov1);
            case '\t':
                return new KV1(ov1);
            case '\n':
                return new TV1(ov1);
            case 11:
                return new UV1(ov1);
            default:
                return null;
        }
    }
}
