package o;

import o.InterfaceC6986iD2;

/* renamed from: o.jm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7361jm2 {

    /* renamed from: o.jm2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC6986iD2.b.values().length];
            a = iArr;
            try {
                iArr[InterfaceC6986iD2.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC6986iD2.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InterfaceC6986iD2.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InterfaceC6986iD2.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InterfaceC6986iD2.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(InterfaceC6986iD2.b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return 1;
            }
            return 3;
        } else if (i != 2) {
            return 2;
        } else {
            return 5;
        }
    }

    public static int b(InterfaceC6986iD2.b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return 1;
            }
            return 3;
        } else if (i != 2) {
            return 1;
        } else {
            return 5;
        }
    }
}
