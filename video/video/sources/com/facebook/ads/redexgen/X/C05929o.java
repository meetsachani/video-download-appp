package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.9o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05929o {
    public static byte[] A08;
    public static String[] A09 = {"634gowWrnODsCbHJW3RM2adSB8UjvpNK", "SJrAWOr70TCHX", "EwIuJu9eGNp0k", "E6EVZDT", "sHeITXs", "FXQ6HdUX", "YL7g5rxYaYN1DF5ZV43is2fGGs0zV37S", "j2oNEgxbTlE4krYsb5twTfwtoUHd8Sk9"};
    public DC A02;
    public String A05;
    public final C5Y A06;
    public final Object A07;
    public A6 A01 = A3.A01();
    public FF A03 = new C2049n9();
    public int A00 = 1048576;
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC1923ku<InterfaceExecutorC0727Fb> A04 = new InterfaceC1923ku() { // from class: com.facebook.ads.redexgen.X.nj
        @Override // com.facebook.ads.redexgen.X.InterfaceC1923ku
        public final Object get() {
            return C05929o.A01();
        }
    };

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[7].charAt(23) != 't') {
                throw new RuntimeException();
            }
            A09[4] = "2gbF6ls";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A03() {
        A08 = new byte[]{C8077mf.x, 35, 35, 62, 35, 113, 56, ED2.a, 34, C3307Iz.X, 48, ED2.a, C3307Iz.X, 56, 48, C3307Iz.X, 56, ED2.a, 54, 113, C8077mf.y, 52, 55, 48, 36, C4715Xk.i, C3307Iz.X, C8077mf.x, C3307Iz.a0, C3307Iz.X, 35, 48, 50, C3307Iz.X, 62, 35, 34, C8077mf.A, 48, 50, C3307Iz.X, 62, 35, 40, 106, 102, 100, C3307Iz.Z, 111, 104, 106, 108, 107, 102, 102, 98, C3307Iz.Z, 104, 109, 122, C3307Iz.Z, 104, 103, 109, 123, 102, 96, 109, 113, C3307Iz.Z, 100, 108, 109, 96, 104, 58, C3307Iz.Z, 108, 113, 125, 123, 104, 106, 125, 102, 123, C3307Iz.Z, 77, 108, 111, 104, 124, 101, 125, 76, 113, 125, 123, 104, 106, 125, 102, 123, 122, 79, 104, 106, 125, 102, 123, 112};
    }

    static {
        A03();
    }

    public C05929o(C5Y c5y) {
        this.A06 = c5y;
    }

    public static /* synthetic */ C2096nu A00(HD hd, C8O c8o) {
        return new C2096nu(hd);
    }

    public static /* synthetic */ InterfaceExecutorC0727Fb A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final C05919n A04(Uri uri) {
        String A02 = A02(0, 44, 75);
        if (this.A02 == null) {
            try {
                final HD hd = (HD) Class.forName(A02(44, 67, 19)).asSubclass(HD.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                this.A02 = new DC() { // from class: com.facebook.ads.redexgen.X.nl
                    @Override // com.facebook.ads.redexgen.X.DC
                    public final DD A5X(C8O c8o) {
                        return C05929o.A00(HD.this, c8o);
                    }
                };
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(A02, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(A02, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(A02, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(A02, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(A02, e5);
            }
        }
        return new C05919n(new C04262u().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
