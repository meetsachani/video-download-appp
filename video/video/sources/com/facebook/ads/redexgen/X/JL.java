package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C8077mf;
import o.OZ1;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class JL {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C1919kp A05;
    public static final C1919kp A06;
    public int A01;
    public final List<JI> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{C3307Iz.e0, 10, C8077mf.u, 5, 8, 13, 0, 68, 55, C3307Iz.V, 34, 68, 10, 5, 9, 1, 56, 7, 4, 28, C3307Iz.Y, 4, 31, 2, 4, 5, 52, 47, 10, 31, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, QC1.w, 125, 104, Byte.MAX_VALUE, 82, 94, 97, 98, 122, 64, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, C8077mf.x, 17, 4, 19, 62, 50, 13, C8077mf.p, C8077mf.z, C3307Iz.d0, C8077mf.p, C8077mf.y, 8, C8077mf.p, C8077mf.q, 62, C3307Iz.X, 4, 7, 13, 8, 2, 10, 4, 19, 8, C8077mf.q, 6, 62, C3307Iz.f0, C8077mf.q, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC2033ms interfaceC2033ms, List<Metadata.Entry> list) throws IOException {
        long A8n = interfaceC2033ms.A8n();
        int A8O = (int) ((interfaceC2033ms.A8O() - interfaceC2033ms.A8n()) - this.A01);
        C04774v c04774v = new C04774v(A8O);
        interfaceC2033ms.readFully(c04774v.A0l(), 0, A8O);
        for (int i = 0; i < this.A02.size(); i++) {
            JI ji = this.A02.get(i);
            c04774v.A0f((int) (ji.A02 - A8n));
            c04774v.A0g(4);
            int A0E = c04774v.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int A00 = A00(c04774v.A0W(A0E));
            int i2 = ji.A01 - (A0E + 8);
            switch (A00) {
                case OZ1.h /* 2192 */:
                    list.add(A01(c04774v, i2));
                    break;
                case OZ1.i /* 2816 */:
                case OZ1.j /* 2817 */:
                case OZ1.k /* 2819 */:
                case OZ1.l /* 2820 */:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C1919kp.A02(':');
        A05 = C1919kp.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) throws C3K {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals(A02(16, 15, 81))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332107749:
                if (str.equals(A02(104, 26, 40))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1251387154:
                if (str.equals(A02(51, 21, 55))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -830665521:
                if (str.equals(A02(72, 32, 91))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1760745220:
                if (str.equals(A02(31, 20, 52))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return OZ1.h;
            case 1:
                return OZ1.i;
            case 2:
                return OZ1.j;
            case 3:
                return OZ1.k;
            case 4:
                return OZ1.l;
            default:
                throw C3K.A01(A02(0, 16, 94), null);
        }
    }

    public static SlowMotionData A01(C04774v c04774v, int i) throws C3K {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c04774v.A0W(i);
        List<String> A062 = A05.A06(dataString);
        for (int i2 = 0; i2 < A062.size(); i2++) {
            List<String> A063 = A06.A06(A062.get(i2));
            if (A063.size() == 3) {
                try {
                    long parseLong = Long.parseLong(A063.get(0));
                    long startTimeMs = Long.parseLong(A063.get(1));
                    segments.add(new SlowMotionData.Segment(parseLong, startTimeMs, 1 << (Integer.parseInt(A063.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C3K.A01(null, e);
                }
            } else {
                throw C3K.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        C04774v c04774v = new C04774v(8);
        interfaceC2033ms.readFully(c04774v.A0l(), 0, 8);
        this.A01 = c04774v.A0E() + 8;
        if (c04774v.A0C() != 1397048916) {
            hv.A00 = 0L;
            return;
        }
        hv.A00 = interfaceC2033ms.A8n() - (this.A01 - 12);
        this.A00 = 2;
    }

    private void A05(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        long A8O = interfaceC2033ms.A8O();
        int i = (this.A01 - 12) - 8;
        C04774v c04774v = new C04774v(i);
        interfaceC2033ms.readFully(c04774v.A0l(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c04774v.A0g(2);
            int i3 = c04774v.A0a();
            switch (i3) {
                case OZ1.h /* 2192 */:
                case OZ1.i /* 2816 */:
                case OZ1.j /* 2817 */:
                case OZ1.k /* 2819 */:
                case OZ1.l /* 2820 */:
                    long streamLength = this.A01;
                    long j = A8O - streamLength;
                    long streamLength2 = c04774v.A0E();
                    int size = c04774v.A0E();
                    this.A02.add(new JI(i3, j - streamLength2, size));
                    break;
                default:
                    c04774v.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            hv.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        hv.A00 = streamLength3;
    }

    public final int A07(InterfaceC2033ms interfaceC2033ms, HV hv, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j = 0;
        switch (this.A00) {
            case 0:
                long A8O = interfaceC2033ms.A8O();
                if (A8O != -1 && A8O >= 8) {
                    j = A8O - 8;
                }
                hv.A00 = j;
                this.A00 = 1;
                break;
            case 1:
                A04(interfaceC2033ms, hv);
                break;
            case 2:
                A05(interfaceC2033ms, hv);
                break;
            case 3:
                A06(interfaceC2033ms, slowMotionMetadataEntries);
                hv.A00 = 0L;
                break;
            default:
                throw new IllegalStateException();
        }
        return 1;
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
