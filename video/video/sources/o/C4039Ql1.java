package o;

import java.util.Map;

/* renamed from: o.Ql1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4039Ql1 implements ON2 {

    /* renamed from: o.Ql1$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3839Ok.values().length];
            a = iArr;
            try {
                iArr[EnumC3839Ok.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC3839Ok.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC3839Ok.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC3839Ok.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC3839Ok.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC3839Ok.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC3839Ok.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC3839Ok.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC3839Ok.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC3839Ok.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC3839Ok.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[EnumC3839Ok.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[EnumC3839Ok.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        ON2 c5984e90;
        switch (a.a[enumC3839Ok.ordinal()]) {
            case 1:
                c5984e90 = new C5984e90();
                break;
            case 2:
                c5984e90 = new Lx2();
                break;
            case 3:
                c5984e90 = new C5499c90();
                break;
            case 4:
                c5984e90 = new Ex2();
                break;
            case 5:
                c5984e90 = new XK1();
                break;
            case 6:
                c5984e90 = new EE();
                break;
            case 7:
                c5984e90 = new GE();
                break;
            case 8:
                c5984e90 = new CE();
                break;
            case 9:
                c5984e90 = new C10198vL0();
                break;
            case 10:
                c5984e90 = new C10591wx1();
                break;
            case 11:
                c5984e90 = new AE();
                break;
            case 12:
                c5984e90 = new C11208zU();
                break;
            case 13:
                c5984e90 = new C5883dk();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC3839Ok)));
        }
        return c5984e90.a(str, enumC3839Ok, i, i2, map);
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) throws PN2 {
        return a(str, enumC3839Ok, i, i2, null);
    }
}
